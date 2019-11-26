package Lesson19;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q = req.getRequestURI().toLowerCase();
        HelloAlex hi = new HelloAlex();
        ByeAlex bye = new ByeAlex();

        try (PrintWriter writer = resp.getWriter()) {
            if (q.contains("hello")) {
                hi.doGet(req, resp);
            } else if (q.contains("bye")) {
                bye.doGet(req, resp);
            } else {
                writer.println("Just smile");
            }
        }
    }
}
