package operators;

import org.junit.Test;

public class LogicalOperators {

    @Test
    public void demoAND() {
        // AND  &&
        // {true, false}  &&  {true, false}  --->  {true, false}
        // Greedy AND
        boolean isRaining = true;
        boolean isWindy = true;
        boolean goOutside = isRaining && isWindy;
        System.out.println(goOutside);

        //                 LEFT  OP RIGHT       RESULT
        System.out.println(true  && true );  // true
        System.out.println(false && true );  // false
        System.out.println(true  && false);  // false
        System.out.println(false && false);  // false

        System.out.println("---------------------------");

        boolean ret;
        ret = true && true;
        System.out.println(ret);

        ret = false && true;
        System.out.println(ret);

        ret = true && false;
        System.out.println(ret);

        ret = false && false;
        System.out.println(ret);
    }

    @Test
    public void demoOR() {
        // OR  ||
        // {true/false}  ||  {true/false}  --->  {true/false}
        // Generous OR
        boolean isDark = true;
        boolean isCold = true;
        boolean stayInside = isDark || isCold;
        System.out.println(stayInside);

        //                 LEFT  OP RIGHT       RESULT
        System.out.println(true  || true );  // true
        System.out.println(false || true );  // true
        System.out.println(true  || false);  // true
        System.out.println(false || false);  // false

        System.out.println("---------------------------");

        boolean ret;
        ret = true || true;
        System.out.println(ret);

        ret = false || true;
        System.out.println(ret);

        ret = true || false;
        System.out.println(ret);

        ret = false || false;
        System.out.println(ret);
    }

    @Test
    public void demoNOT() {
        // NOT  !
        // !{true, false}  --->  {false, true}
        // !true  --->  false
        // !false  --->  true
        // Flipper
        boolean isRaining = true;
        System.out.println(isRaining);
        System.out.println(!isRaining);
    }

    @Test
    public void logicalOpPractice1() {

        int userAge = 89;
        int voterAgeLimit = 55;
        boolean canVote = userAge <= voterAgeLimit;  // false
        boolean isCitizen = true;
        boolean paidTax = false;

        boolean eligible = canVote && isCitizen && paidTax;  // false
        System.out.println(eligible);
    }

    @Test
    public void logicalOpPractice2() {
        boolean a = true;
        boolean b = true;
        boolean c = true;

        boolean result = !a || b && c;
        System.out.println(result);
    }
}
