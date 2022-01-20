package com.pro.level1;

import java.util.Arrays;

public class Solution12932 {

	public static void main(String[] args) {
		
		Solution12932 solution = new Solution12932();
		System.out.println(Arrays.toString(solution.solution(25938)));  
	}
	
	public int[] solution(long n) {

		String str = Long.toString(n);
		
		int length = str.length();
		
		int[] answer = new int[length];

		int result = 0;
		
		for(int i = 0; i < length; i++) {
			result = Integer.parseInt(str.substring(i, i + 1));
			answer[length - i - 1] = result;
		}
		
		return answer;
		
	}

}
