package com.pro.level1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution12954 {

	public static void main(String[] args) {
		
		Solution12954 solution = new Solution12954();
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(Arrays.toString(solution.solution(x, n)));

	}
	
	public long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = x * (long)(i + 1);
		}
		
		return answer;
		
	}

}
