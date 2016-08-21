package com.elgregos.coding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void test() {
		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		assertEquals(-11, tapeEquilibrium.solution(new int[] { 1, 12 }, 2));
		assertEquals(-11, tapeEquilibrium.solution(new int[] { 1, 12, 5 }, 3));
	}

}
