package Lesson18.Web;


class Operation {
    private double operand1;
    private double operand2;
    private String operation;

    Operation(double operand1, double operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }


    @Override
    public String toString() {
        return operand1 + " " + operation + " " + operand2;
    }
}
