import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
            res.setContentType("text/html");
            String searchQuery = req.getParameter("name");
            String title = "Total Number of Hits";
            PrintWriter out = res.getWriter();




            if (searchQuery != null) {
                out.println("<h1>Hello, " + searchQuery + "!</h1>");

            } else {
                out.println("<h1>Hello World!</h1>");
            }

        }

}
