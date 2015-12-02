/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
comment here
*/
public class everyNthElement {

	// Main function
	public static void main(String[] args) {
		
		String inStr = null;		// Input String
		int idx = 0;				// index (Nth)
		
		System.out.println("This program returns the string made starting with char 0 " + 
							"and then every Nth char of the string ");	
		
		// return the string made from string "Miracle"
		// from char 0 and then every 2nd char
		inStr = "Miracle";
		idx = 2;
		everynth(inStr, idx);
		
		// return the string made from string "abcdefg"
		// from char 0 and then every 2nd char
		inStr = "abcdefg";
		idx = 2;
		everynth(inStr, idx);	
		
		// return the string made from string "abcdefg"
		// from char 0 and then every 3rd char
		inStr = "abcdefg";
		idx = 3;
		everynth(inStr, idx);
					
	}
	
	// Function that return the string made starting with char 0, 
	// and then every Nth char of the string 
	// Input : String inStr - input String
	//         int idx      - index (Nth)
	public static void everynth(String inStr, int idx){
		
		String resStr = null;		// Result String
		
		//Print out the input String and index (Nth)
		System.out.println("\nInput String: " + inStr);
		System.out.println("Index (Nth): " + idx);
		
		// Create the new string based on the index (Nth)
		for (int ctr = 0; ctr < inStr.length(); ctr++){
			if ((ctr % idx) == 0){
				if (resStr == null){
					resStr = inStr.substring(ctr, ctr+1);
				}
				else{
					resStr += inStr.substring(ctr, ctr+1);
				}
			}
		}
		
		// Print out the new string
		System.out.println("Output String: " + resStr);
	}
}

