package day03;

public class MyInfo implements StudyImple{

	//오버라이딩 : 메소드 재정의(재구현)
	//오버로딩 : 메소드 이름은 같으나 파라미터 타입 혹은 개수가 다름
	@Override
	public void printName(String name) { //인터페이스에서 정의된 메소드를 사용함
		//여기서 로직구현
		System.out.println(name + "입니다");
		
	}

	@Override
	public void printAge(int age) {
		System.out.println("나이는" + age);
	}

	@Override
	public void printName(int age, String name) {
		System.out.println("나이" + age + " 이름 " + name);
	}

}
