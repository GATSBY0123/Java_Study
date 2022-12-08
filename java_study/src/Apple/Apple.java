package Apple;

public class Apple implements AppleImple{

	int 사과수량 = 0; //필드변수
	int 포인트 = 0; //필드변수
	
	public Apple() {
		this.사과수량 = 5; //사과수량이라는 필드변수를 초기화 함.
		this.포인트 = 1000;
	}
	

	@Override
	public void 사과수량조회하다() {
		System.out.println("현재 사과수량은" + this.사과수량);
	}

	@Override
	public void 사과를먹다(int 수량) {
		if(this.사과수량 < 수량) {
			System.out.println("사과를 구매해주세요!");
		}else {
			this.사과수량 = this.사과수량 - 수량;
			System.out.println("사과 냠냠");
			}
		}
	
	//@ : 어노테이션
	@Override 
	public void 사과를구매하다(int 수량) {
		if(수량 >= 15) {
			System.out.println("사과를 구매할 수 없습니다.");
		}else {
			this.사과수량 = this.사과수량 + 수량;
			System.out.println("사과를 구매했어요~");
		}
		if(수량 >= 10) {
			this.포인트 = this.포인트 + 1000;
			System.out.println("천포인트가 지급되었습니다.");
		}
	}
	
	public void 포인트조회() {
		if(this.포인트 >= 2000) {
			System.out.println("수박을 구매할 수 있어요!");
		}
			System.out.println("현재 포인트는" + this.포인트);
	}
}
	
