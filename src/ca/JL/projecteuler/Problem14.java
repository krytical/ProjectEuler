package ca.JL.projecteuler;

import java.util.LinkedList;

public class Problem14 {
	public static void main(String[] args){
		LinkedList<Long> list = new LinkedList<Long>();
		
		int length = 0;
		int startNum = 0;
		
		// Can't start with 0 or 1
		for (int i = 2; i < 1000000; i++){
			// num, if odd, can be more than 2^31 - 1 so have to use long instead of int
			long num = i;
			
			while (num != 1){
				// n -> n/2 (n is even)
				if (num % 2 == 0){
					num /= 2;
					list.add(num);
				}
				else {
					// n -> 3n + 1 (n is odd)
					num = (3 * num) + 1;
					list.add(num);
				}
			}
			// n = 1 means sequence is done
			if(list.size() > length){
				length = list.size();
				startNum = i;
			}
			list.clear();
		}
		System.out.println(length);
		System.out.println(startNum);
		
	}
}
