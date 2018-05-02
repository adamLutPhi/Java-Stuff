
import java.io.*;

public class InputReader {

    public static void main(String[] args){
	InputStreamReader is = new InputStreamReader(System.in);
	try {
	    char c;
	    for (int i=0;i<10;i++) {
		c = (char) is.read();
		System.out.write(c);
	    }
	    System.out.flush();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
		
