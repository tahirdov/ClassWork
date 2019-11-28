package Lesson20.Navigation;

import Lesson18.Web.TemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


public class MenuServlet extends HttpServlet {
    private TemplateEngine te;

    public MenuServlet(TemplateEngine te) {
        this.te = te;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, Object> data = new HashMap<>();
        data.put("header", "This is main page");

        te.render("temp.ftl", data, resp);
    }
}
