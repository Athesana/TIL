package com.pro.level1;

public class Solution12943 {

	public static void main(String[] args) {
		Solution12943 solution = new Solution12943();
		
		System.out.println(solution.solution(626331));
//		System.out.println(solution.solution2(626331));

	}
	
	public int solution(long num) {
		int answer = 0;
		
		while(num != 1) {
			if(answer == 500) {
				answer = -1;
				break;
				
			} else {
				num = num % 2 == 0? num / 2 : (num * 3) + 1;
				answer++;
			}
		}
		
		return answer;
	}
	

}
