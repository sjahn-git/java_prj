package green1;

public class Calculator {
//함수(메서드)
	int sum(int a, int b) {
		return a + b;
	}
//	빼기함수 곱하기함수 나머지함수 구구단함수
//	구현하고 main 함수에서 호출하라.
	
	int minus(int a, int b) {return a - b;}
	int mul(int a, int b) {return a * b;}
	int mod(int a, int b) {return a % b;}
	
	String gugu(int a) {
		String vv = "";
		for (int i = 1; i < 10; i++) {
			vv += a + "x" + i + " = " + (a * i) + "\n"; 
		}
		return vv;
	}
}
