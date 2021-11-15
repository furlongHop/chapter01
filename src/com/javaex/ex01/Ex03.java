package com.javaex.ex01;

public class Ex03 {

	public static void main(String[] args) {
		
		//char(charcter)는 한 번에 한 글자밖에 처리하지 못한다.
		//char로 표현하는 숫자는 숫자가 아니라 문자의 의미다.(작은 따옴표 필수)
		//숫자를 나타내고 싶다면 int류를 사용해야 한다.
		char ch01 = 'A'; //문자>코드값 저장
		char ch02 = 65; //작은 따옴표 없이 숫자 표기(기존 코드값으로 인식)
		//▶정수형으로 표현할 경우, 기존에 저장된 문자표에 따라 코드값 해석
		
		System.out.println(ch01); //=출력 코드
		System.out.println(ch02);
		
		boolean b01 = true;
		boolean b02 = false;
		
		System.out.println(b01);
		System.out.println(b02);
		
		int a = 3;
		int b = 5;
		boolean result = a>b; //=값을 담음
		
		System.out.println(result); //=출력 명령
		
		char st = '안';
		String str = "안";
		String str2 = "안녕하세요";
		//여러 문자를 사용하고 싶을 시, 쌍따옴표를 사용하여 String 이용
		//String은 한 글자를 쓰더라도 반드시 쌍따옴표 사용
		
		System.out.println(st);
		System.out.println(str);
		System.out.println(str2);
	}
}
