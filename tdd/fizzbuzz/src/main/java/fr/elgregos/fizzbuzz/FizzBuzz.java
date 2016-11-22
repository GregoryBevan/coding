package fr.elgregos.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public String of(int i) {
		String result = "";

		if (isDivisibleBy3(i)) {
			result += "Fizz";
		}
		if (isDivisibleBy5(i)) {
			result += "Buzz";
		}

		if (!result.isEmpty()) {
			return result;
		}

		return String.valueOf(i);
	}

	private boolean isDivisibleBy5(int i) {
		return i % 5 == 0;
	}

	private boolean isDivisibleBy3(int i) {
		return i % 3 == 0;
	}

	public String generate(int max) {
		return IntStream.rangeClosed(1, max).mapToObj(this::of).collect(Collectors.joining(" "));
	}

}
