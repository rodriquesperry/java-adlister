import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAdsServlet", urlPatterns = "/ads")
public class ShowAdsServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Ads AdsDao = DaoFactory.getAdsDao();

        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String price = req.getParameter("price");

        List<Ad> ads = AdsDao.all();
        req.setAttribute("name", name);
        req.setAttribute("description", description);
        req.setAttribute("price", price);
        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/ads/index.jsp").forward(req, res);
    }

}

