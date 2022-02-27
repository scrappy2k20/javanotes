package controlflow;

import org.junit.Test;

public class ControlFlowIntro {

    @Test
    public void ControlFlowDemo() {
        int age = 25;
        boolean isEligible = (age <= 55)? true : false;

        System.out.println("Content: " + isEligible);
    }

    @Test
    public void conditinalAssignmentUsage() {
        int m = 120;
        int b = 23;

        int smaller = (m < b)? m : b;
        int bigger = (m > b)? m : b;

        System.out.println("Smaller: " + smaller);
        System.out.println("Bigger: " + bigger);
    }

    @Test
    public void compareThreeNumber() {
        int n = 1;
        int x = 4;
        int y = 9;

        int first = (n < x)? n : x;
        int ans = (first < y)? first : y;

        System.out.println("Smallest: " + ans);
    }
}
