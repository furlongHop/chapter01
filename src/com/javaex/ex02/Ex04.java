package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		;
		System.out.println("나이를 입력해주세요");
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.println("이름을 입력해주세요");
		
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		sc.close();
		
		/*스캐너 사용 시 숫자를 먼저 입력하는 순서일 경우 엔터 때문에 버그가 생긴다.
		 엔터를 가진 채 다음 값에 통째로 입력되어 다음 값을 입력할 칸이 남지 않는다.
		 이럴 경우 남아있는 엔터를 소모해버리면 버그를 해결할 수 있다.
		 숫자 값 다음에 빈 값을 하나 넣어 엔터를 소모하면 된다.
		 빈 값: sc.nextline(); ppt 70p 참고*/
	}
	
}
