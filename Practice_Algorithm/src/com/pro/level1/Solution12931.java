package com.pro.level1;

public class Solution12931 {

	public static void main(String[] args) {
		Solution12931 solution = new Solution12931();
		
		System.out.println(solution.solution(987));

	}
	
	public int solution(int n) {
		int answer = 0;
		
		int sum = 0;
		
		String str = Integer.toString(n);
		
		int length = str.length();
		
		String[] arr = new String[length];
		
		arr = str.split("");
		
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(str.substring(i, i + 1));
			answer = sum;
		}
		
		return answer;
	}

}
