// [5] Given a non-empty string and an int n, 
// return a new string where the char at index n has been removed.
// The value of n will be a valid index of a char in the original string 
// (i.e. n will be in the range 0..str.length()-1 inclusive). 

// missingChar("kitten", 1) - "ktten"
// missingChar("kitten", 0) - "itten"
// missingChar("kitten", 4) - "kittn"
public class MissingCharacter {

	public static void main(String[] args) {
		
		String newStr = null;	// new String
		
		System.out.println("This program new string where the char"
				+ " at index n has been removed");
		
		// Create new String removing character at index 1
		newStr = missingChar("Kitten", 1);
		System.out.println("Output String: " + newStr);
		
		// Create new String removing character at index 0
		newStr = missingChar("Kitten", 0);
		System.out.println("Output String: " + newStr);
		
		// Create new String removing character at index 4
		newStr = missingChar("Kitten", 4);
		System.out.println("Output String: " + newStr);

	}
	// Function that returns new string where the char at index n has been removed	
	// Input: int inDigit1 - Input Integer 1
	//        int inDigit2 - Input Integer 2
	// Return: string - new string
	public static String missingChar(String inStr, int idx){
		
		String resStr = null;		// result new string
		
		// Print out the inputs
		System.out.println("\nInput String: " + inStr);
		System.out.println("Index: " + idx);
		
		// Create a new string where the char at index n has been removed
		resStr = inStr.substring(0, idx);
		resStr += inStr.substring(idx+1, inStr.length());
		
		// return new string
		return resStr;	
	}
}
