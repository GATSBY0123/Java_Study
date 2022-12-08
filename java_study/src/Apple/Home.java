 package Apple;

public class Home {

	public static void main(String[] args) {

		Apple a = new Apple();
		
		
		a.사과수량조회하다();
		a.사과를먹다(3);
		a.사과수량조회하다();
		a.사과를먹다(3);
		a.사과를구매하다(10);
		a.사과수량조회하다();
		a.포인트조회();
		
		//문제) 사과를 15개 이상 구매할 수 없게 로직을 구현하시오.
		
		//문제) 사과를 10개 이상 구입한 손님에게 천포인트를 준다.
		
		//문제) 인터페이스에 포인트를 조회하는 메소드를 정의하시오.
	}
}
