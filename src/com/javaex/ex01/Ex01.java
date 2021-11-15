package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		int myAge;
		myAge = 25; /*오른쪽 값을 왼쪽에 넣는다*/
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		//int의 표현 가능 범위: -2147483648 ~ 2147483647
		long bVar = 211143546768L;
		System.out.println(bVar);
		/*long은 int 값보다도 큰 숫자를 담을 수 있지만, 
		그 경우에는 숫자 뒤에 L을 붙여야 한다.(대소문자 무관)*/
		
		/*공간을 만든 뒤 차근차근 값 입력	 
		int var01; 
		int var02; 
		int var03;
		//↑위 순서대로 출력한다.
		var01 = 10;
		var03 = 30;
		var02 = 20;
		
		System.out.println(var03);
		System.out.println(var02);
		System.out.println(var01);*/
		
		//공간 만든 후 바로 값 입력
		int var01 = 10;
		int var02 = 20;
		int var03 = 30;
		
		System.out.println(var03);
		System.out.println(var02);
		System.out.println(var01);
		
		//↓한 줄로 표현하는 방법
		//int var01=10, var02=20, var03=30;
	}
	
}
