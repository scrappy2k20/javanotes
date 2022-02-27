package userimputs;

import java.util.Scanner;

public class UserEdgeCase2 {

    public static void main(String[] args) {
        // Creating a Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Process
        System.out.print("Test Execution Finished?: ");
        boolean testFinished = scan.nextBoolean();
        scan.nextLine();

        System.out.print("Please enter Test Name  : ");
        String testName = scan.nextLine();

        //Output
        System.out.println("==========OUTPUT==========");
        System.out.println("Test is done: " + testFinished);
        System.out.println("Test Name   : " +testName.toUpperCase());

        // Close the scanner
        scan.close();
    }
}
