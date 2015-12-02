
// [2] Given two non-negative int values,
// return true if they have the same last digit,
// such as with 27 and 57. Note that the % "mod" operator computes remainders, 
// so 17 % 10 is 7. 

// lastDigit(7, 17) - true
// lastDigit(6, 17) - false
// lastDigit(3, 113) - true

public class LastDigit {

	// Main Function
	public static void main(String[] args) {
		
		boolean status = false;		// Status
		
		System.out.println("This program return true if 2 non-negative values" + 
							"have the same last digit");
		
		// Check same last digit for 7 and 17
		status = lastDigit(7, 17);
		System.out.println("Status: " + status);
		
		// Check same last digit for 6 and 17
		status = false;
		status = lastDigit(6, 17);
		System.out.println("Status: " + status);
		
		// Check same last digit for 3 and 113
		status = false;
		status = lastDigit(3, 113);
		System.out.println("Status: " + status);
		
		// Check same last digit for 113 and 3
		status = false;
		status = lastDigit(113, 3);
		System.out.println("Status: " + status);

	}
	// Function that returns true if 2 non-negative values have the same last digit
	// Input: int inDigit1 - Input Integer 1
	//        int inDigit2 - Input Integer 2
	// Return: true - same last digit
	//		   false - not same last digit
	public static boolean lastDigit(int inDigit1, int inDigit2){
		
		int result1 = 0;
		int result2 = 0;
		
		// Print out the inputs
		System.out.println("\nInput Integer 1: " + inDigit1);
		System.out.println("Input Integer 2: " + inDigit2);
		
		// Find the remainder of both input when divide by 10
		result1 = inDigit1 % 10;
		result2 = inDigit2 % 10;
		
		// Check if remainder is same and return true
		if (result1 == result2){
			return true;
		}
		
		// return false if not same digit
		return false;		
		
	}

}
