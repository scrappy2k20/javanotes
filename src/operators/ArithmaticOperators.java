package operators;

import org.junit.Test;

public class ArithmaticOperators {

    @Test
    public void addingNumbers() {
        // symbol +
        // left + right
        System.out.println(2000 + 15);  // 2015
        int ret = 2000 + ((int)(Math.random() * 10));
        System.out.println(ret);

        int year = ret + 100;
        System.out.println(year);
    }

    @Test
    public void subtractingNumber() {
        // symbol -
        int n = 2022;
        int x = 1990;
        int result = n - x;
        System.out.println(result);

        int a = 10;
        double b = 1990.09;
        System.out.println(a - b);
    }

    @Test
    public void dividingNumbers() {
        // symbol /
        int n = 1990;
        int b = 10;
        int ret = n / b;
        System.out.println(ret);

        int a = 1990;
        double c = 10.09;
        System.out.println(a / c);
    }

    @Test
    public void multiplyingNumbers() {
        // symbol *
        int n = 1990;
        int b = 5;
        System.out.println(n * b);
        System.out.println(b * 100);
    }

    @Test
    public void modulusExample() {
        // symbol %
        int a = 10;
        int b = 3;
        System.out.println(a % b);
    }
}