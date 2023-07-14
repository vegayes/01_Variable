package adu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할

		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는것. (기계를 만들기 위해서는 설계도 필요! == import )
		Scanner sc = new Scanner(System.in); // 키보드로 인식 :: input() == in
		// 자주 발생하는 오류 원인 -> 만들고 싶은데 설계도(class)가 없어서 못만들고 있음
		// --> import 구문 작성 시 오류 해결가능

		// Scanner type 설정 :: 객체 type?

		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); // nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)

		System.out.print("정수 2 입력 : "); // 입력하고 난 다음에 실행됨.
		int input2 = sc.nextInt();

		System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2);

	}

}
