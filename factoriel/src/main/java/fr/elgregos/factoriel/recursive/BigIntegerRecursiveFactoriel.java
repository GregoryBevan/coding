package fr.elgregos.factoriel.recursive;

import java.math.BigInteger;

public class BigIntegerRecursiveFactoriel {

  public BigInteger calc(int n) {
    if(n > 1) {
      return BigInteger.valueOf(n).multiply(calc(n-1));
    }

    return BigInteger.ONE;
  }

}
