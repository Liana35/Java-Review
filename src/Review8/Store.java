package Review8;


    public class Store {
        public static void main(String[] args) {


            Furniture chair=new Chair();
            chair.assemble();
            chair.comfort(); //runtime polymorphism

            Furniture table=new Table();
            table.comfort(); //runtime polymorphism
            table.assemble();

            Table t=new Table();
            t.assemble();
            t.comfort();
            t.buildTable("Wood");
            t.buildTable();

            Chair.breaks();
            Furniture.breaks();


            Furniture chair2= new Chair();
            chair2.assemble();
            chair2.comfort();
            chair2.breaks();
        }
    }