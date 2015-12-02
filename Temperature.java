// [4] Given two temperatures, 
// return true if one is less than 0 and the other is greater than 100. 

// icyHot(120, -1) - true
// icyHot(-1, 120) - true
// icyHot(2, 120) - false

public class Temperature {

	// Main Function
	public static void main(String[] args) {

		boolean status = false;		// status
		
		System.out.println("This program return true if one is less than 0 "
				+ "and the other is greater than 100");
		
		// Check the temperature 120 and -1
		status = icyHot(120, -1);
		System.out.println("Status: " + status);
		
		// Check the temperature -1 and 120
		status = false;
		status = icyHot(-1, 120);
		System.out.println("Status: " + status);
		
		// Check the temperature 2 and 120
		status = false;
		status = icyHot(2, 120);
		System.out.println("Status: " + status);
		
		// Check the temperature -2 and -120
		status = false;
		status = icyHot(-2, -120);
		System.out.println("Status: " + status);				
	}
	
	// Function that returns true if one is less than 0 and the other is greater than 100
	// Input: int inTemp1 - Input Temperature 1
	//        int inTemp2 - Input Temperature 2
	// Return: true - one is less than 0 and the other is greater than 100
	//		   false - other case
	public static boolean icyHot(int inTemp1, int inTemp2){
		
		// Print out the inputs
		System.out.println("\nInput Integer 1: " + inTemp1);
		System.out.println("Input Integer 2: " + inTemp2);
		
		//check if one is less than 0 and the other is greater than 100
		if ((inTemp1 > 100 && inTemp2 < 0) || (inTemp1 < 0 && inTemp2 > 100)) {
			return true;	
		}
		return false;
		
	}

}
