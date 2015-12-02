// [3] Given a string, return a string made of the first 2 chars (if present), 
// however include first char only if it is 'o' and include the second only if it is 'z', 
// so "ozymandias" yields "oz". 

// startOz("ozymandias") - "oz"
// startOz("bzoo") - "z"
// startOz("oxx") - "o"

public class StartOz {

	// Main Function
	public static void main(String[] args) {
		
		String resultStr = null;	// result string
		
		System.out.println("This program returns 2 starting character of the input string "
				+ "when the 1st char is o and the 2nd is z");
		
		// output the first 2 characters of "ozymandias"
		resultStr = startOz("ozymandias");
		System.out.println("Output String: " + resultStr);
		
		// output the first 2 characters of "bzoo"
		resultStr = startOz("bzoo");
		System.out.println("Output String: " + resultStr);
		
		// output the first 2 characters of "oxx"
		resultStr = startOz("oxx");
		System.out.println("Output String: " + resultStr);
		
	}
	
	// Function that returns 2 starting character when the 1st char is "o" and the 2nd is "z"	
	// Input: String inStr - input string
	// Return: string - starting character
	public static String startOz(String inStr){
		String resultStr = null;	// result string
		
		// Print out the input
		System.out.println("\nInput String: " + inStr);

		// Get the first 2 char and return it
		if (inStr.substring(0,1).equals("o") == true){
			resultStr = inStr.substring(0, 1);

		}
		if (inStr.substring(1,2).equals("z") == true){
			if(resultStr == null){
				resultStr = inStr.substring(1,2);
			}
			else {
				resultStr += inStr.substring(1,2);
			}
		}
		return resultStr;
	}

}
