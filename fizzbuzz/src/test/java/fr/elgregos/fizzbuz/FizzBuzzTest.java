package fr.elgregos.fizzbuz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void test_get_value_returns_number_as_string() {
		assertEquals("1", fizzBuzz.getValue(1));
		assertEquals("2", fizzBuzz.getValue(2));
	}
	
	@Test
	public void test_get_value_returns_fizz_for_number_multiple_by_3() {
		assertEquals("fizz", fizzBuzz.getValue(3));
		assertEquals("fizz", fizzBuzz.getValue(6));
		assertEquals("fizz", fizzBuzz.getValue(9));
	}

	
	@Test
	public void test_get_value_returns_buzz_for_number_multiple_by_5() {
		assertEquals("buzz", fizzBuzz.getValue(5));
		assertEquals("buzz", fizzBuzz.getValue(10));
	}

	
	@Test
	public void test_get_value_returns_buzz_for_number_multiple_by_3_and_by_5() {
		assertEquals("fizzbuzz", fizzBuzz.getValue(15));
		assertEquals("fizzbuzz", fizzBuzz.getValue(30));
	}

}
