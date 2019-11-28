package Lesson18.Web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class TheSimpleServlet {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9001);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(HelloServlet.class, "/hello/*");
        handler.addServlet(HelpServlet.class, "/help/*");
        handler.addServlet(LoginServlet.class, "/login/*");
        handler.addServlet(HistoryServlet.class, "/calculator/history");
        handler.addServlet(CalculatorServlet.class, "/calculator/*");
        handler.addServlet(FileServlet.class, "/fileread/*");
//        handler.addServlet(Servlet404.class, "/*");


        server.setHandler(handler);
        server.start();
        server.join();
    }
}
