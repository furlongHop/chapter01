package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		//println() print() 차이점
		//print: 출력, ln: 엔터, 다음 블록으로(커서 이동)
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		
		System.out.println("--------------");
		
		//println() 사용법
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "황지우";
		
		System.out.println("안녕하세요");
		System.out.println(str); //굿모닝
		System.out.println(i); // 2345
		System.out.println(d); //3.14
		
		System.out.println(str+str); //굿모닝굿모닝
		System.out.println(str+i); //굿모닝+2345
		System.out.println(d+str); //3.14+굿모닝
		System.out.println(str+c); //굿모닝한
		
		//굿모닝 이랑 2345
		System.out.println(str+" "+"이랑"+" "+i);
		System.out.println(str+" 이랑 "+i); //공백도 문자로 쳐준다.
		
		System.out.println(i+i); //4690 ←문자가 아닌 숫자는 공식대로 더해준다.
		System.out.println(i+d); //2348.14
		
		System.out.println(i-i);
		System.out.println(i*i);
		
		System.out.println(c+c); //String이 아니므로 숫자로 인식, 코드값으로 진행
		System.out.println(c+s);
		
		System.out.println("제 이름은 "+name+" 입니다."); //제 이름은 황지우입니다.
		
		System.out.println("안녕'하'세요"); //안녕하'세요
		System.out.println("안녕\"하\"세요"); //안녕"하"세요
		System.out.println("안녕\\하\\세요"); //안녕\하\세요
		System.out.println("안녕\t하세요"); //안녕 하세요
		
		
	}
	
}
