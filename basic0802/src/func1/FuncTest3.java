package func1;

import java.util.Scanner;

public class FuncTest3 {
	
	public static int sum (int a, int b) {return a + b;}
//	return값이 정수인 함수 "sum" 선언, return값이 되는 식에 사용될 정수형 변수 선언.
//	return이 선언되지 않으면, void 함수만 선언 가능.
	
	public static int minus (int a, int b) {return a - b;}
	
	public static int mul (int a, int b) {return a * b;}
	
	public static int mod (int a, int b) {return a % b;}
	
	public static String gugu (int a) {
		
		String result = "";
		
		for (int i = 1; i < 10; i++) {
			
			result += a + "x " + i + "= " + (a * i) + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int result = 0;
		
		String resultGugu = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(
			"원하는 연산을 고르세요\n더하기 : 1, 빼기 : 2, 곱하기 : 3, 나머지 : 4, 구구단은 아무 숫자나"
		);
		
		int op = sc.nextInt();
		
		int first = 0, second = 0;
		
//		Calculator c = new Calculator();
		
		switch (op) {
			case 1: 
				System.out.println("첫 번째 숫자 입력");
				first = sc.nextInt();
				System.out.println("두 번째 숫자 입력");
				second = sc.nextInt();
//				result = c.sum(first, second);
//				System.out.println(result); break;
//				
//			case 2: 
//				System.out.println("첫 번째 숫자 입력");
//				first = sc.nextInt();
//				System.out.println("두 번째 숫자 입력");
//				second = sc.nextInt();
//				result = c.minus(first, second);
//				System.out.println(result); break;
//				
//			case 3: 
//				System.out.println("첫 번째 숫자 입력");
//				first = sc.nextInt();
//				System.out.println("두 번째 숫자 입력");
//				second = sc.nextInt();
//				result = c.mul(first, second);
//				System.out.println(result); break;
//				
//			case 4: 
//				System.out.println("첫 번째 숫자 입력");
//				first = sc.nextInt();
//				System.out.println("두 번째 숫자 입력");
//				second = sc.nextInt();
//				result = c.mod(first, second);
//				System.out.println(result); break;
//				
//			default: 
//				System.out.println("원하는 구구단은?");
//				first = sc.nextInt();
//				resultGugu = c.gugu(first);
//				System.out.println(resultGugu); break;
		}
	}
}
//
//
//
////oop
////object oriented programming
////
////c++ java
////
////class(설계도면) 틀1, 틀2, ...
////not real
////imaginary
////|
////|	찍어낸다
////|
////|
////|
////object(객체)  사물(real)
////틀로 찍어내면
////메모리에 올라감
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////메모리
////stack
////	비쌈
////	큰거 저장 효율 낮음
////	기본 자료형(int, float, double, char, ...)
////	
////	
////	
////	
////heap
////	쌈
////	용량 큼
////	배열, 용량 큰 자료
////
////
////
////
////클래스명은 항상 대문자로 시작.
////
////class Car {
////	int a,
////	int b
////	
////}
////
////
////    Car                 a                 = new Car();
////데이터 type    reference variable(참조변수)
////객체 생성 행위
////					                     Truck 선언 시 오류 
////					
////					
////Truck a = new Truck()					                     
////Truck b = new Truck()					                     
////			함수		                     
////					                     
////					                     
////					                     
////					                     
////					                     
////					                     
////heap 공간에 객체 생성.
////
////a.a = 50
////b.a = 70
////
////    int      a = 7
////데이터 type
////
////
////
////class Truck {
////	private : 같은 클래스 내에서만 접근 가능.
////	
////	int a : 읽기
////	int b : 쓰기
////	
////	getter settle
////	private에 접근할 수 있게 함
////	
////	
////	
////}
////
////Heap car 
////
////
////Stack
////
////
////
////
////
////
////생성자
////constructor
////1. 객체 생성 시 호출
////
////데이터 보호(은닉)
////
////class Car {
////	private String name;
////	name : 멤버 변수
////	void setName(string name);
////	this.name = name
////}
////
////String getName() {
////	return name;
////}
////
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
//////씨발 뭐라는거야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ
////
////
////
////
////
////
////
////
////
////
////
