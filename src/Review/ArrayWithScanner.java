package Review;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to store");

        int size=scan.nextInt();

        String [] name=new String[size];

        // regular for loop works with indexes
        for(int i=0; i<name.length; i++){
            System.out.println("Please enter a name");
             name[i]=scan.next();
        }

        // enhanced for loop works with variable
        for (String box:name){
            System.out.println(box);
        }

    }
}
