package Lesson18.Web;



class Calculator {

    static double operator(String operation, double a, double b) {
         Operations operations  = new Operations();
        double operated = 0;
        switch (operation) {
            case "sum":
                operated = add(a, b);
                 operations.getOperations().add(new Operation(a, b, "+"));
                break;
            case "sub":
                operated = subtract(a, b);
                 operations.getOperations().add(new Operation(a, b, "-"));
                break;
            case "mul":
                operated = multiply(a, b);
                 operations.getOperations().add(new Operation(a, b, "*"));
                break;
            case "div":
                operated = divide(a, b);
                 operations.getOperations().add(new Operation(a, b, "/"));
                break;
            default:
                System.out.println("Wrong operator.");
        }

        return operated;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
           throw new IllegalArgumentException("Argument 'b' is 0");
        }
        else return a/b;
    }



}
