package com.example.calculator;

import java.io.*;

import com.example.calculator.utils.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Calculator", urlPatterns = {"/Calculate"})
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            Calculator calculator = new Calculator(num1, num2);
            String resultMessage;

            switch (operation) {
                case "add":
                    resultMessage = "Result: " + calculator.add();
                    break;
                case "subtract":
                    resultMessage = "Result: " + calculator.subtract();
                    break;
                case "multiply":
                    resultMessage = "Result: " + calculator.multiply();
                    break;
                case "divide":
                    resultMessage = "Result: " + calculator.divide();
                    break;
                default:
                    resultMessage = "Invalid operation.";
            }

            response.setContentType("text/html");
            response.getWriter().write("<h1>" + resultMessage + "</h1>");
        } catch (Exception e) {
            response.setContentType("text/html");
            response.getWriter().write("<h1>Error: " + e.getMessage() + "</h1>");
        }
    }
}