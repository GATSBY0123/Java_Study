package day01;

public class Method_Study4 {
	
	public static int[] getArray() {
		int array[] = {10, 50};
		return array;
	}
	//문제 1. getstrArray 메소드를 main함수에 호출하고 대입 하시오.
	public static String[] getstrArray() {
		String array[] = {"다당", "쿠겐", "실비김치", "카라멜"};
		return array;
	}
	
	public static String printFood() { //printFood 메인메소드에 호출
		System.out.println("사과 야아~~~미");
		return "사과 야아~~~미";
	}
	
	//문제 3. 아래 메소드를 메인메소드에 호출 후 변수에 대입하고 출력하시오.
	public static int getSum(int x, int y) {
		return x + y ;
	}
	
	//문제 4. 아래 메소드 메인메소드에 호출 후 변수 대입하고 출력하시오.
	public static String getStr(String food) {
		return food;
	}
	
	//문제 5. 아래 메소드 메인메소드에 호출 후 변수 대입하고 출력하시오.
	public static String getStr(String[] food) { //메소드 이름은 같으나 파라미터(인자, 매개변수) 타입이 다름 : *오버로딩
		//조건. 파라미터로 배열을 받는데, 마지막 원소에 값만 리턴 하시오
		return food[food.length-1];
	}
	
	public static void main(String[] args) {
		//리턴 타입이 잇으면 대입이 가능함
		int[] array = getArray(); //getArray 메소드 호출
		String[] strArray = getstrArray();
		String name = printFood(); //대입 불가능 why? return이 없는 void이기 때문에!
		
		//문제 2. printFood 메소드를 수정해서 위 에러 없애기
		
		//문제 3번 답안
		int result = getSum(10, 20);
		System.out.println("결과 : " + result);
		
		String food = getStr("곱창전골");
		System.out.println("결과 : " + food);
		
		String foodList[] = {"곱창구이", "곱창전골", "낙곱새"};
		String f = getStr(foodList);
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
