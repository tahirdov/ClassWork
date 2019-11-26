package Lesson18.Web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<body style=\"background-color:powderblue;\">\n" +
                    "<font color=\"green\">" +
                    "<H1>Help Page</H1>" +
                    "</font>" +
                    "</body>");
        }
    }
}
