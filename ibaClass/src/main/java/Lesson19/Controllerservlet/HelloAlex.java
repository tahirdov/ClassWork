package Lesson19.Controllerservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloAlex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q = req.getRequestURI();
        String[] strings = q.split("/");
        try (PrintWriter writer = resp.getWriter()) {
            writer.println("Hello, " + strings[strings.length - 1]);
        }
    }
}
