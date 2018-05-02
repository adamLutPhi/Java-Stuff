import java.util.*;

public class SortThread extends Thread{ 
  int values[]; 
 
  public SortThread(String name, int values[]){ 
   super(name); 
   this.values = values; 
  }

  private void swap(int arr[], int i, int j){
    int e = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = e; 
  }
   
  public void run(){ 
   System.out.println(getName() + ": started"); 
   for(int i=0; i < values.length; i++){ 
    for(int j=values.length-1; j > i; j--) 
     if(values[j] < values[j-1]) swap(values, j-1, j); 
     if(i%1000==0) System.out.println(getName() + ": is executing"); 
   } 
   System.out.println(getName() + ": completed"); 
  }

  public static void main(String[] args) { 
   System.out.println("The main function: started"); 
   Random random = new Random(); 
   int v1[] = new int[10000]; 
   int v2[] = new int[10000]; 
   for(int i=0; i < v1.length; i++){ 
    v1[i]=random.nextInt(); 
    v2[i]=random.nextInt(); 
   } 
   SortThread t1 = new SortThread("thread1", v1); 
   SortThread t2 = new SortThread("thread2", v2); 
   t1.start(); 
   t2.start(); 
   System.out.println("The main: completed"); 
 }
 
}