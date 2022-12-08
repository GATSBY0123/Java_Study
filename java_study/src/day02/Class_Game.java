package day02;

class 게임{
	
	String 유저아이디;
	String 캐릭터직업;
	int 체력 = 100;
	int 레벨;
	
	public void 몬스터한테맞다(int 데미지) {
		//데미지를 받았을 때 체력이 깎이는 로직구현
		this.체력 = this.체력 - 데미지; 
	}
	//문제) 체력을 회복하다 메소드 작성
	public void 체력을회복하다(int 체력회복) {
		this.체력 = this.체력 + 체력회복;
	}
	public void 레벨업() {
		this.레벨++;
	}
	public void 직업을선택하다(String 직업이름) {
		System.out.println("당신의 직업은 " + 직업이름 + "입니다.");
	}
	public void 내정보조회() {
		int 레벨 = this.레벨;
		String 직업 = this.캐릭터직업;
		System.out.println("레벨 : " + 레벨 + "직업 : " + 직업);
	}
}

public class Class_Game {

	public static void main(String[] args) {
		
		게임 유저1 = new 게임();
		int 고블린데미지 = 60;
		유저1.몬스터한테맞다(고블린데미지);
		//유저1.체력 => 체력 필드변수 조건
		System.out.println("유저의 현재 체력은 => " + 유저1.체력);
		
		int 포션 = 60;
		유저1.체력을회복하다(포션);
		System.out.println("유저의 현재 체력은 => " + 유저1.체력);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
