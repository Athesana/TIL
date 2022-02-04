package com.pro.level1;

public class Solution12919 {

	public static void main(String[] args) {
		
		Solution12919 solution = new Solution12919();
		
		String[] seoul = {"Jane", "Jack", "Kim"};
		
		System.out.println(solution.solution(seoul));
		
	}
	
	public String solution(String[] seoul) {
		String answer ="";
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		
		return answer;
	}

}
