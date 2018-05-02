public class OutOfBounds {
   public static void main (String[] args) {
      
      int[] arr = {20, 30, 40, 50, 60};
      int num1 = 25, num2 = 5;
      int result;
      
      try {
         result = num1/num2;
         System.out.println("The result is: " + result);
         for(int i=5; i >=0; i--) {
            System.out.println("The value of arr = " + arr[i]);
         }
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds");
	 e.printStackTrace();
      }
      catch (ArithmeticException ex) {
         System.out.println ("Can't divide by Zero" + ex);
	 //ex.printStackTrace();
      }
   }
}