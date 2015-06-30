package ca.JL.projecteuler;

public class Problem15 {
	public static void main(String[] args){
		// Default length is 1
		long path = 1;
		int gridSize = 20;
		
		// Combinatorics		
		for (int i = 0; i < gridSize; i++){
			// path is gridsize factorial
			path *= (2 * gridSize) - i;
			path /= i+1;
		}
		System.out.println(path);

	}
}
