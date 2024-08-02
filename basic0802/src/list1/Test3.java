package list1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		
		List<Float> list = new ArrayList<>();
		
		list.add(1f);
		list.add(11f);
		list.add(21f);
		list.add(31f);
		list.add(41f);
		list.add(51f);
		list.add(61f);
//		반복문.
		
		
		
		for (float i : list)
			System.out.println(i);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트에서 데이터를 꺼낼 때는 index " + i + "를 줘라. " + list.get(i));
		}
	}		
}	

