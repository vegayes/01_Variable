package adu.kh.variable.ex2;

public class printExample {
	
	public static void main(String[] args) {
	
		//	System.out.print() : 단순 출력 (출력 후 줄바꿈 X)
		// 	System.out.println() : 한 줄 출력 (출력 후 줄바꿈 수행)
		//  => 줄바꿈이라는 차이점은 있지만 괄호안의 내용이 그대로 나온다는것은 똑같음
		
		System.out.println("테스트1");
		System.out.println("테스트2");  
	
		System.out.print("테스트3");
		System.out.println(); // 내용 없는 println 단순 줄바꿈  
							  // :: [단축키]  syso 입력 후 ctrl + space
		System.out.print("테스트4");
		
		
		// System.out.println() : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		System.out.println(); 
		
		int iNum1 = 10;
		
		int iNum2 = 5;
		int iNum3 = 2;
		
		
		// 10 + 5 = 15
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		/* printf
		 * 
		 * %d : 정수형, %o : 8진수 , %x : 16진수
		 * %c : 문자, %s : 문자열
		 * %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입값 그대로
		 * %A : 16진수 실수
		 * %b : 논리형
		 * 
		 */
		
		//System.out.pritnf("패턴", 패턴에 들어갈 값)
		// 10 + 5 = 15
		System.out.printf("%d + %d = %d\n", iNum1 ,iNum2 ,( iNum1 + iNum2 )); 
		// 줄바꿈 :: \n
		
		//10 + 10 *5 / 2 = 35
		System.out.printf("%d + %d * %d / %d = %d\n", iNum1 ,iNum1 ,iNum2, iNum3, ( iNum1 + iNum1 * iNum2 / iNum3 )); 
		
		
		// 패턴연습
		int iNum4 = 3;
		System.out.printf("%d\n", iNum4);
		System.out.printf("%5d\n", iNum4); // 5칸 공간 확보 후 오른쪽 정렬 
		System.out.printf("%-5d\n", iNum4); // 5칸 공간 확보 후 왼쪽 정렬 
		
		// 소수점 자리 제어 (반올림 처리)
		System.out.printf("%f\n", 10/4.0); // 2.500000
		System.out.printf("%.2f\n", 10/4.0); // 소수점 둘째짜리까지만 나타내고 싶다.
		System.out.printf("%.0f\n", 10/4.0); // 소수점 아래를 표현하지 않겠다.
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '유';
		String str = "안녕하세요 "; // String은 참조형(기본자료형을 뺀 나머지)
		
		// false / 유 / 안녕하세요
		System.out.printf("%b / %c / %s\n", isTrue , ch, str);
		// 만약에 format을 잘못 설정했다면, Error 남. 왜냐면, 각 변수가 가진 자료형이 다르기 때문이다.
		
		
		// escape(이스케이프 == 탈출) 문자 : 일반 문자가 아닌 특수문자 표현
		
		
		// \
		System.out.println("\\");
		// '\' 한 글자는 escape 문자의 리터럴로 생각함. 
		
		// \o/
		System.out.println("\\o/");
		
		// Tab 출력
		System.out.println("a\tb\tc\td");
		// 한공간씩 표현X , 한번에 공간차지 
		
		
		// 유니코드 이스케이프
		System.out.println("\u0041"); // A
		// 유니코드는 16진수로 나타냄. 
		// 65 % 16 = 4 .... 1
		
		
		
		
		
		
		
	}

}
