package fr.elgregos.fizzbuz;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five
 * print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz?".
 * 
 * @author Grégory
 */
public class FizzBuzz {

	public String getValue(int number) {
		if(number % 15 == 0) {
			return "fizzbuzz";
		}
		if(number % 3 == 0) {
			return "fizz";
		}
		if (number % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(number);
	}

	public static void main(String... args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		for(int number = 1; number < 100; number++) {
			System.out.println(fizzBuzz.getValue(number));
		}
	}
}
