package com.pro.level1;

import java.util.Scanner;

public class Solution {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public String solution(String phone_number) {
		String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++)
			answer += "*";

		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
	}

}
