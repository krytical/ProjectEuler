package ca.JL.projecteuler;

public class Problem2 {
	public static void main(String[] args) {
		int fib = 1;
		int fibold = 0;
		int fibtemp = 0;
		int total = 0;
		
		while (fib < 4000000){
			// fibtemp saves current fib value
			fibtemp = fib;
			// fib + previous fib value
			fib += fibold;
			// fibold gets fib value
			fibold = fibtemp;
			
			if (fib % 2 == 0){
				total += fib;
			}
		}
		System.out.println(total);
	}
}
