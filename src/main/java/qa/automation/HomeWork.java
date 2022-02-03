package qa.automation;

import java.util.Scanner;

public class HomeWork {

    // psvm includes the below command
    public static void main(String[] args) {

        //writes the text in the console
        System.out.println("Please enter your first name:");

        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        //a string variable that will store the value entered from the user
        String firstName = scanner.nextLine();

        //writes the text in the console
        System.out.println("Please enter your last name:");

        //a string variable that will store the value entered from the user
        String lastName = scanner.nextLine();

        //writes the text in the console
        System.out.println("Please enter your hobby:");

        //a string variable that will store the value entered from the user
        String hobby = scanner.nextLine();

        // sout includes the below command
         System.out.println(firstName + " " + lastName + " has a hobby " + hobby + "!");

    }

}