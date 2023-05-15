package Review;

public class D2ArrayReview {
    public static void main(String[] args) {

        int [][] array= {
                {1,2,3,},
                {11,12,13},
                {20,21,22}
        };
        //getting all values w regular for loop

        for (int row=0; row<array.length; row++){  //outer loop iterates over rows
            for(int col=0; col<array[row].length;col++)  {    // iterates over each column

                if(row%2!=0) {
                    System.out.print(array[row][col]+" ");
                }
            }
            System.out.println();
        }







        //getting all values w enhanced for loop
        for(int []arr:array){ // over arrays
            for(int num:arr){  //over each element
                System.out.println(num);
            }
            System.out.println();
        }





        // amount of arrays-rows
      int numberOfArrays= array.length;
        System.out.println(numberOfArrays);

        // amount of elements-indexes
       int numberOfElementsin1stArray= array[0].length;
        System.out.println(numberOfElementsin1stArray);

        System.out.println(array[2][1]);


    }
}
