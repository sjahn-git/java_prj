package green1;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car a = new Car();
		
//		heap에 Car 객체가 생성되었고, 
//		그 객체를 a라는 참조변수가 가리키고 있다.
		
//		new 옆에 붙어있는 Car()는 생성자로써 클래스명과 동일한 함수.
		
//		객체 생성 시에만 호출되는 함수(constructor)
		
		a.setDriverName("홍길동");
		System.out.println(a.getDriverName());
		
//		멤버변수에 값이 문자열로 홍길동이 저장.
		
		Car b = new Car();
		
		b.setDriverName("홍말자");
		
		a.setPrice(100);
		b.setPrice(1000);
		
		System.out.println(a.getPrice() + b.getPrice() + "입니다.");
		
		System.out.println(a.getDriverName() + b.getDriverName());
		
		int result = a.sum(34, 56);
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}