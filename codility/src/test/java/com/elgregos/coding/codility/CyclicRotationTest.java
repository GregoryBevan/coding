package com.elgregos.coding.codility;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void test() {
		CyclicRotation cyclicRotation = new CyclicRotation();
		int[] A = new int[]{3, 8, 9, 7, 6};
		int N = 4;
		int K = 3;
		assertTrue(Arrays.equals(new int[] {9,7, 6, 3, 8}, cyclicRotation.solution(A, N, K)));
	}

}
