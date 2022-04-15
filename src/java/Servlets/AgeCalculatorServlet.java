package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
            
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);

        if(age == null || age.equals("")){
          String message = "You must give your current age";
          request.setAttribute("message", message);
          
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); 
        }
 
        else{
            try{
               int result = Integer.parseInt(age) + 1; 
            }
            catch (NumberFormatException ex)
            {
                String message = "You must enter a number";
                request.setAttribute("message", message);
                
             getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); 
        return;
            }
            
            int result = Integer.parseInt(age) + 1;
            String nextAge = "Your age next birthday will be" + result;
 
            request.setAttribute("result", result);
        
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }
}
}
