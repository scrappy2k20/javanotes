package operators;

import org.junit.Test;

public class AssignmentOperator {

    @Test
    public void assignmentOperatorDemo() {

        // Assignment operator =
        // leftside = rightside;

        double number;  // var
        number = 98.6;  // data-value

        double pi = 3.1415;
        number = pi;  // non-empty var
        System.out.println(number);

        number = Math.random();  // method
        System.out.println(number);
    }

}
