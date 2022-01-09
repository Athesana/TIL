package com.pro.level1;

public class Solution12944 {

	public static void main(String[] args) {

		Solution12944 solution = new Solution12944();
		
		int[] arr = {1, 2, 3, 4};
		System.out.println(solution.solution(arr));

	}
	
	
	public double solution(int[] arr) {
		double answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		
		return answer / arr.length;
	}


}
