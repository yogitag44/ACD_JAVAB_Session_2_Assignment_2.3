//import java.util.Scanner;

public class CrossPattern {

	public static void main (String args[]) {
		int i,j;    //declared two variables to be used in for loops

		for (i=0; i<5; i++) {   //outer loop for printing number of rows
			for (j=0; j<5; j++) {	//inner loop to print stars and spaces
				
				if(i==j  || j==(5-i-1)) {  //* will be printed if this condition satisfied. 
				System.out.print("*");
			}
				else if((i>j  || j<=(5-i-1)) ) {  //left side blank spaces will be filled by _
					System.out.print("_");
				}
				else {
					System.out.print(" "); //To print space between stars
				}
			}
		System.out.println();   //to get to the next line.

		}
	}
}

