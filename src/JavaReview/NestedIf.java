package JavaReview;

public class NestedIf {
    public static void main(String[] args) {
        boolean vaccine=true; ///true will be different, checkk it!
        int dose=2;

        if(vaccine){  //outer if
            System.out.println("How many doses do you have");

            if (dose==1){ //inner if
                System.out.println("You need a third one");
            }else{
                System.out.println("You are fully vaccinated");
            }
        }else {
            System.out.println("I do not have a vaccine");
        }
    }
}
