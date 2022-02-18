package com.pro.level1;

public class Solution12928 {

	public static void main(String[] args) {
		
		Solution12928 solution = new Solution12928();
		System.out.println(solution.solution(12));
		
	}
	
	public int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}

}
