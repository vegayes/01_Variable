package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자 :");
		char input1 = sc.next().charAt(0); // 메서드 체이닝
		
		/*
		 * String input = sc.next();
		 * char result = input.charAt(0);
		 */

		System.out.printf("%s unicode : %d", input1, (int) input1);

	}
	
	public static int ex1(int a, int b) {
		return a+ b;
	}

}
