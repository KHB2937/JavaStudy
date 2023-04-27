package org.example.aladin.controller;

import org.example.aladin.model.Item;
import org.example.aladin.service.ItemService;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/items/*")
public class ItemController extends HttpServlet {

    private static final int DEFAULT_PAGE = 1;
    private static final int DEFAULT_SIZE = 10;

    private ItemService itemService;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void init() throws ServletException {
        super.init();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        this.entityManager = emf.createEntityManager();
        this.itemService = new ItemService(entityManager);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // URL에서 id 파라미터 추출
        String idParam = request.getPathInfo();
        Long id = (idParam != null && !idParam.isEmpty()) ? Long.parseLong(idParam.substring(1)) : null;

        if (id != null) {
            // id가 존재하면 해당 아이템 상세 페이지로 이동
            Item item = itemService.findItemById(id);
            request.setAttribute("item", item);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/detail.jsp");
            dispatcher.forward(request, response);
        } else {
            // id가 존재하지 않으면 아이템 리스트 페이지로 이동
            // 페이지 번호 파라미터 처리
            String pageParam = request.getParameter("page");
            int page = (pageParam != null) ? Integer.parseInt(pageParam) : DEFAULT_PAGE;

            // 페이지 크기 파라미터 처리
            String sizeParam = request.getParameter("size");
            int size = (sizeParam != null) ? Integer.parseInt(sizeParam) : DEFAULT_SIZE;

            // 전체 아이템 개수와 전체 페이지 수 계산
            long totalItems = itemService.countItems();
            int totalPages = (int) Math.ceil((double) totalItems / size);

            // 현재 페이지에서 보여줄 아이템 리스트 조회
            List<Item> items = itemService.findItemsByPage(page, size);

            // JSP로 데이터 전달
            request.setAttribute("items", items);
            request.setAttribute("currentPage", page);
            request.setAttribute("totalPages", totalPages);

            // JSP로 포워딩
            RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
            dispatcher.forward(request, response);
        }

    }
}

