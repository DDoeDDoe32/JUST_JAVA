package javabook.ch3;

import java.math.BigInteger;

public class test2 {
  public static void main(String[] args) {
	  System.out.format("%d! = %d%n", 7, factorial(7));
  }
  
  public static BigInteger factorial(int n) {
    BigInteger fac = BigInteger.ONE;

    for (int i = 1; i <= n; i++)
      fac = fac.multiply(BigInteger.valueOf(i));

    return fac;
  }

}