/**
 * 
 */
package com.elgregos.coding.codility;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last
 * element of the array is also moved to the first place.
 * 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will
 * be shifted to the right by K indexes.
 * 
 * Write a function:
 * 
 * struct Results solution(int A[], int N, int K);
 * 
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 * 
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * 
 * Assume that:
 * 
 * N and K are integers within the range [0..100]; each element of array A is an integer within the range [-1,000..1,000].
 * 
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 * 
 * @author Grégory
 */
public class CyclicRotation {

	public int[] solution(int A[], int N, int K) {
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.addAll(Arrays.stream(A).boxed().collect(Collectors.toList()));
		for (int i = 0; i < K; i++) {
			Integer pollLast = arrayDeque.pollLast();
			arrayDeque.addFirst(pollLast);
		}
		int[] result = arrayDeque.stream().mapToInt(Integer::intValue).toArray();
		return result;
	}

}
