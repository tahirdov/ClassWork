package Lesson20Main.Challenge;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * http://localhost:9003/c?op1=33&op2=11&op=minus&id=88
 * http://localhost:9003/c?op1=11&op2=22&op=minus&id=7
 * http://localhost:9003/c?op1=1&op2=2&op=plus&id=9
 */
public class CalcApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9003);

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(CalculatorServlet.class, "/c/*");



    server.setHandler(handler);
    server.start();
    server.join();
  }
}
