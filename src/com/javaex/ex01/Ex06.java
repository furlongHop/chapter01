package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//5/4 > 몫: 1, 나머지:1 이렇게 인식 (실수 자체로 넣는 게 아니면 나머지 무시)
		double v01 = 5/4; //1.25가 아니라 1이다. 
		System.out.println(v01);
		//→5.0(실수),5(정수)>따라서 정수 나누기 정수로 인식해 소수가 인식되지 않았다.
		
		double v02 = (double)5/4; // 5.0 / 4 → 5.0 나누기 4로 인식 = 1.25
		System.out.println(v02);
		
		double v03 = 5/(double)4; //5 / 4.0 → 정수와 실수가 만나면 실수가 이긴다.
		System.out.println(v03);
		
		double v04 = (double)5/(double)4; //5.0 / 4.0 →실수 나누기 실수
		System.out.println(v04);
		
		int v05 = (int)1.3+(int)1.8; //1+1=2 각자 강제로 정수로 변환, 소수가 버려짐
		System.out.println(v05);
		
		int v06 = (int)(1.3+1.8); //3.1을 정수형으로 인식, 소수점 밑 버림
		System.out.println(v06);
		
	}
}
