package operators;

import org.junit.Test;

public class RealtionalOperator {

    @Test
    public void compareNumbers () {
        // greater than
        // f1 > f2  ---> {true, false}
        boolean answer = 100 > 52;
        System.out.println(answer);

        // greater than or equal to
        // f1 >= f2  ---> {true, false}
        answer = 10 >= 2;
        System.out.println(answer);

        // less than
        // f1 < f2  ---> {true, false}
        answer = 8 < 28;
        System.out.println(answer);

        // less than or equal to
        // f1 <= f2  ---> {true, false}
        answer = 28 <= 28;
        System.out.println(answer);

        // equal to
        // f1 == f2  ---> {true, false}
        answer = 22 == 53;
        System.out.println(answer);

        // not equal to
        // f1 != f2  ---> {true, false}
        answer = 67 != 67;
        System.out.println(answer);

    }
}
