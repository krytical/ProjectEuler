package ca.JL.projecteuler;

import java.math.BigInteger;

public class Problem20 {
	public static void main(String args[]){
		BigInteger value = BigInteger.ONE;
		int sum = 0;
		
		// Start at 2 because don't need to multiply by 1
		for (int i = 2; i < 101; i++){
			value = value.multiply(BigInteger.valueOf(i));
		}
		String s = value.toString();
		for (char a : s.toCharArray()){
			sum += Character.getNumericValue(a);
		}
		System.out.print(sum);
	}

}
