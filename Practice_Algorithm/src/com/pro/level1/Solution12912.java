package com.pro.level1;

public class Solution12912 {

	public static void main(String[] args) {

		Solution12912 solution = new Solution12912();
		System.out.println(solution.solution(3, 5));

	}

	public long solution(int a, int b) {
		long answer = 0;
		int c = 0;
		if (a == b) {
			answer = a;
		} else {
			if (a > b) {

				answer = ((a + b) * (a - b + 1)) / 2;

			} else {
			
				answer = ((a + b) * (b - a + 1)) / 2;
			
			}
		}
		return answer;
	}

}
