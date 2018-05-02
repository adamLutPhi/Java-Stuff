// Shape.java: abstract base class
abstract class Shape { // abstract class, can't instantiate
   public double area() { return 0.0; }
   public abstract String getName(); // abstract, so omit body
} 

class Point extends Shape {
   protected int x, y; // coordinates of the Point
   public Point( int a, int b ) {x = a; y = b;}

   // convert the point into a String representation
   public String toString() {return "[" + x + ", " + y + "]";}
   public String getName() { return "Point"; }    
}

class Circle extends Point { 
   protected double radius;     

   public Circle( double r, int a, int b ) {
      super( a, b );  // call the superclass constructor
      radius = ( r >= 0 ? r : 0 );
   }    
   public double area() { return Math.PI * radius * radius; } 
   public String toString()
      { return "Center = " + super.toString() + "; Radius = " + radius; } 
   public String getName() { return "Circle"; }
} 

public class ShapeTester { 
   private Shape shapes[]; 
   public void createShapes() {
	shapes = new Shape[5]; // generic array of any shape
	shapes[0]  = new Point(7, 11);
	shapes[1]  = new Point(7, 17);
	shapes[2]  = new Circle(3, 20, 8);
	shapes[3]  = new Circle(5, 20, 8);
	shapes[4]  = new Circle(8, 20, 8);
   } 
   public void printShapes() { 
      // Loop through arrayOfShapes. Use polymorphism to print the name,
      // area, and volume of each object.
      System.out.println("PRINT THE SHAPES AS AN ARRAY OF SHAPE");

      for ( int i = 0; i < shapes.length; i++ ) {
         System.out.println(shapes[i].getName() + ": " + shapes[i].toString());
         System.out.println("Area = " + shapes[i].area());
         System.out.println();
      }
   } 
   public static void main(String[] args) {
      ShapeTester testObj = new ShapeTester();
      testObj.createShapes(); 
      testObj.printShapes();    
   }
} 
