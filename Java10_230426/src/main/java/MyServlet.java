import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EntityManagerFactory emf;

    @Override
    public void init() throws ServletException {
//        super.init();
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createQuery("SELECT s FROM Student s", Student.class);
        List<Student> studentList = query.getResultList();

        em.getTransaction().commit();

        em.close();

        req.setAttribute("personList", studentList);

        RequestDispatcher rd = req.getRequestDispatcher("/list.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Student student = new Student(name, age);
        em.persist(student);

        em.getTransaction().commit();

        em.close();

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Servlet Response</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello " + name + "!</h1>");
        out.println("<p>Your name has been saved to the database.</p>");
        out.println("<a href=\"./\">Go back to the home page</a>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void destroy() {
        emf.close();
    }
}
