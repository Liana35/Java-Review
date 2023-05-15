package JavaReview;

import java.security.spec.RSAOtherPrimeInfo;

public class IfElseIf {
    public static void main(String[] args) {
        int homework= 22;
        if (homework>25){
            System.out.println("Great job");
        }else if(homework>20){
            System.out.println("Good job");
        } else if (homework > 10) {
            System.out.println("Ok job");
        }else if (homework>5){
            System.out.println("Not good job");
        }
    }
}
