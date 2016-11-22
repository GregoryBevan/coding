package fr.elgregos.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void fizzbuzz_of_1_is_1() {
		assertEquals("1", fizzBuzz.of(1));
	}

	@Test
	public void fizzbuzz_of_2_is_2() {
		assertEquals("2", fizzBuzz.of(2));
	}

	@Test
	public void fizzbuzz_of_3_is_fizz() {
		assertEquals("Fizz", fizzBuzz.of(3));
	}

	@Test
	public void fizzbuzz_of_5_is_buzz() {
		assertEquals("Buzz", fizzBuzz.of(5));
	}

	@Test
	public void fizzbuzz_of_6_is_fizz() {
		assertEquals("Fizz", fizzBuzz.of(6));
	}

	@Test
	public void fizzbuzz_of_10_is_buzz() {
		assertEquals("Buzz", fizzBuzz.of(10));
	}

	@Test
	public void fizzbuzz_of_15_is_buzz() {
		assertEquals("FizzBuzz", fizzBuzz.of(15));
	}

	@Test
	public void fizzbuzz_string_for_1_to_30() {
		assertEquals(
				"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz",
				fizzBuzz.generate(30));
	}
}
