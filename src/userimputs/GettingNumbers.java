package userimputs;

import java.util.Scanner;

public class GettingNumbers {

    public static void main(String[] args) {
        // Create a scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Data process
        System.out.print("Please enter # of testcases: ");
        int userTestNum = scan.nextInt();

        System.out.print("Please enter target success ratio: ");
        double userTargetRatio = scan.nextDouble();
        double percent = userTargetRatio * 100;

        // Output
        System.out.println("==========OUTPUT==========");
        System.out.println("Test Cases:   " + userTestNum);
        System.out.println("Target Ratio: " + percent + "%");

        // Close the scanner
        scan.close();
    }
}
