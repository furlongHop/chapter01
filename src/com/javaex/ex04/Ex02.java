package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		int x=sc.nextInt();
		
		int y=1;
		
		while(y<10) {
			System.out.println(x+" * "+y+" = "+x*y);
			y++; //y=y+1; <숫자와 부호 변경 가능. 좀 더 다양하게 적용 가능.
		}
		
		
		sc.close();
	}

}
