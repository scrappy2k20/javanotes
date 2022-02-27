package userimputs;

import java.util.Scanner;

public class GettingMultipleInputs {

    public static void main(String[] args) {
        // Creating a scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Process
        System.out.print("Enter Test Name      : ");
        String userTestName = scan.nextLine();

        System.out.print("Enter Num of Tests   : ");
        int userTestNum = scan.nextInt();

        System.out.print("Enter Success Ratio  : ");
        double userRatio = scan.nextDouble();

        // Output
        System.out.println("==========OUTPUT==========");
        System.out.println("Test Name  : " + userTestName.toUpperCase());
        System.out.println("Test Count : " + userTestNum);
        System.out.println("Test Ratio : " + userRatio * 100 + "%");

        // Close the scanner
        scan.close();
    }
}
