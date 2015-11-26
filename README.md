Please write different methods one java file to solve each question
====================================================================================

[1] Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"


[2] Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7. 

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true

[3] Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". 

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

[4] Given two temperatures, return true if one is less than 0 and the other is greater than 100. 

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false

[5] Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"

[6] Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. 

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0


[7] We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both. 

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
==============================================================================================================
How to Submit your changes:-

i.  Fork the GitHub repository at https://github.com/himanshu5jan/jWarmUp4Selenium.git to create a copy under your own account.
ii. Clone your forked GitHub repository to your computer so that you can edit the files locally on your own machine. 
iii. Edit the Java file contained in the git repository and place your solution in that file (please do not rename the file).
iv. Commit your completed Java file into YOUR git repository and push your git branch to the GitHub repository under your account.
v. Submit through email your GitHub repository that contains the completed Java code for the assignment.
