/**
 * 
 */
package week34CodingAssignment;

/**
 * @author Kyle
 *
 */
public class Week34CodingAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93. 
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		
		System.out.println("Question 1.A: " + (ages[ages.length - 1] - ages[0]));
		//using 'ages[ages.length - 1]' I'm calling on the last element without having to specify 'ages[7]'
		
		//b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 46};
		System.out.println("Question 1.B: " + (ages2[ages2.length - 1] - ages2[0]));
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int total = 0;
		for (int i = 0 ; i < ages2.length; i++) {
			total += ages2[i];
		}
		System.out.println("Question 1.C: " + total/ages2.length);
		//This for loop iterates int 'i' thru ages2.length array, counting until it equals the array
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. 
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		int total1 = 0;
		for (int counter = 0; counter < names.length; counter++) {
			total1 += names[counter].length();
		}
		System.out.println("Question 2.A: " + total1/names.length);
		//This for loop iterates the int 'counter' thru the names.length array, counting until it equals the array
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
			//print the result to the console.
		String people = "";
		for(int i = 0; i < names.length; i++) {
			people += names[i] + " ";
		}
		System.out.println("Question 2.B: " + people);
		//This for loop iterates the int 'i' thru the names.length array, counting until it equals the array
		
		//3. How do you access the last element of any array? 
		System.out.println("Question 3: arrayName.length - 1");

		//4. How do you access the first element of any array? 
		System.out.println("Question 4: index:	0");
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array. 
		
		int[] nameLengths = new int [names.length]; //This is where I create the new array & have it correlate to the previous array, setting up the for loop
		for (int i = 0; i < names.length; i++) { //This for loop iterates int 'i' thru the previous array until it equals the previous array 
			nameLengths[i] = names[i].length(); //Once it's iterated enough I have that iteration equal to the new array, thus giving it the same value
		}
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. 
		
		int total2 = 0;
		for(int numbers : nameLengths) { //Using a for each loop I'm telling 'numbers' to iterate thru 'nameLengths' array for every element and add it
			total2 += numbers; 
		}
		System.out.println("Question 6: " + total2); 
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
		
		String Beetlejuice = multiplyString("Beetlejuice ", 3);
		System.out.println("Question 7: " + Beetlejuice);
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space). 
		
		String firstName = "Kyle";
		String lastName = "Schoenheit";
		String legalName = myLegalName(firstName, lastName);
		System.out.println("Question 8: " + legalName);
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. 
		
		int[] numbers = {20, 30, 40, 50}; 
		System.out.println("Question 9: " + arraySumOfNumbers(numbers));
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array. 
		
		double[] digitsOne = {16, 21, 30, 50, 65};
		System.out.println("Question 10: " + calculatedAverage(digitsOne));
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array. 
		
		double[] digitsTwo = {17, 22, 31, 51, 66};
		System.out.println("Question 11: " + calculatedAveragePartTwo(digitsOne, digitsTwo));
		
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
		
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		System.out.println("Question 12: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
		//This method evaluates two booleans of true/false statements
		//If BOTH statements are TRUE it returns a string with real cake. If EITHER statements are FALSE it returns a string the cake is a lie
		
		boolean thereIsCake = false;
		boolean iWasToldThereWasCake = true;
		System.out.println("Question 13: " + theCakeIsALie(thereIsCake, iWasToldThereWasCake));
		
	} // end of main

	//7. Method
	public static String multiplyString(String word, int n) {
		String basket = ""; 
		for(int k = 0; k < n; k++) {
			basket += word; //placing basket inside the for loop causes it to have word added to variable basket n number of times
		}
		return basket; //once the iteration is completed, basket, containing the new concatenated String is returned to Main
		}
	
	//8. Method
	public static String myLegalName(String x, String y) { 
		return x + " " + y; //The return includes the ask to have both names plus a space without having to put it into the sys.out line
	}
	
	//9. Method
	public static boolean arraySumOfNumbers(int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		if(sum > 100) {
			return true;
		}
		else {
			return false; //placing my if else statement within the for each loop allows the ask to be executed and returned from sum->number->numbers
		}
	} 
	
	//10. Method
	public static double calculatedAverage(double[] digitsOne) {
		double total = 0;
		for(double number : digitsOne) { // similar to Question 6, for each loop  telling 'number' to iterate thru 'array' digitsOne for every element and add it
			total += number;
		}
		return total / digitsOne.length;
	}
	
	//11. Method
	public static boolean calculatedAveragePartTwo(double[] digitsOne, double[] digitsTwo) {
		double sum = 0;
		for(double numbers : digitsOne) { //First for each loop
			sum += numbers / digitsOne.length;
		}
		double total = 0;
		for(double numbers : digitsTwo) { //Second for each loop
			total += numbers / digitsTwo.length;
		}
		if(sum > total) {
			return true;
		} 
		else {
			return false;
		}
	} //Each loop iterates until both Sum & Total are complete, then if-else executes and returns TRUE or FALSE
	
	//12. Method
	public static boolean willBuyDrink(boolean temp, double money) {
		if(temp == true && money > 10.50) { // using && in the if loop to make sure both the boolean & double have to meet conditions in order to return TRUE
		return true;
		}
		return false;
		}
	
	//13. Method
	public static String theCakeIsALie(boolean cake, boolean word) {
		if(cake == true && word == true) {
		return ("The Cake Is Real");
		}
		return ("The Cake Is A Lie");
	}
}
