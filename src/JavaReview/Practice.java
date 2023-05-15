package JavaReview;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner shape = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length1 = shape.nextInt();

        Scanner shape2 = new Scanner(System.in);
        System.out.println("Please enter the width");
        int width = shape2.nextInt();
        if (length1 != width) {
            System.out.println("The shape of your object is rectangle");
        } else {
            System.out.println("The shape of your object is square");
        }
    }}