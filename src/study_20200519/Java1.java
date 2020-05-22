package study_20200519;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//식별자 - 클래스명, 변수명, 메서드명, 패키지이름
		
		int a1 = 10;
		int a_1 = 10;
		int $1 = 10;
		int fatherAge = 50;
		int fatherage = 50;		// fatherAge != fatherage 다른 단어
		
		
		//숫자로 시작하면 안됨
		//int 1a = 10;
		
		//특수문자는 사용불가(예외 $, _)
		//int a# = 20;
		
		//공백을 허용하지 않음
		//int father Age = 10;
		
		//예약어는 사용할 수 없음.
		//int break = 10;
		
		//10진수 표현법
		byte b1 = 10;
		//8진수 표현법
		byte b2 = 012;
		//2진수 표현법
		byte b3 = 0b1010;
		//16진수 표현법
		short b4 = 0x12f2;
		
		int a2 = 100;
		long l1 = 2_200_000_000l; //끝에다가 l를 붙여서 범위내로 줄일 수 있다.
	
		float f1 = 12.45f;  
		
		double d1 = 12.45d; // d는 생략가능
		
		boolean isSuccess = false; //true false 밖에 없음
		
		//문자 표현법
		char c1 = 'a';
		
		//아스키코드 표현법
		char c2 = 97;
		
		//유니코드 표현법
		char c3 = '\uc131';
		
		char c4 ='\'';
		
		char c5 = '\\';
		 
		char c6 = '\"';
		
		System.out.println("aaa" + "\r" + "bbb");
		
		
		//casting 했을 경우 circuit 발생 ===> circuit은 좋은 현상이 아니다 ===> 왼쪽 자료형을 키워주자
		byte e1 = (byte)128; //-128 ~ 127
		System.out.println(e1);
		
		//casting 했을 경우 cut 발생 ===> 소수점 이하가 짤림
		int e2 = (int)1234.56;
		System.out.println(e2);
	
	
		int e3 = 10;
		System.out.println(e3);
		int e4 = e3++; //e3를 대입한다음 증가시켜야 ==> 11
		System.out.println(e4);
		System.out.println(e3);
		int e5 = ++e3; //증가시키고 e3를 대입시켜라 ==> 12
		System.out.println(e5);
		System.out.println(e3);
	
	
		int e6 = 10;
		double e7 =10.0;
		System.out.println(e7 == e6);
		
		// a && b ==> a => false 일 때 short circuit 발생
		// a || b ==> a => true 일 때 short circuit 발생
		
		System.out.println(1+2+3+"abcd");
		System.out.println("abcd"+1+2+3);
		
	}

}
