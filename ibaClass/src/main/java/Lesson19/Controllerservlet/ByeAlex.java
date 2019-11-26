package Lesson19.Controllerservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ByeAlex extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q = req.getRequestURI();
        String[] strings = q.split("/");
        try (PrintWriter writer = resp.getWriter()) {
            writer.println("Bye, " + strings[strings.length - 1]);
        }
    }
}
