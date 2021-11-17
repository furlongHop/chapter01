package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i=0; //원하는 값을 얻기 위한 정수(초기값)
		
		while(true) {
			i=i+1; //i++;
			//6과 14의 최소공배수인가? 맞을 경우 숫자 찍고 탈출할 것.
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
