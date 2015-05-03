package ca.JL.projecteuler;

public class Problem10 {
	public boolean isPrime(long n){
		// 1 is not a prime number
		if(n == 1){
			return false;
		}
		// 2 is a prime number
		if (n % 2 == 0 && n != 2){
			return false;
		}
		for (int i = 3; i*i <= n; i += 2){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Problem10 p = new Problem10();

		long sum = 0;
		for (long i = 0; i <= 2000000 ; i++){
			if (p.isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
