public class Array2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

	try{
	  for(int i = 0; i < 6; i++)
           System.out.println("arr[" + i + "] = " +  arr[i]);
	} catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("Out Of Bounds Exception");
	} catch(Exception e){
	  System.out.println("Exception");
	}

        System.out.println("End");
   }
}


