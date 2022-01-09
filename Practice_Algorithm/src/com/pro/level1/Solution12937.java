package com.pro.level1;

public class Solution12937 {

	public static void main(String[] args) {
		Solution12937 solution = new Solution12937();
		int num = 3;
		System.out.println(solution.solution(num));

	}
	
	public String solution(int num) {
		String answer = "";

		if(num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
			  
		return answer;
		
	}

}
