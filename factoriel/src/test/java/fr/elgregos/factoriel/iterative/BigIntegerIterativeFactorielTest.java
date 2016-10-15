package fr.elgregos.factoriel.iterative;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerIterativeFactorielTest {
	
	private BigIntegerIterativeFactoriel iterativeFactoriel = new BigIntegerIterativeFactoriel();

	@Test
	public void test_with_0() {
		assertEquals(BigInteger.valueOf(1), iterativeFactoriel.calc(0));
	}
	@Test
	public void test_with_1() {
		assertEquals(BigInteger.valueOf(1), iterativeFactoriel.calc(1));
	}
	@Test
	public void test_with_2() {
		assertEquals(BigInteger.valueOf(2), iterativeFactoriel.calc(2));
	}
	@Test
	public void test_with_5() {
		assertEquals(BigInteger.valueOf(120), iterativeFactoriel.calc(5));
	}
	@Test
	public void test_with_10() {
		assertEquals(BigInteger.valueOf(3628800), iterativeFactoriel.calc(10));
	}

}
