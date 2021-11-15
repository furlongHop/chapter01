package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7; //오른쪽에 있는 값을 왼쪽에 있는 곳에 넣는다!
		int b = 2; //변수 이름은 절대 숫자로 시작하거나 숫자로만 이루어질 수 없다
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		

		System.out.println(a / b); //3.5 몫3 나머지1 → 몫을 표시
		System.out.println(a % b); //3.5 몫3 나머지1 → 나머지를 표시
		
		//산술연산자 /와 %에 대하여 자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0); //3.5
		System.out.println(7.0%2.0); //1.0 <실수 그대로 보존
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar); // +(-3)
		System.out.println(mVar); // -(-3)
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a); //7
		System.out.println(++a); //(1)a를 1 올린다(7→8),(2)a를 출력한다.
		System.out.println(a); //a를 다시 출력해보니 값이 7이 아닌 8이 되었다.
		//따라서 증감연산자는 연산 후 가상의 값을 출력하는 것이 아니라 실제로 값을 바꾼다.
		
		System.out.println(b); //2
		System.out.println(--b); //(1)b를 1 내린다, (2)b를 출력한다.
		System.out.println(b);
		
		System.out.println(a); //8
		System.out.println(a++); //(1)a를 출력한다(8), (2)a를 1 올린다.(8→9)
		System.out.println(a);
		
		System.out.println(b); //
		System.out.println(b--); //(1)b를 출력한다(1),(2)b를 1 내린다.(1→0)
		System.out.println(b); //0
		
	}
	
}
