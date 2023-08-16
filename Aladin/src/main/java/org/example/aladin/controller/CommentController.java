package org.example.aladin.controller;

import org.example.aladin.model.Comment;
import org.example.aladin.service.CommentService;
import org.example.aladin.service.ItemService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/comment")
public class CommentController extends HttpServlet {

    private CommentService commentService;
    private ItemService itemService;

    private EntityManager entityManager;

    @Override
    public void init() throws ServletException {
        super.init();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        this.entityManager = emf.createEntityManager();
        this.commentService = new CommentService(entityManager);
        this.itemService = new ItemService(entityManager);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Long itemId = Long.parseLong(request.getParameter("itemId"));
        String content = request.getParameter("content");

        Comment comment = new Comment();
        comment.setContent(content);
        comment.setCreatedAt(new Date());

        // 상품 정보 가져오기
        comment.setItem(itemService.findItemById(itemId));

        // 댓글 저장
        commentService.saveComment(comment);

        // 상품 상세 페이지로 이동
        response.sendRedirect("./items/" + itemId);
    }
}
