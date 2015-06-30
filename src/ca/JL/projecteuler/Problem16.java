package ca.JL.projecteuler;

import java.math.BigInteger;

public class Problem16 {
	public static void main(String args[]){
		int sum = 0;
		// BigInteger gets 2^1000 and convert to string
		String result = BigInteger.valueOf(2).pow(1000).toString();
		
		// For each character in the number put in array add them up
		for (char s : result.toCharArray()){
			sum += Character.getNumericValue(s);
		}
		System.out.println(sum);
	}

}
