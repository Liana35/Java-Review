package Review9;

public interface Drawable {  // interface is a collection  of public static final variable and public abstract methods
    public static final String TOOL = "pencil";

    void draw(); // be default its public abstract

    default void print() {
        System.out.println("We are drawing an object using " + TOOL);
    }

    static void erase() {
        System.out.println("All drawings are erasable ");
    }
}
   abstract  class Shape {
     public   String color;
       protected double width, length;

        Shape(String color, double width, double length) {
            this.color = color;
            this.length = length;
            this.width = width;
        }
      public abstract double calculateArea();

    }

    class Rectangle extends Shape implements Drawable {

    Rectangle(String color, double width, double length){
        super( color, width, length);
    }
    public double calculateArea(){
        return length*width;
    }
        public void draw() {
            System.out.println("I am drawing a Rectangle");
        }
    }
// above is before Java 8
// after Java 8 static and default methods were added to the Interface


    class Square implements Drawable {
        public void draw() {
            System.out.println("I am drawing a Square");
        }
    }
