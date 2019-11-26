package Lesson19.HtmlWork;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Data data = new Data();
        BufferedReader br = new BufferedReader(
                new FileReader(new File("C:\\Users\\hp\\IdeaProjects\\ClassWork\\ibaClass\\src\\main\\java\\Lesson19\\HtmlWork\\login.html")));
        try(PrintWriter w = resp.getWriter()) {
            br.lines().forEach(s -> {
                s = s.replaceAll("\\$user", data.getName());
                s = s.replaceAll("\\$count", String.valueOf(data.getMessages()));
                w.println(s);
            });
        }
    }
}
