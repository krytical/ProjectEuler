package ca.JL.projecteuler;

public class Problem5 {
	public static void main(String[] args){
		long a = 21;
		boolean divisible = true;

		while (true){
			for (int i = 1; i <= 20; i++){
				divisible = true;
				if (a % i != 0){
					divisible = false;
					break;
				}
			}
			
			if (divisible){
				System.out.println(a);
				// Stops after finding the first number divisible by numbers 1 - 20
				System.exit(0);
			}
			
			a++;
		}
		
	}

}
