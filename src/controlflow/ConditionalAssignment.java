package controlflow;

import java.util.Scanner;

public class ConditionalAssignment {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Process
        System.out.print("Please enter your age: ");
        int userAge = scan.nextInt();

        // Decision
        String isEligible = (userAge >= 18)? "Yes, eligible" : "No, not eligible";

        System.out.println("\n==========OUTPUT==========");
        System.out.println("Am I eligible to Vote?: " + isEligible);

        // Close the scanner
        scan.close();

    }
}
