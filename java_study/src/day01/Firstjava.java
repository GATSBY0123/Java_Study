package day01;

public class Firstjava {

	public static void main(String[] args) { //Main 함수
		
		int x = 10;
		int y = 20;
		
		//x = x + y;
		//x의 값은?
		
		x += y;
		//x +=y는 x = x + y 와 같음
		
		int money = 130000; //거스름돈
		int oman = 50000;
		int man = 10000;
		//문제 1. 총 몇장의 5만원을 받을 수 있는지 구하시오!
		
		int omanCount = money / oman;
		System.out.println("오만원 => " + omanCount);
		
		//문제 2. 총 오만원 몇장과 만원 몇장을 받을 수 있을까요?
		
		int temp = money % oman;
		int manCount = temp / man;
		System.out.println("만원 => " + manCount);
				
		//if / else, for문 많이 사용
		
		int z = 100; 	// 1. z에 100을 대입
		z = z * 2;		// 2. z에 z와 2를 곱한 결과를 대입
		int a = z;		// 3. a에 z를 대입
		//a 결과는? => 200
		
		int result_1 = 100;
		int temp_1 = 0;
		temp_1 = result_1;
		temp_1 = 500;
		result_1 = result_1 * 2;
		temp_1 = result_1;
		//temp_1의 결과는? => 200
		
	}
}
