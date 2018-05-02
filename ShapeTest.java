// Shape.java: abstract base class
abstract class Shape { // abstract class, can't instantiate
   public double area() { return 0.0; }
   public double volume() { return 0.0; }
   public abstract String getName(); // abstract, so omit body
} 

// Point.java: the class Point
class Point extends Shape {
   protected int x, y; // coordinates of the Point

   // constructor
   public Point( int a, int b ) { x = a; y = b; }

   // get x coordinate
   public int getX() { return x; }
   // get y coordinate
   public int getY() { return y; }

   // convert the point into a String representation
   public String toString()
      { return "[" + x + ", " + y + "]"; }

   // return the class name
   public String getName() { return "Point"; }    
}


// circle.java: the class Circle
class Circle extends Point {  // inherits from Point
   protected double radius;     

   // Constructor
   public Circle( double r, int a, int b ) {
      super( a, b );  // call the superclass constructor
      radius = ( r >= 0 ? r : 0 );
   }
      
   // Calculate area of Circle
   public double area() { return Math.PI * radius * radius; }

   // convert the Circle to a String
   public String toString()
      { return "Center = " + super.toString() + "; Radius = " + radius; }

   // return the class name
   public String getName() { return "Circle"; }
}


// the class Cylinder
class Cylinder extends Circle {
   protected double height;  // height of Cylinder

   // constructor
   public Cylinder( double h, double r, int a, int b ) {
      super( r, a, b );   // call superclass constructor
      height = ( h >= 0 ? h : 0 );
   }

   // Calculate area of Cylinder (i.e., surface area)      
   public double area() {
      return 2 * super.area() +
             2 * Math.PI * radius * height;
   }

   // Calculate volume of Cylinder
   public double volume() { return super.area() * height; }

   // Convert a Cylinder to a String
   public String toString() {
      return super.toString() + "; Height = " + height;
   }
   // Return the class name
   public String getName() { return "Cylinder"; }
}


// ShapeTest.java: test point, circle, cylinder hierarchy
public class ShapeTest {

   private Shape shapes[];

   public void createShapes() {
      shapes = new Shape[3]; // generic array of any shape

      shapes[0]  = new Point(7, 11);
      shapes[1]  = new Circle(3.5, 22, 8);
      shapes[2]  = new Cylinder(10, 3.3, 10, 10); 
   }

   public void printShapes() { 
      // Loop through arrayOfShapes. Use polymorphism to print the name,
      // area, and volume of each object.
      System.out.println("PRINT THE SHAPES AS AN ARRAY OF SHAPE");

      for ( int i = 0; i < shapes.length; i++ ) {
         System.out.println(shapes[i].getName() + ": " + shapes[i].toString());
         System.out.println("Area = " + shapes[i].area());
         System.out.println("Volume = " + shapes[i].volume());
         System.out.println();
      }
   }

   public static void main(String[] args) {
      ShapeTest testObj = new ShapeTest();
      testObj.createShapes(); 
      testObj.printShapes();    
   }
} 

