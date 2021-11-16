package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
/*		if(score>=90) {
			System.out.println("A등급");
		}else if(score>=80) {
			System.out.println("B등급");
		}else if(score>=70) {
			System.out.println("C등급");
		}else if(score>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		▶이렇게 짠 이유
		: 이미 더 큰 숫자는 앞에서 걸러졌기 때문에 코드를 이렇게 짜보았다.
*/
		
		//선생님이 가르쳐주신 기본 코드(항상 위 같은 경우만 존재하는 건 아니다)
		if(score>=90) {
			System.out.println("A등급");
		}else if(90>score && score>=80) {
			System.out.println("B등급");
		}else if(80>score && score>=70) {
			System.out.println("C등급");
		}else if(70>score && score>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		sc.close();

	}

}
