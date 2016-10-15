package fr.elgregos.factoriel.iterative;

import java.math.BigInteger;

public class BigIntegerIterativeFactoriel {
	
	public static void main(String... args) {
		System.out.println("Factoriel 100: " + new BigIntegerIterativeFactoriel().calc(1000).toString());
	}

	public BigInteger calc(int n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
