package ca.JL.projecteuler;

public class Problem6 {
	public static void main(String[] args){
		int squareSum = 0;
		int sumSquare = 0;
		
		for (int i = 1; i <= 100; i++){
			sumSquare += i*i;
		}
		
		for (int j = 1; j <= 100; j++){
			squareSum += j;
		}
		
		squareSum = squareSum * squareSum;
		
		
		System.out.println(squareSum - sumSquare);
	}

}
