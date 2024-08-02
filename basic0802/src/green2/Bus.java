package green2;

public class Bus {
	private String address;
	private String name;
	private String phone;
	
	private int age;
	
//	멤버 변수(클래스 변수, 인스턴스 변수).
	
//	class 클래스명 {
//		​필드 (객체속성)
//		메서드 (객체동작)
//	}
	
//	인스턴스 : 클래스로부터 생성된 객체.
	
//	객체 : 
	
	int getAge() {return this.age;}
	void setAge(int age) {this.age = age;}
	
	
	String getAddress() {return this.address;}
	void setAddress(String address) {this.address = address;}
	
	String getName() {return this.name;}
	void setName(String name) {this.name = name;}
	
	String getPhone() {return this.phone;}
	void setPhone(String phone) {this.phone = phone;}
	
	
//	메서드
	String calcGrade(float avg) {
		String grade = "";
		if (avg >= 90) grade = "수";
		else if (avg >= 80) grade = "우";
		else if (avg >= 70) grade = "미";
		else if (avg >= 60) grade = "양";
		else grade = "가";
		return grade;
	}
	
	
}
