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
        String pizzaCrust = req.getParameter("crust");

        String pizzaSauce = req.getParameter("sauce");
        String pizzaSize = req.getParameter("size");
        String[] toppings = req.getParameterValues("toppings");

        String address = req.getParameter("addy");

        req.setAttribute("crust", pizzaCrust);
        req.setAttribute("sauce", pizzaSauce);
        req.setAttribute("size", pizzaSize);
        req.setAttribute("toppings", toppings);
        req.setAttribute("addy", address);

        req.getRequestDispatcher("/pizza.jsp").forward(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Pizza pizza = new Pizza();
        String pizzaCrust = req.getParameter("crust");

        String pizzaSauce = req.getParameter("sauce");

        String pizzaSize = req.getParameter("size");

        String[] toppings = req.getParameterValues("toppings");

        pizza.setPizzaCrust(pizzaCrust);
        pizza.setPizzaSauce(pizzaSauce);
        pizza.setPizzaSize(pizzaSize);
        pizza.setPizzaToppings(toppings);
        System.out.println(pizza);


        req.getRequestDispatcher("/pizza.jsp").forward(req, res);
    }

}

