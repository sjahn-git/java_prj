package c;

public class Basic01 {

	public static int power(int a, int b) {	// a의 b제곱
		
		// 1부터 a를 b번 반복하여 곱한다.
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a = 0x1fd7;
		// 숫자 표현 시 '0x'로 시작 : 16진수(hexa)
		// 여기서는 1fd7(16진수)로 초기화됨.
		
		int b = 0b1110011;
		
		System.out.println(a == 16*16*16 * 1 + 16*16 * 15 + 16 * 13 + 7);
		
		System.out.println(b);
		
		int o = 0567234;
		// 8진수 : '0'으로 시작.
		
		System.out.println(o == 5 * power(8, 5) + 6 * power(8, 4) + 7 * power(8, 3) + 2 * power(8, 2) + 3 * 8 + 4);
		// 8의 5제곱 자릿수 : 5, 4제곱 자릿수 : 6, ...
	}

}
