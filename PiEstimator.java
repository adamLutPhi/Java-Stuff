import java.util.*;
 
public class PiEstimator {  
    public static double estimatePI(int numThrows) {  
        Random rand1 = new Random(System.currentTimeMillis()); 
        int inside = 0;
        double x, y, Pi = 0;         
 
        for (int i=0; i <= numThrows; i++) {
	  x = rand1.nextDouble(); //or x = Math.random();
	  y = rand1.nextDouble(); 
	  if (x*x + y*y <= 1) inside = inside + 1;
        } 
	Pi = 4 * ((double)inside/numThrows);      
        return Pi; 
    }
 
    public static void main(String[] args) { 
	if (args.length < 1){
	  System.out.println("Usage: java PiEstimator [numThrows]");
	  System.exit(0);
	}
	int numThrows = Integer.parseInt(args[0]); 
	double p = estimatePI(numThrows);
        double d = p - Math.PI;
        System.out.println("Estimated PI = " + p + ", Difference = " + d);        
    }
}

