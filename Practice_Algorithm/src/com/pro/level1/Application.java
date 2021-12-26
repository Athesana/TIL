package com.pro.level1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
//		new Solution().method1();
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		String phone_number = scanner.next();
		System.out.println(solution.solution(phone_number));
		
		
		
	}


}
