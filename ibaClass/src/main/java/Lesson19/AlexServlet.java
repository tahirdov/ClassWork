package Lesson19;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AlexServlet {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8001);
        ServletContextHandler handler = new ServletContextHandler();
        ControllerServlet cs = new ControllerServlet();
        handler.addServlet(new ServletHolder(cs), "/*");


        server.setHandler(handler);
        server.start();
        server.join();
    }
}
