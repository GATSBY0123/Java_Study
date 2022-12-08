package day01;

public class Method_Study2 {
	
	//문제 4. 파라미터값과 myId와 비교해서 맞으면 true 틀리면 false를 리턴하는 로직 구현
	
	public static boolean isUserId(String userId) {
		String myId = "apple";
		if(myId.equals(userId)) return true;
		if(!myId.equals(userId)) return false;
		return true;
	}
	
	//문제 5. x와 y를 더한 값이 먄약에 100을 넘으면 0을 리턴하시오.
	
	public static int getSum(int x, int y) {
		if((x + y) > 100) return 0;
		return 0;
	}
	
	//문제 6. 파라미터값이 홍길동이라면 name을 리턴하고, 아니라면 null을 리턴하시오. 
	
	public static String getName(String name) {
		if(name.equals("홍길동")) return name;
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
