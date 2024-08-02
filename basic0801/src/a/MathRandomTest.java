package a;

public class MathRandomTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			double d = Math.random();
			
			double r = d * 10;
			
			int v = (int) r;
			
//			System.out.println("d = " + d + ", r = " + r + ", v = " + v);
		}
		
//		System.out.println("=================");
		
		String[] str = {"가", "나", "다", "라", "마", "바"};
		
		String merge = "";
		
		int iteratorCnt = (int)(Math.random() * str.length);
		
		System.out.println(iteratorCnt);
		
		for (int i = 0; i <= iteratorCnt; i++) 
			
		merge += str[i];
		
		System.out.println(merge);
	}

}
