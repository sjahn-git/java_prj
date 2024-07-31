package b;

public class Arr01Q {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 11, 23};
		
		
//		System.out.println(arr[0] + 5);
//		System.out.println("===============");
//		
//		System.out.println(arr[1] + 5);
//		System.out.println("===============");
//		
//		System.out.println(arr[2] + 5);
//		System.out.println("===============");
		
// ==================================================================================================================================		
		
//		System.out.println(arr[0] + 5);		i = 0, arr[0] + (0 + 1) * 5
//		System.out.println("===============");
//		
//		System.out.println(arr[1] + 10);	i = 1, arr[1] + (0 + 2) * 5
//		System.out.println("===============");
//		
//		System.out.println(arr[2] + 15);	i = 2, arr[2] + (0 + 3) * 5
//		System.out.println("===============");
		
		

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i] + 5 * (i + 1));
			System.out.println("===============\n");
			
		}
		
	}

}
