package userimputs;

import java.util.Scanner;

public class GettingText {

    public static void main(String[] args) {
        // Creating a scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Process
        System.out.print("Please enter your street address: ");
        String userAddr = scan.nextLine();

        // Output
        System.out.println("==========OUTPUT==========");
        System.out.println("User Address: " + userAddr.toUpperCase());

        // Close the scanner
        scan.close();
    }
}
