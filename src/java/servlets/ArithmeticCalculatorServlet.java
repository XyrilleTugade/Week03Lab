/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xyrille
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("firstNum");
        String sec = request.getParameter("secNum");

        String buttonChoice = request.getParameter("button");
        int firstNum = Integer.parseInt(first);
        int secNum = Integer.parseInt(sec);
        int result = 0;

        switch (buttonChoice) {
            case "+":
                result = firstNum + secNum;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;
                
            case "-":
                result = firstNum - secNum;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;
            
            case "*":
                result = firstNum * secNum;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;
                
            case "%":
                result = firstNum / secNum;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;
        }

    }

}
