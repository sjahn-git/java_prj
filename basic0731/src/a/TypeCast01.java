package a;

public class TypeCast01 {
	public static void main(String[] args) {
		// 형변환(type casting)
		
		int a = (int) 3.5f;	
		// 정수형 변수에 실수 저장 시 오류.
		// down casting : 명시적(explicit) 형변환.
		
		float b = (float) 3;
		// up casting : 자동 형변환.
		
		double f = 3.4 / 7;
		// 정수 7이 실수로 자동 형변환.
		
		System.out.println(f);
		
		f = 3.4f / 7;
		
		float v = (float) 3.4d / (float) 4.5d;
		// d 생략가능.
		
		// 형변환
		
		// 범위가 작은 변수 => 큰 변수  (O)
		//		 큰 변수 => 작은 변수 (X)
		
		
		// 문 2)
		// bb를 다른 것으로 대체하라.
		// 국 영 수 점수의 평균으로 대체.
		
		
		
		float ko = 70, en = 80, math = 90;
		
		float avg = (ko + en + math) / 3;
		
		boolean bb = avg >= 80;
		
		if (bb) {
			System.out.println("사랑");
		} else {
			System.out.println("믿음");
		}
		
	}
}