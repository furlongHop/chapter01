package com.javaex.ex02;

//ctrl+shift+O : import 단축키
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//키보드로 입력한 값을 인식한다. sc: 키보드 이름
		Scanner sc = new Scanner(System.in); //키보드와 연결
		
		/* System.out.println("숫자를 입력하세요"); */
		int num = sc.nextInt();
		System.out.println("입력하신 숫자는"+num+"입니다.");
		
		sc.close(); //닫아주는 것 잊지 말기
		
	}
	
}
