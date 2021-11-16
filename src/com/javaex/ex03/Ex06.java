package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int score = sc.nextInt();
		
		if(score%3==0) {
			//true
			System.out.println(score+"는(은) 3의 배수입니다.");
		}else {
			//false
			System.out.println(score+"는(은) 3의 배수가 아닙니다.");
		}
		
		
		sc.close();
	}

}
