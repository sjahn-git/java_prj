package c;

public class Basic02 {

	public static void main(String[] args) {
		
//		String[] str = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카"};
		
		String[] str = {"ㄹ멍란일", "ㅁ러ㅓ리ㅏㅓㅂ딪", "adfadfdsafd", "sdd라", "fajdsfklajsdfl", "qrerdsfasdf"};
		
		
//		"str"이라는 문자열 배열 선언, 초기화.
		
// ========================================================================================================================================================================
		
		int[] arr = new int[20];
//		"arr"이라는 정수 배열 선언, 배열의 길이(20) 초기화.
		
// ========================================================================================================================================================================
		
//		for (int i = 0; i < str.length; i++) {
////		정수 "i" 선언 및 0으로 초기화, i == 0 ~ ("str" 배열 길이 - 1)일 때, 다음 블럭 반복.
//			
//			double a = Math.random();
////			a >= 0 && a < 1 인 무작위 실수.
//			
//			double b = a * str.length;
////			b >= 0 && b < 11 인 무작위 실수.
//			
//			int randIdx = (int) b;
////			randIdx >= 0 && randIdx < 11 인 무작위 정수.
//			
////			System.out.println("a = " + a + ", b = " + b + ", rand = " + randIdx);
//			
//			for (int j = 0; j < randIdx; j++) {
////			반복횟수 랜덤.
//				
//				str[i] += str[randIdx];	
////				문자열 결합이 랜덤하게 변경됨.
//			}
//		}
		
// ========================================================================================================================================================================
		
//		for (String i : str)
//		System.out.println(i);
		
//		(동일)
//		for (int i = 0; i < str.length; i++) 
//		System.out.println(str[i]);
		
//		배열 요소 전부 반복 및 출력.
		
		
		
		for (int i = 0; i < arr.length; i++) {
			
//		문1) 랜덤으로 arr에 문자열의 길이를 20개 저장하라.
			
			int randIdx = (int) (Math.random() * str.length);
			
//			randIdx >= 0 && randIdx < 11 인 무작위 정수를 랜덤으로 발생하고
//			그것을 str 배열의 index로 주면 해당 문자열이 나온다.
//			그 문자열의 길이를 arr에 저장한다.
			
			arr[i] = str[randIdx].length();
		}
		
		for (int i : arr)
		System.out.println(i);
	}

}



























