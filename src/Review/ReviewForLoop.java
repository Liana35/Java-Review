package Review;

import java.util.Scanner;

public class ReviewForLoop {

        public static void main(String[] args) {

            // best loop - when we know how many times we want to repeat a block of code

            for (int i =2; i<=20; i+=5){
                System.out.println(i);
            }


            for (int i =2; i<=20; i+=5) {
                System.out.println(i);
                if (i == 12) {
                    System.out.println("i equals to 12 - break the loop");
                    break;
                }
            }

            for (int i =2; i<=10; i++) {
                if(i%3==0){
                    System.out.println(i);
                    continue;
                }
                System.out.println("Hello");
            }




        }
    }


