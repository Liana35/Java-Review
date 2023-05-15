package Review;

public class ArrayReview {
    public static void main(String [] args){

        int a=10;
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        System.out.println(arr[1]);
        System.out.println("Size of the array = "+arr.length);


        System.out.println("*************");

        for(int name1:arr){
            System.out.print(name1+" ");
        }

        System.out.println("*************");
        //Getting all values from the array
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }


        String[] colors={"black", "white", "red", "purple", "blue"};

        for(String name:colors){
            System.out.println(name);

        }


        System.out.println("-------- printing in reverse-------------");
        for(int i= colors.length-1;i>=0; i--){
            System.out.println(colors[i]+" ");
        }

    }
}
