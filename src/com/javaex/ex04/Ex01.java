package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
/*		int tail=0;
		int i=0;
		
		while(i<5) {
			System.out.println("I like java "+tail);
			i++;
			tail++;
		}
*/

		//더 좋은 코드(조건 동일시 사용)
		int i=0;
		
		while(i<5) {
			System.out.println("I like java "+i);
			i++;
		}
		
		
/*		//3부터 시작할 때, 둘의 조건이 다를 경우 아래와 같은 방법이 더 좋을 수도 있다.
 		//변수 선언을 따로 하나 더 하는 게 좋은 상황인지, 같은 변수를 쓰는 게 좋은지 생각해보자.
		int tail=3;
		int i=0;
		
		while(i<5) {
			System.out.println("I like java "+tail);
			i++;
			tail++;
		}
*/

	}

}
