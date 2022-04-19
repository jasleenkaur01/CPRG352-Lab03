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
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        
        
        if(first == null || first.equals("") || second == null || second.equals("")){
            String message = "invalid";
            request.setAttribute("message", message);
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }
        else
        {
            try {
                int intfirst = Integer.parseInt(first);
                int intsecond = Integer.parseInt(second);
            }
            catch (NumberFormatException ex)
            {
              String message = "invalid";
              request.setAttribute("message", message);
              request.setAttribute("first", first);
              request.setAttribute("second", second);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
            
            
            if(operation == "+"){
                int intfirst = Integer.parseInt(first);
                int intsecond = Integer.parseInt(second);
                int result = Integer.parseInt(first) + Integer.parseInt(second);
                request.setAttribute("result", result);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
            
            if(operation == "-"){
                int intfirst = Integer.parseInt(first);
                int intsecond = Integer.parseInt(second);
                int result = Integer.parseInt(first) - Integer.parseInt(second);
                request.setAttribute("result", result);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
            
            if(operation == "*"){
                int intfirst = Integer.parseInt(first);
                int intsecond = Integer.parseInt(second);
                int result = Integer.parseInt(first) * Integer.parseInt(second);
                request.setAttribute("result", result);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
            
            if(operation == "%"){
                int intfirst = Integer.parseInt(first);
                int intsecond = Integer.parseInt(second);
                int result = Integer.parseInt(first) % Integer.parseInt(second);
                request.setAttribute("result", result);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }

    }
}
}
