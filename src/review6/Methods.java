package review6;

public class Methods {
    //user defined : with return type and without
                //    with parameters and without


    void hello(){
        System.out.println("Hello");
    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }


    // create a method that returns the largest number between 2 int
    int findLargest(int num1, int num2 ){
        if (num1>num2){
            return num1;
        } else{
         return num2;
        }
    }

    // create a method that returns an average number of 2 decimal numbers
    double findAverage(double num1, double num2){

        return(num1+num2)/2;
    }


    // create a method that returns a reversed String from the given

    String reverse(String given){
        StringBuilder sb=new StringBuilder(given);
        return sb.reverse().toString();
    }

    // create a method that returns a minimum value from a given array

    public static int findMin(int[] array) {
        int min=array[0] ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }



    public static void main(String[] args) {
        String name="Julia";
        //System.out.println(name.length());
        int characters=name.length();
        System.out.println(characters);

        Methods obj= new Methods();
        obj.sayHello(name);


       int largest= obj.findLargest(100,200);
        System.out.println("The largest number is "+largest);


        System.out.println(obj.findAverage(10,30));




        String reverse=obj.reverse("hello");
        System.out.println(reverse);


        int[] array={10,20,130};
        Methods.findMin(array);
        int min=findMin(array);
        System.out.println(min);


    }
}
