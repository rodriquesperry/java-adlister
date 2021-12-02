import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pickcolor.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {
        System.out.println(req.getParameter("colorChoice"));
        String color = req.getParameter("colorChoice");
        req.getSession().setAttribute("color", color);
        res.sendRedirect("/viewcolor");
    }

}
