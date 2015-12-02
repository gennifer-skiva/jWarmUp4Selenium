// [7] We'll say that a number is "teen" 
// if it is in the range 13..19 inclusive. 
// Given 2 int values, return true if one or the other is teen, but not both. 

// loneTeen(13, 99) - true
// loneTeen(21, 19) - true
// loneTeen(13, 13) - false
public class LoneTeen {

	// Main Function
	public static void main(String[] args) {
		
		boolean status = false;	
		
		System.out.println("This program returns true if one of the 2 input "
				+ "is between 13-19, but not both.");  
				
		// Check 13 and 99
		status = loneTeen(13, 99);
		System.out.println(status);
		
		// Check 21 and 19
		status = loneTeen(21, 19);
		System.out.println(status);
		
		// Check 12 and 19
		status = loneTeen(12, 19);
		System.out.println(status);
		
		// Check 13 and 13
		status = loneTeen(13, 13);
		System.out.println(status);
		
		// Check 20 and 20
		status = loneTeen(20, 20);
		System.out.println(status);
		
		// Check 20 and 20
		status = loneTeen(12, 12);
		System.out.println(status);

	}
	
	// Function that returns true if one of the 2 input is between 13-19, but not both.
	// Input: int inAge1 - Input Age 1
	//        int inAge2 - Input Age 2
	// Return: true - one of the age is 13-19
	//		   false - both age is 13-19 or not 13-19
	public static boolean loneTeen(int inAge1, int inAge2){
		
		// Print out the inputs
		System.out.println("\nInput Age 1: " + inAge1);
		System.out.println("Input Age 2: " + inAge2);
		
		
		//Check whether 1 of the input is between 13-19
		if (inAge1 >= 13 && inAge1 <=19){
			if (inAge2 >= 13 && inAge2 <=19){
				return false;
			}
			else{
				return true;
			}
			
		}
		else if (inAge2 >= 13 && inAge2 <=19){
			return true;
		}
		else{
			return false;
		}		
	}

}
