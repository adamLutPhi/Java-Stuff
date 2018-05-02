public class Arrays{

    public static void main(String[] args) {

	// create an array of ints and check to find out the default values
	int [] a = new int[10];
	for (int i=0;i<a.length;i++)
	    System.out.println("a["+i+"]="+a[i]);

	// let's try some strings!
	String [] names = new String[4];
	for (int i=0;i<names.length;i++)
	    System.out.println("names["+i+"]="+names[i]);
 
	// Array literals used to initialize arrays - start with ints
	int [] b = { 8,4,3 };
	for (int i=0;i<b.length;i++)
	    System.out.println("b["+i+"]="+b[i]);

	// let's try some strings!
	String [] fnames = {"Fred", "Joe", "Sally"};
	for (int i=0;i<fnames.length;i++)
	    System.out.println("fnames["+i+"]="+fnames[i]);
 
	// what happens if you access an array element that doesn't exist?
	// Array literls used to initialize arrays.
	int [] c = { 8,4,3 };
	for (int i=0;i<5;i++)
	    System.out.println("c["+i+"]="+c[i]);
    }

}



