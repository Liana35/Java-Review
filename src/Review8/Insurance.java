package Review8;

public abstract class Insurance {

    public static String company="Geico";
    protected String  policyNumber;
    String policyHolder;
    public String ssn;


    //initializing the variables above
    public Insurance(String  policyNumber,String  policyHolder){
        this.policyNumber=policyNumber;
        this.policyHolder=policyHolder;
    }

    // method
    public void getInsurance(){
        System.out.println("We need to get insurance");
    }

    public abstract double calculateCoverage();
}


class CarPolicy extends Insurance{

    double premium;
    int age;

    //we have a constructor in parent sp we have to make one
    // we need to initialize all variables, so we also add premium and age to the constructor

    CarPolicy(String  policyNumber,String  policyHolder,double premium,int age){
        super(policyNumber,policyHolder);
        this.premium=premium;
        this.age=age;
    }


    public  double calculateCoverage(){
        if (age<20){
            return premium*2;
        } else if(age<40){
            return premium*0.5;
        }else{
            return premium*0.2;
        }
    }

}
class PetPolicy extends Insurance{


    int numberOfPets;
    double premium;



    // parent has constructor and to be able to use parent's variables
    PetPolicy(String  policyNumber,String  policyHolder,double premium,int numberOfPets){
        super(policyNumber,policyHolder);
        this.premium=premium;
        this.numberOfPets=numberOfPets;
    }


    // proving implementation of constrictor
    public double calculateCoverage(){
        if(numberOfPets>2){
            return premium*2;
        } else if(numberOfPets>5){
            return premium*3;
        } else{
            return premium*5;
        }
    }

}
