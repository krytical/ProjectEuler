package ca.JL.projecteuler;

public class Problem12 {
	public static int numDivisors(int n){
		int count = 0;

		for (int i = 1; i * i <= n; i++){
			if (n % i == 0){
				// i and n / i are different divisors
				if (i*i < n){
					count += 2;
				}
				// i = n / i is a divisor
				else{
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args){
		int num = 0;
		int triangleNumber = 0;

		while(true){
			num++;
			triangleNumber += num;
			if(numDivisors(triangleNumber) > 500){
				System.out.println(triangleNumber);
				break;
			}

		}
	}

}
