import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("q");
        PrintWriter out = response.getWriter();
        if (name != null) {
            out.println("<h1>Hello, " + name + "!</h1>");
        } else {
            out.println("<h1>Hello, World!</h1>");
        }
    }
}
