package com.pro.level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution12917 {

	public static void main(String[] args) {
		
		Solution12917 solution = new Solution12917();
		System.out.println(solution.solution("abcdef"));

	}
	
	public String solution(String s) {
		String answer = "";
		
		String[] str = s.split("");
		
		Arrays.sort(str);
		
		Collections.reverse(Arrays.asList(str));
		
		answer = String.join("", str);
		
		return answer;
	}

}
