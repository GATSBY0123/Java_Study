package account;

public class Account implements AccountImple {
	
	int 통장잔고 = 0; //필드변수(전역변수)
	String 이름 = "김수찬";
	
	@Override
	public void 계좌를조회하다() {
		
		System.out.println(this.이름 + "님 계좌를 조회하겠습니다.");
		System.out.println("통장잔고 : " + this.통장잔고 + "원 입니다.");
		
		//문제1 통장잔고를 조회했을 때 통장잔고가 10만원 이하면
		//"고객님 상품하나 추천해 드릴까요?" 하는 문구 출력하기!
		final int MAX_MONEY = 100000;
		if(this.통장잔고 <= MAX_MONEY) {
			System.out.println("고객님 상품하나 추천해 드릴까요?");
		}
	}

	@Override
	public void 수입이있다(int money) {
		
		System.out.println(money + "원 수입 발생!");
		
//		문제2. 수입이 발생하면 통잔잔고에 금액 추가
		this.통장잔고 = this.통장잔고 + money;
	}

	@Override
	public void 지출이있다(int money) {
		
		System.out.println(money + "원 지출 발생!");
		
//		문제3. 지출로직 구현
//		this.통장잔고 = this.통장잔고 - money;
		
//		문제4. 통장잔고 보다 지출이 많으면 이러다 다 ~ 죽어 출력하시오
		if(this.통장잔고 < money) {
			System.out.println("이러다 다 ~ 죽어");
		}else {
			this.통장잔고 = this.통장잔고 - money;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
