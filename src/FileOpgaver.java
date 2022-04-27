import java.io.*;

public class FileOpgaver {
	public static void main(String[] args) {
		String filename = "Test.txt";
		float aCounter = 0;
		float bCounter = 0;
		float cCounter = 0;
		float dCounter = 0;
		float eCounter = 0;
		float fCounter = 0;
		float gCounter = 0;
		float hCounter = 0;
		float iCounter = 0;
		float jCounter = 0;
		float kCounter = 0;
		float lCounter = 0;
		float mCounter = 0;
		float nCounter = 0;
		float oCounter = 0;
		float pCounter = 0;
		float qCounter = 0;
		float rCounter = 0;
		float sCounter = 0;
		float tCounter = 0;
		float uCounter = 0;
		float wCounter = 0;
		float vCounter = 0;
		float xCounter = 0;
		float yCounter = 0;
		float zCounter = 0;
		
		int scan = 0; 
		int charCounter = 0;
		
	    try {
	      FileInputStream input = new FileInputStream( filename );

	      while ( input.available() > 0 ) {
	    	
	    	scan = input.read();
	    	  
	    	System.out.print( scan + " " );
	      	
	      	if(scan == 97 || scan == 65) {
	      		aCounter++; 
	      	}
	      	if(scan == 98 || scan == 66) {
	      		bCounter++; 
	      	}
	      	if(scan == 99 || scan == 67) {
	      		cCounter++; 
	      	}
	      	if(scan == 100 || scan == 68) {
	      		dCounter++; 
	      	}
	      	if(scan == 101 || scan == 69) {
	      		eCounter++; 
	      	}
	      	if(scan == 102 || scan == 70) {
	      		fCounter++; 
	      	}
	      	if(scan == 103 || scan == 71) {
	      		gCounter++; 
	      	}
	      	if(scan == 104 || scan == 72) {
	      		hCounter++; 
	      	}
	      	if(scan == 105 || scan == 73) {
	      		iCounter++; 
	      	}
	      	if(scan == 106 || scan == 74) {
	      		jCounter++; 
	      	}
	      	if(scan == 107 || scan == 75) {
	      		kCounter++; 
	      	}
	      	if(scan == 108 || scan == 76) {
	      		lCounter++; 
	      	}
	      	if(scan == 109 || scan == 77) {
	      		mCounter++; 
	      	}
	      	if(scan == 110 || scan == 78) {
	      		nCounter++; 
	      	}
	      	if(scan == 111 || scan == 79) {
	      		oCounter++; 
	      	}
	      	if(scan == 112 || scan == 80) {
	      		pCounter++; 
	      	}
	      	if(scan == 113 || scan == 81) {
	      		qCounter++; 
	      	}
	      	if(scan == 114 || scan == 82) {
	      		rCounter++; 
	      	}
	      	if(scan == 115 || scan == 83) {
	      		sCounter++; 
	      	}
	      	if(scan == 116 || scan == 84) {
	      		tCounter++; 
	      	}
	      	if(scan == 117 || scan == 85) {
	      		uCounter++; 
	      	}
	      	if(scan == 118 || scan == 86) {
	      		wCounter++; 
	      	}
	      	if(scan == 119 || scan == 87) {
	      		vCounter++; 
	      	}
	      	if(scan == 120 || scan == 88) {
	      		xCounter++; 
	      	}
	      	if(scan == 121 || scan == 89) {
	      		yCounter++; 
	      	}
	      	if(scan == 122 || scan == 90) {
	      		zCounter++; 
	      	}
	      	charCounter++;
	      }
	      
	      	System.out.println("");
	      	System.out.println("A: " + getProcent(aCounter,charCounter) + "%");
	      	System.out.println("B: " + getProcent(bCounter,charCounter) + "%");
	      	System.out.println("C: " + getProcent(cCounter,charCounter) + "%");
	      	System.out.println("D: " + getProcent(dCounter,charCounter) + "%");
	      	System.out.println("E: " + getProcent(eCounter,charCounter) + "%");
	      	System.out.println("F: " + getProcent(fCounter,charCounter) + "%");
	      	System.out.println("G: " + getProcent(gCounter,charCounter) + "%");
	      	System.out.println("H: " + getProcent(hCounter,charCounter) + "%");
	      	System.out.println("I: " + getProcent(iCounter,charCounter) + "%");
	      	System.out.println("J: " + getProcent(jCounter,charCounter) + "%");
	      	System.out.println("K: " + getProcent(kCounter,charCounter) + "%");
	      	System.out.println("L: " + getProcent(lCounter,charCounter) + "%");
	      	System.out.println("M: " + getProcent(mCounter,charCounter) + "%");
	      	System.out.println("N: " + getProcent(nCounter,charCounter) + "%");
	      	System.out.println("O: " + getProcent(oCounter,charCounter) + "%");
	      	System.out.println("P: " + getProcent(pCounter,charCounter) + "%");
	      	System.out.println("Q: " + getProcent(qCounter,charCounter) + "%");
	      	System.out.println("R: " + getProcent(rCounter,charCounter) + "%");
	      	System.out.println("S: " + getProcent(sCounter,charCounter) + "%");
	      	System.out.println("T: " + getProcent(tCounter,charCounter) + "%");
	      	System.out.println("U: " + getProcent(uCounter,charCounter) + "%");
	      	System.out.println("W: " + getProcent(wCounter,charCounter) + "%");
	      	System.out.println("V: " + getProcent(vCounter,charCounter) + "%");
	      	System.out.println("X: " + getProcent(xCounter,charCounter) + "%");
	      	System.out.println("Y: " + getProcent(yCounter,charCounter) + "%");
	      	System.out.println("Z: " + getProcent(zCounter,charCounter) + "%");
	      	System.out.println("Amount of characters: "+ charCounter);

	      	input.close();
	    }
	    catch ( FileNotFoundException e ) {
	      System.out.println( "File dosent exsist: " + filename );
	    }
	    catch ( IOException e ) {
	      System.out.println( "There was an error reading from: " + filename );
	    }
	}
	
	public static float getProcent(float nummer1,int total) {
		float procent = nummer1/total*100;
		return procent;
	}
}
