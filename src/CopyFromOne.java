
import java.io.*;
import java.util.*;

public class CopyFromOne {
	public static void main(String[] args) {
		String filename1 = "Test2.txt";
		String filename2 = "Insert.txt";
		ArrayList<Integer> tempHolder = new ArrayList<Integer>();
		
		int scan = 0; 
		int charCounter = 0;
		
	    try {
	    	FileInputStream input = new FileInputStream(filename1);

	    	while ( input.available() > 0 ) {
	    		scan = input.read();
	    		tempHolder.add(scan);
	    		charCounter++;
	    	}
	      input.close();
	    }
	    
	    catch ( FileNotFoundException e ) {
	    	System.out.println( "File dosent exsist: " + filename1 );
	    }
	    
	    catch ( IOException e ) {
	    	System.out.println( "There was an error reading from " + filename1 );
	    }
	    
	    
	    try {
	    	FileOutputStream output = new FileOutputStream( filename2 );

      		for(int i = 0; i < charCounter; i++) {
      			output.write(getChar(tempHolder.get(i)));
      		}
      		System.out.print("Succeses!");
      		output.close();
	    }
	    catch ( FileNotFoundException e ) {
	      System.out.println( "File couldnt be created: " + filename2);
	    }
	    catch ( IOException e ) {
	      System.out.println( "There was an error writing to: " + filename2);
	    }
	}
	public static char getChar(int scan) {
		char back = 0;
      	if(scan == 97 || scan == 65) {
      		back = 'a'; 
      	}
      	if(scan == 98 || scan == 66) {
      		back = 'b'; 
      	}
      	if(scan == 99 || scan == 67) {
      		back = 'c'; 
      	}
      	if(scan == 100 || scan == 68) {
      		back = 'd'; 
      	}
      	if(scan == 101 || scan == 69) {
      		back = 'e'; 
      	}
      	if(scan == 102 || scan == 70) {
      		back = 'f'; 
      	}
      	if(scan == 103 || scan == 71) {
      		back = 'g'; 
      	}
      	if(scan == 104 || scan == 72) {
      		back = 'h'; 
      	}
      	if(scan == 105 || scan == 73) {
      		back = 'i'; 
      	}
      	if(scan == 106 || scan == 74) {
      		back = 'j'; 
      	}
      	if(scan == 107 || scan == 75) {
      		back = 'k'; 
      	}
      	if(scan == 108 || scan == 76) {
      		back = 'l'; 
      	}
      	if(scan == 109 || scan == 77) {
      		back = 'm'; 
      	}
      	if(scan == 110 || scan == 78) {
      		back = 'n'; 
      	}
      	if(scan == 111 || scan == 79) {
      		back = 'o'; 
      	}
      	if(scan == 112 || scan == 80) {
      		back = 'p'; 
      	}
      	if(scan == 113 || scan == 81) {
      		back = 'q'; 
      	}
      	if(scan == 114 || scan == 82) {
      		back = 'r'; 
      	}
      	if(scan == 115 || scan == 83) {
      		back = 's'; 
      	}
      	if(scan == 116 || scan == 84) {
      		back = 't'; 
      	}
      	if(scan == 117 || scan == 85) {
      		back = 'u'; 
      	}
      	if(scan == 118 || scan == 86) {
      		back = 'w'; 
      	}
      	if(scan == 119 || scan == 87) {
      		back = 'v'; 
      	}
      	if(scan == 120 || scan == 88) {
      		back = 'x'; 
      	}
      	if(scan == 121 || scan == 89) {
      		back = 'y'; 
      	}
      	if(scan == 122 || scan == 90) {
      		back = 'z'; 
      	}
		return back;
	}
}
