package userimputs;

import java.util.Scanner;

public class GettingInput {

    public static void main(String[] args) {
        // 1. Creating a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Get an input
        System.out.print("Please enter integer: ");
        int userInt = scan.nextInt();

        System.out.println("User typed in: " + userInt);

        // 3. Close the scanner
        scan.close();
    }
}
