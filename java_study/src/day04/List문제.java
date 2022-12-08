package day04;

import java.util.List;
import java.util.ArrayList;

class 카페{
	private String 메뉴이름; //ex) 아메리카노, 라떼, 녹차 등등
	private int 가격;
	public String get메뉴이름() {
		return 메뉴이름;
	}
	public void set메뉴이름(String 메뉴이름) {
		this.메뉴이름 = 메뉴이름;
	}
	public int get가격() {
		return 가격;
	}
	public void set가격(int 가격) {
		this.가격 = 가격;
	}
	public int get포인트적립() {
		return 포인트적립;
	}
	public void set포인트적립(int 포인트적립) {
		this.포인트적립 = 포인트적립;
	}
	private int 포인트적립;
}

/*
1. 필드변수 getter setter 메소드 생성
2. 에스프레소3000원, 아메리카노 4000원, 라떼 4500원, 객체 생성 
3. 생성한 객체 list에 담기
4. list에 있는 모든 원소 출력하기
5. list에 라떼가 있으면 카페모카로 이름 수정
*/
public class List문제 {

	public static void main(String[] args) {

		List<카페> list = new ArrayList<카페>();
		
		카페 c = new 카페();
		c.set메뉴이름("에스프레소");
		c.set가격(3500);
		list.add(c);
		
		카페 c2 = new 카페();
		c2.set메뉴이름("아메리카노");
		c2.set가격(4000);
		list.add(c2);
		
		카페 c3 = new 카페();
		c3.set메뉴이름("라떼");
		c3.set가격(4500);
		list.add(c3);
		
		for(카페 x : list) {
			System.out.println(x.get메뉴이름() + " 가격 : " + x.get가격() + "원");
		}
		
		for(int i=0; i<list.size(); i++) {
			String 메뉴이름 = list.get(i).get메뉴이름(); //메소드 체이닝
			if("라떼".equals(메뉴이름)) {
				list.get(i).set메뉴이름("카페모카");
				System.out.println("결과 : " + list.get(i).get메뉴이름());
			}
		}
		
//		list.get(i).get메뉴이름();
		카페 cafe = list.get(0); //0번째 원소호출
		cafe.get메뉴이름(); //cafe 클래스에 있는 get메뉴이름 메소드 호출
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
