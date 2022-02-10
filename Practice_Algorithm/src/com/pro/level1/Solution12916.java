package com.pro.level1;

import java.util.Arrays;

public class Solution12916 {

	public static void main(String[] args) {

		Solution12916 solution = new Solution12916();
		System.out.println(solution.solution("Ppyyy"));

	}
	
	public boolean solution(String s) {
		boolean answer = true;
		
		int pcount = 0;
		
		int ycount = 0;
		
		String[] arr = s.split("");
		
		for(int i = 0; i < s.length(); i++) {
			if(arr[i].equals("p") || arr[i].equals("P")) {
				pcount++;
			}
			
			if(arr[i].equals("y") || arr[i].equals("Y")) {
				ycount++;
			}
		}
		
		if(pcount == ycount) {
			answer = true;
		} else {
			answer = false;
		}
		
		return answer;
	}

}
