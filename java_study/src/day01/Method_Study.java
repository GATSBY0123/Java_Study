package day01;

public class Method_Study {
	
	
	//문제 1. 아래 메소드 이름과, 리턴타입, 파라미터 타입을 작성하시오.
	// 메소드 이름 : eat
	// 리턴 타입 : void
	// 파라미터 타입 : String
	
	public static void eat() {
		
	}
	
	//문제 2. 아래 메소드 이름과, 리턴타입, 파라미터 타입을 작성하시오.
	// 메소드 이름 : getFood
	// 리턴 타입 : int
	// 파라미터 타입 : String, int
	
	public int getFood(String food, int money) {
		return 0;
	}
	
	//void는 리턴이 없다.
	//리턴타입이 있으면 return을 작성해야 함
	public static int getSum(int x, int y) {
		System.out.println("x의 값은 => " + x);
		System.out.println("y의 값은 => " + y);
		
		int sum = x + y;
		
		return sum;
	}
	
	//문제 1. 파라미터 값이 100이라면 x에 2를 곱해서 리턴하시오.
	public static int getNum(int x) {
		if(x == 100) return x * 2; //x가 100이면 여기서 return
		return 0; //아니라면 여기서  return
	}
	
	//문제 2. 최댓값 구하기
	
	public static int getMax() {
		int array[] = {10, 20, 100, 5};
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) max = array[i];
		}
		return max;
	}
	
	//문제 3. x가 y보다 크면 x를 y가 x보다 크면 y를 리턴하는 로직 구현.
	
	public static int getNum2(int x, int y) {
		
	if(x > y) return x;
	if(y > x) return y;
	return 0;
	}
	
	public static void main(String[] args) {

		eat(); //작성한 메소드를 main함수에 호출했다.
		//스태틱 메소드(함수)에는 스태틱 메소드(함수)만 올 수 있다.(면접에 나올수 있다)
		
		//getSum메소드 호출하기
		
		int sum = getSum(50,30);
		System.out.println("sum =>" + sum);
		
		int num = getNum(100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
