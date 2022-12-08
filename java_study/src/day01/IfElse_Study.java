package day01;

public class IfElse_Study {

	public static void main(String[] args) {
		
		int x = 10;
		//문제 1. if else를 이용해서 x가 짝수면 짝수입니다 출력 아니면 홀수입니다 출력
		
		if(x%2 == 0) {
			System.out.println("짝수입니다.");
			x++;
			int y = x;
		}
		else {
			System.out.println("홀수입니다.");
			x++;
		}
		//최종 x의 값은? 최종 11
		//y의 최종 값은? 
		
		int b = 10;
		int result = b; //불가능한 코드 b는 이미 죽었음
		//문제 b의 값을 result에 대입할 수 있게 코드를 수정 하시오
	}
}
