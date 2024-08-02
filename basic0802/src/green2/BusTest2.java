package green2;

public class BusTest2 {
	
	public static void main(String[] args) {
		
		Bus b1 = new Bus();
		b1.setAddress("미금시 분당구 서울");
		b1.setPhone("010-1111-2222");
		b1.setName("홍길동");
		b1.setAge(100);
		
		Bus b2 = new Bus();
		b2.setAddress("부산시 분당구 서울");
		b2.setPhone("011-1111-2222");
		b2.setName("홍말자");
		b2.setAge(50);
		
		Bus b3 = new Bus();
		b3.setAddress("제주시 남을동");
		b3.setPhone("012-1111-2222");
		b3.setName("최수종");
		b3.setAge(55);
		
		Bus[] buses = new Bus[3];
//		객체 배열
		
		buses[0] = b1;
		buses[1] = b2;
		buses[2] = b3;
		
//		for (Bus i : buses) {	// 일반 반복문으로 변경
//			System.out.println("주소 : " + i.getAddress() + ", 전화번호 : " + i.getPhone() + ", 이름 : " + i.getName() + ", 나이 : " + i.getAge());
//		}
		
		for (int i = 0; i < buses.length; i++) {
			System.out.println("주소 : " + buses[i].getAddress() + ", 전화번호 : " + buses[i].getPhone() + ", 이름 : " + buses[i].getName() + ", 나이 : " + buses[i].getAge());
		}
		
		
	}
}
