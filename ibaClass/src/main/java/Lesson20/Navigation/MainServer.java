package Lesson20.Navigation;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class MainServer {
    public static void main(String[] args) throws Exception {
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(LoginServlet.class, "/login/*");
        handler.addServlet(LogoutServlet.class, "logout/*");
        handler.addServlet(MenuServlet.class, "/menu/*");


        Server server = new Server(7542);
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
