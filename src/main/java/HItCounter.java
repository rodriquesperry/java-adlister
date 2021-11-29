//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class HItCounter extends HttpServlet {
//
//    private int hitCount;
//
//    public void init() {
//        hitCount = 0;
//    }
//
//    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        res.setContentType("tet/html");
//        hitCount++;
//        PrintWriter out = res.getWriter();
//        String title = "Total Number of Hits";
//
//        out.println("<h3>" + hitCount + "</h3>");
//    }
//
//}
