package com.elgregos.coding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	@Test
	public void test() {
		final OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
		assertEquals(5, oddOccurrencesInArray.solution(new int[]{5}, 1));
		assertEquals(7, oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}, 1));
	}

}
