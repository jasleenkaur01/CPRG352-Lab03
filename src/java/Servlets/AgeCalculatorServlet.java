package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jasleen
 */

public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String age = request.getParameter("enter_your_age");
        
        request.setAttribute("age", age);
        
        int result = Integer.parseInt(age);

        if(age == null || age.equals("")){
          String message = "You must give your current age";
          request.setAttribute("message", message);
          
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); 
        return;
        }
 
        request.setAttribute("result", result);
        
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }
}
