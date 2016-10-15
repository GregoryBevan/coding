package fr.elgregos.factoriel.recursive;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerRecursiveFactorielTest {
	
	private BigIntegerRecursiveFactoriel recursiveFactoriel = new BigIntegerRecursiveFactoriel();

	@Test
	public void test_with_0() {
		assertEquals(BigInteger.valueOf(1), recursiveFactoriel.calc(0));
	}
	@Test
	public void test_with_1() {
		assertEquals(BigInteger.valueOf(1), recursiveFactoriel.calc(1));
	}
	@Test
	public void test_with_2() {
		assertEquals(BigInteger.valueOf(2), recursiveFactoriel.calc(2));
	}
	@Test
	public void test_with_5() {
		assertEquals(BigInteger.valueOf(120), recursiveFactoriel.calc(5));
	}
	@Test
	public void test_with_10() {
		assertEquals(BigInteger.valueOf(3628800), recursiveFactoriel.calc(10));
	}

}
