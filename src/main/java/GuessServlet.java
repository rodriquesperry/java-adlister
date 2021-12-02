import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        int rando = (int) (Math.random() * (3 - 1) + 1);
        String randoString = String.valueOf(rando);
        String number = req.getParameter("guessNumber");
        int parsedNumber = Integer.valueOf(number);

        if (randoString.equals(number)) {
            res.sendRedirect("/correct");
        } else if (parsedNumber > 3 || parsedNumber < 1) {
            res.sendRedirect("/guess");
        } else {
            res.sendRedirect("/incorrect");

            System.out.println(randoString + " " + number);
        }
    }
}
