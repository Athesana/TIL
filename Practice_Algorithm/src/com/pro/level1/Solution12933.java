package com.pro.level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution12933 {

	public static void main(String[] args) {
		Solution12933 solution = new Solution12933();
		System.out.println(solution.solution(118372));

	}

	public long solution(long n) {

		long answer = 0;
		
		String str = Long.toString(n);
	
		String[] arr = str.split("");

		Arrays.sort(arr, Collections.reverseOrder());
		
		str = String.join("", arr);
		
		answer = Long.parseLong(str);

		return answer;

	}

}
