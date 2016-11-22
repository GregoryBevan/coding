package fr.elgregos.factoriel.stream;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorielWithStreamTest {

	FactorielWithStream factoriel;

	@Before
	public void setup() {
		factoriel = new FactorielWithStream();
	}

	@Test
	public void factoriel_0_is_1() {
		assertEquals(1, factoriel.calc(0));
	}

	@Test
	public void factoriel_1_is_1() {
		assertEquals(1, factoriel.calc(1));
	}

	@Test
	public void factoriel_2_is_2() {
		assertEquals(2, factoriel.calc(2));
	}

	@Test
	public void factoriel_5_is_120() {
		assertEquals(120, factoriel.calc(5));
	}

	@Test
	public void factoriel_10_is_3628800() {
		assertEquals(3628800, factoriel.calc(10));
	}

}
