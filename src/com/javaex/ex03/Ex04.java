package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		int m = time*10000;
		int m8 = 80000;
		int tm = (time-8)*12000;
		int k = m8+tm;
		
		if(time<=8) {
			System.out.println("임금은"+m+"원 입니다.");
		}else {
			System.out.println("임금은 "+k+"원 입니다.");
		}
		
		sc.close();

	}

}
