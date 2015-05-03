package ca.JL.projecteuler;

public class Problem9 {
	public static void main(String[] args){
		int sum = 1000;
		// Check for a value to be less than 1000
		for (int a = 1; a < sum; a++){
			// Check for b value to be less than 1000
			for (int b = 1; b < sum; b++){
				// Check for c value to be less than 1000
				for (int c = 1; c < sum; c++){
					// a < b < c and the sum of the 3 variables equal 1000
					// c^2 = a^2 + b^2
					if (a < b && b < c && a + b + c == sum && (c*c == a*a + b*b)){
						System.out.println(a * b * c);
						return;
					}
				}
			}
		}
	}
}
