package operators;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        System.out.println("What is your name?");

        Scanner scan = new Scanner(System.in);  // creating a scanner

        String name = scan.nextLine();  // storing user input into a String variable

        System.out.println("Nice to meet you " + name + "!");

        System.out.println("What is your favorite number?");
        int favNum = scan.nextInt();

        System.out.println("Your favorite number is " + favNum + "!");

        scan.close();

    }

}
