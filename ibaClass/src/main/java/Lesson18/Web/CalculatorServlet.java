package Lesson18.Web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sa = req.getParameter("a");
        String sb = req.getParameter("b");
        String pros = req.getParameter("pros");

        try (PrintWriter writer = resp.getWriter()) {
            writer.println(Calculator.operator(pros, Double.parseDouble(sa), Double.parseDouble(sb)));
        }
    }
}
