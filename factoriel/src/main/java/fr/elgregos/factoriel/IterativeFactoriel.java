package fr.elgregos.factoriel;

public class IterativeFactoriel {

	public static void main(String... args) {
		final int n = Integer.parseInt(args[0]);
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Result :" + result);
	}

}
