package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		double input1 = sc.nextDouble();
		System.out.print("영어 : ");
		double input2 = sc.nextDouble();
		System.out.print("수학 : ");
		double input3 = sc.nextDouble();

		System.out.printf("총점 : %d\n", (int) (input1 + input2 + input3));
		System.out.printf("평균 : %d", (int) (input1 + input2 + input3) / 3); // %d :: 10진법 (!= double)

	}

}
