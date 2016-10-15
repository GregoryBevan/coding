package fr.elgregos.factoriel.iterative;

public class IterativeFactoriel {

  public static void main(String... args) {
    int n = Integer.parseInt(args[0]);
	System.out.println("Factoriel " + n + ": "+ new IterativeFactoriel().calc(n));
  }

  public long calc(int n) {
    long result = 1;
    for(int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
