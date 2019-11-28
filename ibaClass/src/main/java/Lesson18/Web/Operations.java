package Lesson18.Web;

import java.util.ArrayList;
import java.util.List;

class Operations {
    private List<Operation> operations = new ArrayList<>();


    void add(Operation operation) {
        this.operations.add(operation);
    }

    List<Operation> getOperations() {
        return operations;
    }
}
