package ca.JL.projecteuler;

public class Problem7 {
	public boolean isPrime(long n){
		// 1 is not a prime number
		if (n == 1){
			return false;
		}
		// Check even numbers, 2 is a prime number
		if ( n % 2 == 0 && n != 2)
			return false;

		// Check odd numbers
		for ( int i = 3; i*i <= n; i += 2 )
		{
			if ( n % i == 0 )
				return false;
		}

		return true;
	}
	
	public static void main(String[] args){
		
		Problem7 p = new Problem7();
		
		int n = 0;
		int prime = 0;

		while (n < 6){
			for (int i = 1; n != 6; i++){
				if (p.isPrime(i)){
					prime = i;
					n++;
				}
			}

		}
		System.out.println(prime);

	}
}