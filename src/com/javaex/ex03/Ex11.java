package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		
		int month = sc.nextInt();
		
/*		switch(month) {
			case 1 :
				System.out.println("31일 입니다.");
				break;
			case 2 :
				System.out.println("28일 입니다.");
				break;
			case 3 :
				System.out.println("31일 입니다.");
				break;
			case 4 :
				System.out.println("30일 입니다.");
				break;
			case 5 :
				System.out.println("31일 입니다.");
				break;
			case 6 :
				System.out.println("30일 입니다.");
				break;
			case 7 :
				System.out.println("31일 입니다.");
				break;
			case 8 :
				System.out.println("31일 입니다.");
				break;
			case 9 :
				System.out.println("30일 입니다.");
				break;
			case 10 :
				System.out.println("31일 입니다.");
				break;
			case 11 :
				System.out.println("30일 입니다.");
				break;
			case 12 :
				System.out.println("31일 입니다.");
				break;
			default :
				System.out.println("인식하지 못했습니다. 다시 입력해주십시오.");
				break;
		}
*/


		//break 특성을 이용한 코드 길이 줄이기(구조가 잘 보이지 않으므로 비추)
		//가장 좋은 코드는 한눈에 알아볼 수 있는 코드다.
		//그러나 문법 자체는 외워두기!
		switch(month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일 입니다.");
			break;
		case 2 :
			System.out.println("28일 입니다.");
			break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("31일 입니다.");
			break;	
	}
		sc.close();

	}

}
