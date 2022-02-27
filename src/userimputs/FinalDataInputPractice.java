package userimputs;

import java.util.Date;
import java.util.Scanner;

public class FinalDataInputPractice {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Process
        System.out.print("Test Context Name    : \t");
        String test = scan.nextLine();

        System.out.print("Test Execution Env   : \t");
        String env = scan.nextLine();

        System.out.print("Total Testcase #     : \t");
        int totalTest = scan.nextInt();

        System.out.print("Desired Success Ratio: \t");
        double ratio = scan.nextDouble();
        scan.nextLine();

        System.out.print("Test Executed By     : \t");
        String initUser = scan.nextLine();

        // Output
        System.out.println("\n==========OUTPUT==========");
        System.out.println("Scheduled Test  : \t" + test.toUpperCase());
        System.out.println("Execution Env   : \t" + env.toUpperCase());
        System.out.println("Total Testcases : \t" + totalTest);
        System.out.println("Target Ratio (%): \t" + ratio * 100 + "%");
        System.out.println("Test Started By : \t" + initUser);
        System.out.println("Logged Time     : \t" + new Date());
        System.out.println("==========================");

        // Close the scanner
        scan.close();
    }
}
