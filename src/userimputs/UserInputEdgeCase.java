package userimputs;

import java.util.Scanner;

public class UserInputEdgeCase {

    public static void main(String[] args) {
        // Creating a scanner
        Scanner scan = new Scanner(System.in);

        // Prompt & Process
        System.out.print("Enter your age : ");
        double userAge = scan.nextDouble();
        double birthYear = 2022 - userAge;
        scan.nextLine();  // flush that "\n"

        System.out.print("Enter you name : ");
        String userFullName = scan.nextLine();

        // Output
        System.out.println("\n\n\n==========OUTPUT==========");
        System.out.println("Full Name : " + userFullName.toUpperCase());
        System.out.println("Birth Year: " + birthYear);

        // Close the scanner
        scan.close();
    }
}
