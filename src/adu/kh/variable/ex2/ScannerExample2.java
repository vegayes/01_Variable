package adu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 2째자리 까지만
		
		// 정수 : sc.nextInt();
		// 실수 : sc.nextDouble();
		
		
		System.out.print("실수 1 입력 : ");
		double sys1 = sc.nextDouble();
		
		System.out.print("실수 2 입력 : ");
		double sys2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", sys1, sys2 , sys1 + sys2);
		System.out.printf("%.2f - %.2f = %.2f\n", sys1, sys2 , sys1 - sys2);
		System.out.printf("%.2f * %.2f = %.2f\n", sys1, sys2 , sys1 * sys2);
		System.out.printf("%.2f / %.2f = %.2f\n", sys1, sys2 , sys1 / sys2);
		
		
		String example = "aaaa";
		int exampleLen = example.length();
				System.out.println(exampleLen);

	}

}
