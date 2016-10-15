package fr.elgregos.factoriel.recursive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursiveFactorielTest {
	
	private RecursiveFactoriel recursiveFactoriel = new RecursiveFactoriel();

	@Test
	public void test_with_0() {
		assertEquals(1, recursiveFactoriel.calc(0));
	}
	@Test
	public void test_with_1() {
		assertEquals(1, recursiveFactoriel.calc(1));
	}
	@Test
	public void test_with_2() {
		assertEquals(2, recursiveFactoriel.calc(2));
	}
	@Test
	public void test_with_5() {
		assertEquals(120, recursiveFactoriel.calc(5));
	}
	@Test
	public void test_with_10() {
		assertEquals(3628800, recursiveFactoriel.calc(10));
	}

}
