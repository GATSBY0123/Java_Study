package day02;

//모든 자바 클래스느 디폴트로 Object를 상속받는다.

class DW { //DW는 클래스(주제) 이름
	
	//DW클래스 안에는 DW랑 연관있는 행위(메소드)만 온다.
		
	public void 출근하다() {
		System.out.println("오늘은 출근!");
	}
	public void 지각하다() {
		System.out.println("오늘은 지각이야!");
	}
	//문제 2. DW클래스를 호출하고, DW 클래스에 정의된 메소드를 모두 출력하시오!
	
	public String 수업을배우다(String 선생님이름, String 교과목이름) {
		return 선생님이름 + "이" + 교과목이름 + "를(을) 알려주다.";
		
	//문제 3. 수업을 배두아 메소드 호출.
	}
}

class PizzaStore{ //클래스 이름 앞에는 무조건 대문자
	
	public void makePizza() {
		System.out.println("피자를 만들다.");
	}
	public void eatPizza(String pizzaName) {
		System.out.println(pizzaName + "를 먹다.");
	}
}

//public class는 자바파일에서 하나만 온다.
public class Class_Study01 {
	

	//static 메소드에는 static 메소드와 new를 사용해서 불러온 메소드만 허용.
	public static void main(String[] args) {

		//main함수에서 PizzaStore 클래스를 사용(호출)하고싶다.
		//다른 클래스에있는 메소드나 변수를 사용할 때는 new를 꼭 써야한다.
		PizzaStore pizza = new PizzaStore();
		int x = 10;
		
		//new PizzaStore(); PizzaStore클래스를 사용하겠다(불러오겠다).
		pizza.makePizza(); //PizzaStore에 있는 makePizza메소드 사용
		
		//문제1. eatPizza 메소드를 호출해서 "치즈피자를 먹다" 결과 출력!
		
		pizza.eatPizza("치즈피자");
		
		//PizzaStore pizza = new PizzaStore(); 이 방법 말고 PizzaStore에 있는 메소드 2개를 사용할 수 있는 방법
		
		new PizzaStore().eatPizza("치즈피자");
		
		DW d = new DW();
		
		//DW클래스 호출 방법 1
		d.지각하다();
		d.출근하다();
		
		//DW클래스 호출 방법 2
		new DW().지각하다();
		new DW().출근하다();
		
		//문제 3. 수업을배우다 메소드 호출.
		
		d.수업을배우다("문식쌤", "java");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
