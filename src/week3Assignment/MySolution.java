package week3Assignment;

public class MySolution {

	public static void main(String[] args) {
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //array creation
		int firstElement = ages[0]; //assigning variable for first element
		int lastElement = ages[ages.length - 1]; //assigning variable for last element
		System.out.println(lastElement - firstElement); //prints the difference between first and last element.
		
		
		int sumAges = 0; // creates a new int variable sumAges
		for (int age : ages) { //loops through the array and sums the ages in the sumAges variable
			sumAges += age;
		} 
		double averageAge = sumAges / ages.length; // calculates the average age
		System.out.println("Average age is: " + averageAge); // prints the average age
		
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //creates an array of string names
		
		int sumOfLetters = 0; // creates a new int variable sumOfLetters
		for (String name : names) { //loops through the names array, gets the length of each name and adds them to sumOfLetters.
			int numOfLetters = name.length(); // stores the length of each name to a new int variable numOfLetters
			sumOfLetters += numOfLetters;
		}
		double averageNumOfLetters = sumOfLetters / names.length; //calculates the average number of letters per name in the array.
		System.out.println("average number of letters per name is: " + averageNumOfLetters); //prints the average
		
		String allNames = ""; // creates an empty string
		for (String name : names) { //loops through the array names and adds each name to the string allNames
			if (name == names[0]) { // checks to see if this is the first name on the list. does not add space before the first name
				allNames += name;
			} else {
				allNames += " " + name;
			}
			
		}
		System.out.println(allNames); // prints the string allnames

		
//		3.	How do you access the last element of any array?
		// ANS.	array[array.length – 1];
//		4.	How do you access the first element of any array?
		// ANS.	array[0];
//
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length]; //creates a int array nameLengths
		
		int i = 0; // creates counter for loop
		for (String name : names) { // loops through the names array, gets the length of each name and adds  the length to the array nameLength
			
			int nameLength = name.length(); // gets the length of each name
			nameLengths[i] = nameLength; //adds each name to the array nameLength
			i++; // increases counter
		}
		
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int sumOfLength = 0; //creates an int variable
		for (int length : nameLengths) { //loops through the nameLengths array
			sumOfLength += length; //adds all length
		}
		System.out.println("the sum of all the elements in the array is: " + sumOfLength); //prints sum of length
	}
	
//	7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
//	8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	
	}
	
//	9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	public static void isSumOver100 (int[] array) {
		int sumOfNumbers = 0;
		for (int numbers : array) {
			sumOfNumbers += numbers;
		}
		if (sumOfNumbers > 100) {
			System.out.println((sumOfNumbers > 100));
		}
	}
		
		
//	10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
	public static double arrayAverage (double[] array) {
		double sumOfDouble = 0;
		for (double doubleNum : array) {
			sumOfDouble += doubleNum;
		}
		return sumOfDouble / array.length;
	}
		
		
//	11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	public static void isFirstArrayGreater (double[] array1, double[] array2) {
		double sumOfDouble1 = 0;
		for (double doubleNum1 : array1) {
			sumOfDouble1 += doubleNum1;
		} double average1 = sumOfDouble1 / array1.length;
		
		double sumOfDouble2 = 0;
		for (double doubleNum2 : array1) {
			sumOfDouble2 += doubleNum2;
		} double average2 = sumOfDouble2 / array2.length;
		
		if (average1 > average2) {
			System.out.println(average1 > average2);
		}
	}
	
//	12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static void willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			System.out.println(true);
		}
	}
	
//	13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	public static double fahrenheitToCelcius (double tempF) {
		/*
		 * This is a method that converts temperature from Fahrenheit(F) to Celcius(C). it takes a double and returns a double.
		 */
		double tempC = (tempF - 32) * (5/9);
		return tempC;
	} 

}
