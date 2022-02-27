package operators;

import org.junit.Test;

public class IncrementDecrementDemo {

    @Test
    public void increment() {
        // increment: add 1
        // symbol: ++
        // variable content updater by 1
        int number = 10;
        number++;
        System.out.println(number);
    }

    @Test
    public void decrement () {
        //decrement: subtract 1
        // symbol: --
        // variable content updater by -1
        double number = 10.90;
        number--;
        System.out.println(number);
    }

    @Test
    public void postAndPrefix() {
        // postfix mode  var++, var--
        // prefix mode  ++var, --var
        int n = 10;
        //n++;
        //++n;
        //n--;
        //--n;
        System.out.println(n);
    }

    @Test
    public void orderOfArithmaticOperation() {
        // *, /  ---> multi, div comes first
        // +, -  ---> add, sub comes second
        int total;
        total = 2 + 10 / 2;
        System.out.println(total);
    }

    @Test
    public void postPrefixTest () {
        int n = 10;
        int x = 20;
        int ret = n++ * --x + 100;
        System.out.println(ret);
    }

}
