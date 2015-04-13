package ca.JL.projecteuler;

public class Problem3 {
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

	public static void main(String[] args)
	{
		Problem3 p = new Problem3();
		
		//long prime = 13195L;
		long prime = 600851475143L;
		long d = 2;
		while (true)
		{
			// Divide prime number by each number and try until largest prime factor is found.
			long tmp = prime / d;
			if ( prime % tmp == 0 && p.isPrime(tmp) )
			{
				System.out.println("Largest prime factor: " + tmp);
				break;
			}
			d++;
		}
	}
}