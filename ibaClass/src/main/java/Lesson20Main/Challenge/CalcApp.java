package Lesson20Main.Challenge;


public class CalcApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            generate_op();
        }
    }

    private static void generate_op() {
        int op1 = (int) (Math.random() * 10 + 50);
        int op2 = (int) (Math.random() * 10 + 50);
        int id = (int) (Math.random() * 10 + 10);
        int r = -13;
        int opCheck = (int) (Math.random() * 10);
        String ops = "";

        switch (opCheck) {
            case 0:
                ops = "plus";
                break;
            case 1:
                ops = "minus";
                break;
            case 2:
                ops = "mult";
                break;
            default:
                ops = "div";
                break;
        }

        switch (ops) {
            case "plus":
                r = op1 + op2;
                break;
            case "minus":
                r = op1 - op2;
                break;
            case "mult":
                r = op1 * op2;
                break;
            case "div":
                r = op1 / op2;
                break;
        }
        DbOps.insert_op(op1, op2, ops, r, id);

    }


//  public static void main(String[] args) throws Exception {
//    Server server = new Server(9003);
//
//    ServletContextHandler handler = new ServletContextHandler();
//    handler.addServlet(CalculatorServlet.class, "/c/*");
//
//
//
//    server.setHandler(handler);
//    server.start();
//    server.join();
//  }
}
