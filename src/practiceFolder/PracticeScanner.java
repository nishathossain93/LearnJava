package practiceFolder;

import java.util.Scanner;

public class PracticeScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please Enter First Name:");
//        String firstName = scanner.nextLine();
//        System.out.println("Hello " + firstName + "!");
//        System.out.println("Please Enter Last Name:");
//        String lastName = scanner.nextLine();
//        System.out.println("You may continue " + firstName + " " + lastName);
//
//        scanner.close();

        System.out.println("Welcome!");
        System.out.println("What is your age?");
        String age = scanner.nextLine();
        System.out.println("You are " + age);
        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();
        System.out.println("Your favorite color is " + color);
        scanner.close();



    }







}
