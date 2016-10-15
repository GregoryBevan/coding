package fr.elgregos.factoriel.iterative;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IterativeFactorielTest {
	
	private IterativeFactoriel iterativeFactoriel = new IterativeFactoriel();

	@Test
	public void test_with_0() {
		assertEquals(1, iterativeFactoriel.calc(0));
	}
	@Test
	public void test_with_1() {
		assertEquals(1, iterativeFactoriel.calc(1));
	}
	@Test
	public void test_with_2() {
		assertEquals(2, iterativeFactoriel.calc(2));
	}
	@Test
	public void test_with_5() {
		assertEquals(120, iterativeFactoriel.calc(5));
	}
	@Test
	public void test_with_10() {
		assertEquals(3628800, iterativeFactoriel.calc(10));
	}

}
