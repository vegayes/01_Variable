package adu.kh.variable.ex1;

public class VariableExample1 {
	// 생성된 .java 파일과 class 오른쪽에 작성된 이름은 같아야 함. 
	
	public static void main(String[] args) {

		/* 변수(Variable) 
		 * 1) 메모리 (RAM)에 값을 기록하는 공간
		 * 	-> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 함.
		 * 
		 * 2) 변수는 여러 종류 존재(저장되는 값의 형태, 크기가 다름)
		 *
		 *
		 *	<변수 사용의 장점>
		 *	1. 가독성 증가 (읽기 편함)
		 * 	2. 재사용성 증가 (한번 만든 변수를 계속 사용할 수 있음)
		 * 	3. 코드 길이의 감소 
		 * 	4. 유지보수성 증가 (코드 수정 간단)
		 */

		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
		
		// 변수 사용
		double pi = 3.141592653589793; // 원주율
		int r = 5; // 반지름(radius)
		int h = 20; // 높이(height)
		
		System.out.println("-".repeat(30));
		System.out.println("원의 둘레 : " + 2 * pi * r);
		System.out.println("원의 넓이 : " + pi* r * r);
		System.out.println("원기둥의 부피 : " + pi * r * r * h);
		System.out.println("구의 겉넓이 : " + 4 * pi * r * r);
		
	}

}
