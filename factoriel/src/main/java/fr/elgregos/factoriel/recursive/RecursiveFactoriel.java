package fr.elgregos.factoriel.recursive;

public class RecursiveFactoriel {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println("Factoriel " + n + ": " + new RecursiveFactoriel().calc(n));
	}

	protected long calc(int n) {
		if(n > 1) {
			return n * calc(n-1);
		}
		return 1;
	}
}
