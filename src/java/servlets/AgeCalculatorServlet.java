package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Keith
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String message;
        String age = request.getParameter("age");
        request.setAttribute("age", age);

        if (age == null || age.equals("")) {
            message = "You must give your current age.";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
        } else {
            try {
                int nextAge = Integer.parseInt(age) + 1;
                message = "Your age next birthday will be " + nextAge;

                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                        .forward(request, response);
            } catch (NumberFormatException e) {
                message = "You must enter a number.";
                
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                        .forward(request, response);
            }
        }
    }
}
