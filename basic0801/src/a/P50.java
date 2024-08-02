package a;

public class P50 {

	public static void main(String[] args) {
		//		page50
		// 두 변수의 값을 변경하기.
		
		int cider = 100;
		
		double p1 = 3.14;
		
		char ch = 'a';
		
		String str = "abc";
		// 등호를 기준으로 우측에 있는 것을 literal이라 함.
		
//		System.out.println("x = " + cider + " , p1 = " + p1);
		
//		System.out.println("str = " + str + ", ch = " + ch);
		
		int cola = 200;
		
//		System.out.println("x = " + cider + ", y = " + cola);
		
		int empty = 0;
		// 빈잔
		
//		cider값과 cola 값 바꾸기!
		
		empty = cider;
		cider = cola;
		cola = empty;
		
//		System.out.println("x = " + cider + ", y = " + cola);
		
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < 100; i++) {		// 카드섞기 게임
			int radnIdx = (int)(Math.random() * arr.length);
			empty = arr[0];		// 1번째 배열값을 'empty'에 저장.
			arr[0] = arr[radnIdx];
			arr[radnIdx] = empty;
		}
		
		for (int i : arr)
		System.out.print(i + "\t");
		
//		\t : (문자열) tab 누른 만큼 띄어쓰기
		
		
		
		
		
	}

}
