package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class 멤버{
	
	private String 멤버이름; //필드변수
	private int 멤버나이;
	
	public void set이름(String 멤버이름) {
		this.멤버이름 = 멤버이름;
	}
	public String get이름() {
		return this.멤버이름;
	}
	
	public void set멤버나이(int 멤버나이) {
		this.멤버나이 = 멤버나이;
	}
	public int get멤버나이() {
		return this.멤버나이;
	}

}

public class ListAndMap {

	public static void main(String[] args) {

		멤버 m = new 멤버();
//		m.멤버이름("유재석"); 오류! 이유 : 필드변수가 public이 아닌 private!
		
//		문제1. 필드변수에 접근을 할 수 있게 로직을 수정하시오.단, 접근지정자는 private으로
		m.set이름("유재석");
		String 이름 = m.get이름();
		System.out.println("이름 => " + 이름);
		
		m.set멤버나이(51);
		int 멤버나이 = m.get멤버나이();
		System.out.println("나이 => " + 이름);
		
		List<멤버> list = new ArrayList<멤버>();
		list.add(m);
		
		멤버 m2 = new 멤버();
		m2.set이름("정형돈");
		m2.set멤버나이(40);
		
		list.add(m2);
		
		for(멤버 x : list) {
			System.out.println(x.get이름() + ", " + x.get멤버나이());
		}
		
//		문제 2. 일반 for문으로 list안에 있는 원소들 출력하기
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get이름() + ", " + list.get(i).get멤버나이());
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", m); //m은 유재석
		map.put("2", m2); //m2는 정형돈
		
		멤버 멤버1 = (멤버) map.get("1"); //(멤버) : cast
		System.out.println("이름 : " + 멤버1.get이름());
		System.out.println("나이 : " + 멤버1.get멤버나이());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
