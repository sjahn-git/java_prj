package func1;

public class FuncTest2 {

	public static String gugu(int a) {
		
		String result = "";
		
		for (int i = 1; i < 10; i++) {
			
			result += a + "x " + i + "= " + (a * i) + "\n";
		}
		return result;
	}
	
	public static String guguSeparLine(int a) {
		String result = "===================" + a + "단=====================\n";
		for (int i = 1; i < 10; i++) {
			result += a + "x " + i + "= " + (a * i) + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		for (int i = 2; i < 15; i++) {
			String v = guguSeparLine(i);
			System.out.println(v);
		}
		
//		System.out.println(guguSeparLine(2));
//		System.out.println("2 X 1 = 2");
//		System.out.println("2 X 2 = 4");
//		System.out.println("2 X 3 = 6");
//		System.out.println("2 X 4 = 8");
//		System.out.println("2 X 5 = 10");
//		System.out.println("2 X 6 = 12");
//		System.out.println("2 X 7 = 14");
//		System.out.println("2 X 8 = 16");
//		System.out.println("2 X 9 = 18");
	
//		반복문으로 변경.
		
//		int[] arr = new int[9];
//		
//		for (int i = 0; i < arr.length; i++)
//			System.out.println("2 X " + (i + 1) + " = " + (2 * (i + 1)));
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------
		
//		for (int i = 1; i < 10; i++)
//			System.out.println(2 + "x " + i + "= " + (2 * i));
		
//		gugu 호출해서 출력하시오.
		
	}

}


//	public static int f(int a, int b) {
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//	public static void main(String[] args) {
//		int a = 
//	}






























