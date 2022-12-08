package day01;

public class For_Study {

	public static void main(String[] args) {

		//for 반복문
		//for문을 사용하는 이유 : 뭔가를 반복적으로 작업을 하고 싶을 때 사용
		//for문은 if/else 처럼 정말 많이 사용
		//프론트, 백엔드 개발자를 하려면 for문까지는 알야아 함
		
		/*for(초기문; 조건식; 반복후 작업) {
			...작업문...
		  }
		  1. 초기문 실행
		  2. 조건식 실행
		  3. 작업문 실행
		  4. 반복 후 작업
		*/
		for(int i=0; i<5; i++) {
			System.out.println("i의 값은 ? " + i);
		}
		
		//문제1. 1부터 10까지 for문을 작성하고, 짝수인 숫자를 출력하시오
		//=> 2, 4, 6, 8, 10
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);				
			}
		}
		//문제2. 0부터 5까지 for문을 작성하고 i가 4일 때 i에 2를 곱하시오
		
		for(int i=0; i<5; i++) {
			if(i == 4) {
				System.out.println(i*2);
			}
		}
		
		//문제3. 1~10까지 for문을 작성하고 1~10까지 총합을 구하시오.
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지 총합은 => " + sum);
		
		//문제4. (쉬운문제) 1 ~ 5까지 for문을 작성하고 3에서 break 이용해서 for문 멈추기
		
		for(int i=1; i<=5; i++) {System.out.println(i);
			if(i == 3) break;
		}
		
		//문제5. 1~10까지 for문을 작성하고, 짝수가 몇개 인지 구하시오.
		
		int count = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) count++;
		}
		System.out.println("짝수 갯수 = " + count + "개");
		
		//문제6. 1 ~ 20까지 for문을 작성하고, 1 ~ 20 총합을 구하는데, 총합이 60을 넘으면 break문으로 for문을 탈출하시오
		int sum1 = 0;
		for(int i=1; i<=20; i++) {
			sum1 = sum1 + i;
			System.out.println(sum1);
			if( sum1 > 60) break;
		}
		
		
		
		
		
		
		
	}
}
