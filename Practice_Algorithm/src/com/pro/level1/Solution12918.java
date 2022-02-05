package com.pro.level1;

public class Solution12918 {

	public static void main(String[] args) {

		Solution12918 solution = new Solution12918();
		System.out.println(solution.solution2("123a"));

	}

	public boolean solution(String s) {
		boolean answer = true;

		if (s.length() == 4 || s.length() == 6) {

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) < '0' || s.charAt(i) > '9') {

					answer = false;
				}

			}

		} else {

			answer = false;

		}

		return answer;
	}

	public boolean solution2(String s) {
		boolean answer = true;
		
		if (s.length() == 4 || s.length() == 6) {
			
			for (int i = 0; i < s.length(); i++) {
				
				if (!Character.isDigit(s.charAt(i))) {
					
					answer = false;
				}
			}

		} else {

			answer = false;

		}
		return answer;
	}

}
