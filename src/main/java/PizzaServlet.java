import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza.jsp").forward(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("crust"));
        System.out.println(req.getParameter("sauce"));
        System.out.println(req.getParameter("size"));
        String[] toppings = req.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.println(topping);
            System.out.println(" ");
        }
        System.out.println(req.getParameter("addy"));

    }

}

