package review6;

public class Car {

    protected String make, model;
    int year, horsePower;
    //initialize variables with a constructor;

    // 2 constructors
    Car(String make,String model ){
        this.make=make;
        this.model=model;
    }
    Car(String make,String model,int year, int horsePower ){
        this(make,model); // making call to the current class constructor
        this.year=year;// accessing current class instance variables
        this.horsePower=horsePower;
    }


    // method
    public void start (){
        System.out.println(make+ " starts");
    }
    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }

    // same class has 2 or more methods with same name  - Method overloading
    // how to implement - 1. by using different number of parameters,
    // 2. - by using different type of parameters
    //  3.sequence
    // method signature must be different, it involves name and parameters only!
    // we dont care about return type and access modifier (they can be changed )  so only -  ... drive(String destination) - no matter access modifier or return typ
    //  public  void drive(String destination){   --- drive(String destination) is signature
  public  void drive(String destination){
        System.out.println(make+ " drives to "+ destination);
    }
    public void drive(int speed, String destination){
        System.out.println(make+" drives to "+ destination+" with speed= "+speed);
    }

    public void drive(String destination, int speed){
        System.out.println(make+" drives to "+ destination+" with speed= "+speed);
    }




}
