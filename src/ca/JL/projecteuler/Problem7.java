package ca.JL.projecteuler;

public class Problem7 {
	public boolean isPrime(long n){

		// Check even numbers
		if ( n % 2 == 0 )
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

		while (n < 10001){
			for (int i = 1; n != 10001; i++){
				if (p.isPrime(i)){
					prime = i;
					n++;
				}
			}

		}
		System.out.println(prime);

	}
}