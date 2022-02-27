package controlflow;

import org.junit.Test;

public class IfStatement {

    @Test
    public void ifStatementDemo() {
        int userAge = 25;

        if(userAge <= 55) {
            System.out.println("You are eligible!");
        }
    }
}
