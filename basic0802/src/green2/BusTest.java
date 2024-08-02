package green2;

public class BusTest {
	
	public static void main(String[] args) {
		
		Bus b = new Bus();
		
		b.setAddress("미금시 분당구 서울");
		b.setPhone("010-1111-2222");
		b.setName("홍길동");
		b.setAge(100);
		
		System.out.println(b.getAddress() + ", " + b.getPhone() + ", " + b.getName() + ", " + b.getAge());
		
		System.out.println(b.calcGrade(56.7f));
	}
}
