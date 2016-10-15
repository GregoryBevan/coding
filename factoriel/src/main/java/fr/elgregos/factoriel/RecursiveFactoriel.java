package fr.elgregos.factoriel;

public class RecursiveFactoriel {

	public static int calc(int n) {
		if (n > 1) {
			return n * calc(n - 1);
		}
		return n;
	}

	public static void main(String... args) {
		final int n = Integer.parseInt(args[0]);
		System.out.println(calc(n));
	}

}
