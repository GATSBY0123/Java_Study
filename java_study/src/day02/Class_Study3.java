package day02;

class 치킨집 {
	
	int 후라이드치킨가격 = 100; //필드변수 (필드변수는 초기화값이 필요없다)
	int 양념치킨가격; //문제. 생성자에서 양념치킨 가격을 19000으로 대입하시오
	
	public 치킨집() { //디폴트로 존재
		//리턴타입이 없는 메소드임. => 생성자라고 부른다.
		//생성자 목적 : 클래스에 있는 필드변수 혹은 메소드를 초기화하기 위해
		this.후라이드치킨가격 = 18000;
		this.양념치킨가격 = 19000;
	}
	
	public void 주문을받다(String 메뉴이름) {
		System.out.println(메뉴이름 + "를(을) 주문 받았습니다.");
	}
}
public class Class_Study3 {
	
	public static void main(String[] args) {

		//문제2. 치킨집 클래스를 호출해서 메소드를 사용해보시오
		
		치킨집 c = new 치킨집(); //new 치킨집(); 자동으로 메소드(생성자)를 호출함
		c.주문을받다("양념치킨");
		System.out.println("치킨 가격 : " + c.후라이드치킨가격 + "원");
		System.out.println("치킨 가격 : " + c.양념치킨가격 + "원");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
