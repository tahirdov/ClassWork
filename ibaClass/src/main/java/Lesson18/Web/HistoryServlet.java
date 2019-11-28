package Lesson18.Web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class HistoryServlet extends HttpServlet {
    private TemplateEngine engine;

    HistoryServlet(TemplateEngine engine) {this.engine = engine;}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Operations operations = new Operations();
        HashMap<String, Object> data = new HashMap<>();
        data.put("operations", operations.getOperations());
        CalculatorServlet cs = new CalculatorServlet();
        cs.doGet(req, resp);
        engine.render("db.ftl", data, resp);
    }
}
