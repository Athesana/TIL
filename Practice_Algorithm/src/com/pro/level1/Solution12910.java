package com.pro.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution12910 {

	public static void main(String[] args) {

		Solution12910 solution = new Solution12910();

		int[] arr = { 5, 9, 7, 10 };
		
		System.out.println(Arrays.toString(solution.solution(arr, 5)));

	}

	public int[] solution(int[] arr, int divisor) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % divisor == 0) {
				
				list.add(arr[i]);
			}
		}

		int[] answer = {};
		
		if (list.size() != 0) {
			
			answer = new int[list.size()];
			
			for (int i = 0; i < answer.length; i++) {
				
				answer[i] = list.get(i);
			}
			
		}else {
			
			answer = new int[1];
			
			answer[0] = -1;
			
		}

		Arrays.sort(answer);

		return answer;
	
	}

}
