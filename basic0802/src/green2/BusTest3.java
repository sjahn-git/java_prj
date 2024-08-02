package green2;

public class BusTest3 {
	
	public static void main(String[] args) {
		
		String[] addresses = {"서울", "부산", "미금", "마산", "제주", "용산", "전주", "경상도", "충청도", "마포"};
		String[] names = {"홍길동", "김말자", "하희라", "최수종", "이경규", "대통령", "박영규", "이충만", "김시준", "전재윤"};
		String[] phones = {"011", "013", "777", "888", "444", "111", "010", "017", "018", "019"};
		
		Bus[] buses = new Bus[10];
//		객체 배열
		
		for (int i = 0; i < 10; i++) {
			
			Bus b = new Bus();
//			객체 생성
			
			b.setAddress(addresses[i]);
		}
	}
	
	
}
