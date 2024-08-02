package green2;

import java.util.ArrayList;
import java.util.List;

public class BusTest4 {
	
	public static void main(String[] args) {
		
		List<String> strAddress = new ArrayList<>();
		
		strAddress.add("수원");
		strAddress.add("부산");
		strAddress.add("마산");
		strAddress.add("울산");
		strAddress.add("경주");
		strAddress.add("대구");
		strAddress.add("제주도");
		strAddress.add("서울시");
		strAddress.add("용산");
		strAddress.add("미국");
		
		List<Bus> buses = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			Bus b = new Bus();
			
			b.setAddress(strAddress.get(i));
			
			b.setPhone((int)(Math.random() * 500) + "-1111-2222");
			
			b.setName("홍길동" + (int)(Math.random() * 100000));
			
			b.setAge((int)(Math.random() * 20));
			
			buses.add(b);
		}
		
		for (Bus i : buses) {
			System.out.println("주소 : " + i.getAddress() + ", 전화번호 : " + i.getPhone() + ", 이름 : " + i.getName() + ", 나이 : " + i.getAge());
		}
	}
	
	
}
