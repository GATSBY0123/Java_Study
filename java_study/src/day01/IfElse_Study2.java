package day01;

public class IfElse_Study2 {

	public static void main(String[] args) {
		
		//step1. 문자열로 비교
		String name = "홍길동"; //String은 class 타입이다.
		
		// 문제1. 이름이 홍길동이라면 로그인 완료라고 출력하시오  
		//name == "홍길동" // 문자를 비교하는게 아님
		//name.equals("홍길동");
		//String이 클래스이기 때문에 equals 메소드를 사용해서 비교해야함
		//"홍길동".equals(name);
		
		if("홍길동".equals(name)) {
			System.out.println("로그인 완료"); //System 역시 클래스다
		}
		
		//문제2. else를 사용하지 말고 홍길동이 아니라면 로그인 실패 출력
		
		if(!"홍길동".equals(name)) {
			System.out.println("로그인 실패!"); //!는 부정을 의미
		}
		
		//결론 : else를 최대한 사용하지 않기(else는 편하지만 나중에 코드가 길어지면 보기 어렵다)
		
		//step.2 boolean으로 if/else 사용하는법
		
		boolean isLogin = true; //boolean 타입 변수명은 앞에 is 혹은 has가 온다
		
		//문제3 .isLogin이 true면 로그인 완료 false면 로그인 실패(단, else 사용하지 말 것)
		//tip) boolean을 flag(깃발)값이라고 부르기도 한다
		
		if(isLogin) {
			System.out.println("로그인 완료");
		}
		if(!isLogin) {
			System.out.println("로그인 실패");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
