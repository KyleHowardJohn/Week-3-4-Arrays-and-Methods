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
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		//b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 48};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int total = 0;
		for (int i = 0 ; i < ages2.length; i++) {
			total += ages2[i];
		}
		System.out.println(total/ages.length);
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. 
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		int total1 = 0;
		for (int counter = 0; counter < names.length; counter++) {
			total1 += names[counter].length();
		}
		System.out.println(total1/names.length);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
				//print the result to the console.
		String people = "";
		for(int i = 0; i < names.length; i++) {
			people += names[i] + " ";
		}
		System.out.println(people);
		
		//3. How do you access the last element of any array? 
		// The last element of any array is located at index:	arrayName.length - 1

		//4. How do you access the first element of any array? 
		// The first element in any array is located at index:	0
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array. 
		
		int[] nameLengths = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. 
		
		int total2 = 0;
		for(int numbers : nameLengths) {
			total2 += numbers;
		}
		System.out.println(total2); 
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
		
		String Beetlejuice = multiplyString("Beetlejuice", 3);
		System.out.println(Beetlejuice);
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space). 
		
		String firstName = "Kyle";
		String lastName = "Schoenheit";
		String legalName = myLegalName(firstName, lastName);
		System.out.println(legalName);
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. 
		
		int[] numbers = {20, 30, 40, 50}; 
		System.out.println(arraySumOfNumbers(numbers));
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array. 
		
		double[] array = {16, 21, 30, 50, 65};
		System.out.println(calculatedAverage(array));
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array. 
		
		double[] arrayPartTwo = {17, 22, 31, 51, 66};
		System.out.println(calculatedAveragePartTwo(array, arrayPartTwo));
		
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
		
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
		
		boolean thereIsCake = false;
		boolean iWasToldThereWasCake = true;
		System.out.println(theCakeIsALie (thereIsCake, iWasToldThereWasCake));
		
	} // end of main

	//7. Method
	public static String multiplyString(String word, int n) {
		String basket = "";
		for(int k = 0; k < n; k++) {
			basket += word;
		}
		return basket;
		}
	
	//8. Method
	public static String myLegalName(String x, String y) {
		return x + " " + y;
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
			return false;
		}
	}
	
	//10. Method
	public static double calculatedAverage(double[] array) {
		double total = 0;
		for(double number : array) {
			total += number;
		}
		return total / array.length;
	}
	
	//11. Method
	public static boolean calculatedAveragePartTwo(double[] array, double[] arrayPartTwo) {
		double sum = 0;
		for(double numbers : array) {
			sum += numbers / array.length;
		}
		double total = 0;
		for(double numbers : arrayPartTwo) {
			total += numbers / arrayPartTwo.length;
		}
		if(sum > total) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	//12. Method
	public static boolean willBuyDrink(boolean temp, double money) {
		if(temp == true && money > 10.50) {
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
