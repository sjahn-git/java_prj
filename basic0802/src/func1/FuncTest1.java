package func1;

public class FuncTest1 {
	
	public static int f(int a) {
//		함수 정의
		
		return a * 4;
//			f 함수 내에 정의된 지역변수 a
	}
	
	public static int power(int a, int b) {
//	a ^ b
		int result = 1;
//		1부터 a값을 b번 곱하기를 반복하여 result 반환.
		
		for (int i = 0; i < b; i++)
			result *= a;
		return result;
	}
	
	public static void main(String[] args) {
		
//		int a = 1;
//		main 함수 내에 있는 지역변수 a
		
		int a = f(4);
		System.out.println(a);
		
		float v = sum(3.4f, 4.5f);
		System.out.println(v);
		
		int tt = power(3, 4);
		System.out.println(tt);
		
//		tt = power(3, 4);
//		System.out.println(tt);
//		
//		tt = power(3, 5);
//		System.out.println(tt);
//		
//		tt = power(3, 6);
//		System.out.println(tt);
//		
//		tt = power(3, 7);
//		System.out.println(tt);
		
//		반복문으로 변경.
		
		for (int i = 4; i < 12; i++) {
			for (int j = 2; j < 5; j++) {
				tt = power(j, i);
				System.out.println(j + "의" + i + "거듭제곱은 " + tt + "입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}


	public static float sum(float a, float b) {
//		여기를 채우고
		float ff = .3f;
		
		int v = 6;
		
		String r = "홍길동";
		
		return ff + v + r.length() + a * b;
		
//		return a + b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
