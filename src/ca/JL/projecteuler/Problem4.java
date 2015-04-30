package ca.JL.projecteuler;

public class Problem4 {
	public boolean isPalindrome(String s){
		//Check if odd so you can remove the middle character
		if (s.length() % 2 != 0){
			s = s.substring(0, s.length() / 2) + s.substring((s.length()/2) + 1);
		}
		
		// Take first half and reverse it then check if it is equal to the last half
		return new StringBuffer(s.substring(0, s.length() / 2)).reverse().toString().equals(s.substring(s.length()/2));
	}
	
	public static void main(String[] args){
		
		Problem4 p = new Problem4();
		int biggest = 0;
		
		for (int a = 999; a > 0; a--){
			for (int b = 999; b > 0; b--){
				if (p.isPalindrome(new Long(a*b).toString())){
					if (a*b > biggest){
						biggest = a*b;
					}
				}
			}
		}
		System.out.println(biggest);
	}
}
