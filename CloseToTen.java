// [6] Given 2 int values, 
// return whichever value is nearest to the value 10, 
// or return 0 in the event of a tie. Note that Math.abs(n)
// returns the absolute value of a number. 

// close10(8, 13) - 8
// close10(13, 8) - 8
// close10(13, 7) - 0
public class CloseToTen {

	// Main Function
	public static void main(String[] args) {
		int resultInt = 0;		// result
		
		System.out.println("This Program returns whichever value between "
				+ "2 integer is nearest to the value 10");
		
		// Find which is nearest to 10 between 8 and 13
		resultInt = close10(8,13);
		System.out.println("Result: " + resultInt);
		
		// Find which is nearest to 10 between 13 and 8
		resultInt = close10(13,8);
		System.out.println("Result: " + resultInt);
		
		// Find which is nearest to 10 between 13 and 7
		resultInt = close10(13,7);
		System.out.println("Result: " + resultInt);

	}
	
	// Function that returns whichever value between 2 integer is close to 10
	// Input: int inInt1 - Input Integer 1
	//        int inInt2 - Input Integer 2
	// Return: int - the integer that is close to 10
	// Comment: when both value equally close to 10 the return is 0
	public static int close10(int inInt1, int inInt2){
		int diff1 = 0;
		int diff2 = 0;
		
		// Print out the inputs
		System.out.println("\nFirst integer: " + inInt1);
		System.out.println("Second integer: " + inInt2);
		
		// obtain the absolute value difference of both inputs from 10
		diff1 = Math.abs(inInt1 - 10);
		diff2 = Math.abs(inInt2 - 10);
		
		// check which value is closer to 10
		if (diff1 > diff2){
			return inInt2;
		}
		else if (diff1 < diff2){
			return inInt1;
		}
		else{
			return 0;
		}	
	}

}
