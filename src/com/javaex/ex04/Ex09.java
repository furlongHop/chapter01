package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			int i=sc.nextInt();
			
			if(i==0) {//0이면 종료
				System.out.println("종료");
				break; //바로 탈출
			}else if(i%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		//다른 방법
		boolean action = true;
		while(action) {
			
			System.out.println("숫자를 입력하세요.");
			int i=sc.nextInt();
			
			if(i==0) {//0이면 종료
				System.out.println("종료");
				action=false; //탈출이 아니라 변수값을 바꾼 것 뿐이다. 계속 진행된다.
				//최종 결정은 while(action)에서 결정된다.
			}else if(i%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		sc.close();

	}

}
