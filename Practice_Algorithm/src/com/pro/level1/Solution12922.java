package com.pro.level1;

public class Solution12922 {

	public static void main(String[] args) {
		Solution12922 solution = new Solution12922();
		
		System.out.println(solution.solution(5));

	}
	
	public String solution(int n) {
		String answer = "";
	
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				answer += "박";
			} else {
				answer += "수";
			}
		}
		
		return answer;
		
	}


}
