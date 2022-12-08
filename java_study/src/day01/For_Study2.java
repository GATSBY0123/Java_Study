package day01;

public class For_Study2 {

	public static void main(String[] args) {

		//문제1. 1부터 10까지의 합을 구하시오 (for문을 이용)
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//문제2. 1부터 10까지 중 짝수 수는?
		
		int count=0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) count++;
		}
		System.out.println(count);
	}
}
