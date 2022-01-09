package com.pro.level1;

import java.util.Scanner;

public class Solution12948 {
	
	public static void main(String[] args) {
		Solution12948 solution = new Solution12948();
		Scanner scanner = new Scanner(System.in);
		String phone_number = scanner.next();
		System.out.println(solution.solution(phone_number));
	}
	
	
	public String solution(String phone_number) {
		String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++)
			answer += "*";

		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
	}
}
