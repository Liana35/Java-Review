package JavaReview;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

       // int i=10;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please enter your age");
       int age= keyboard.nextInt(); // for intiger
        System.out.println("Are you tired");
       boolean tired=keyboard.nextBoolean();// to capture boolean
        System.out.println("What is your name");
        String name=keyboard.next();// to capture String until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);

    }
}
