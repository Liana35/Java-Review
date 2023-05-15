package review6;

public class Tesla extends Car{

    String type;
    boolean autoPilot;
    Tesla(String make,String model, int year, int horsePower,String type,boolean autoPilot){
        super(make,model,year,horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }

    protected void haveAutopilot(){
        System.out.println(make+" has autopilot "+autoPilot);
    }

    //overriding is when we have the same method name in 2 different classes (Parent - child)
    // for overriding inheritance is a must
    //in overriding method signature should be same
    public void start(){

    }
}
