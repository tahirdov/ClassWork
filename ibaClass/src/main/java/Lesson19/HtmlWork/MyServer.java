package Lesson19.HtmlWork;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class MyServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9000);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(MainServlet.class, "/hello/*");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
