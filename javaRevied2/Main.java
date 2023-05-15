package javaRevied2;

public class Main {
    String item;
   double price;
    double quantity;

    public Main(String item,double price, double quantity ){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
        System.out.println();
    }
   /*  double itemTotalPrice(double price,double quantity){
        double totalValue=0;
        totalValue=price*quantity;
         return totalValue;
     }*/
   void itemTotalPrice(){
       double totalValue=0;
       totalValue=price*quantity;
         System.out.println(item+" "+"Total Value "+totalValue);
     }


    public static void main(String[] args) {
        Main item1= new Main("Blanket",49.99, 2);
        item1.itemTotalPrice();



        Main item2= new Main("Mattress",219.59, 2);
        item2.itemTotalPrice();


      //  System.out.println("You purchased "+item1.itemTotalPrice()+item1.itemTotalPrice()+" Today");
    }
}




