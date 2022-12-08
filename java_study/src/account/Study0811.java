package account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Study0811 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("만두");
		list.add("치즈라면");
		
//		문제) list안에 있는 데이터를 출력하시오.(for문을 이용해서)
//		문제) 치즈라면을 삭제하고 list 안에 있는 데이터를 출력하시오.(for문을 이용해서)
//		2번 hint => remove() 메소드 사용하기
		
		for(int i=0; i<list.size(); i++) {
			String 음식 = list.get(i);
			System.out.println(음식);
		}
		
		list.remove(1); //치즈라면 삭제
		for(int i=0; i<list.size(); i++) { //일반 for
			String 음식 = list.get(i);
			System.out.println(음식);
		}
		
		for(String 음식 : list) { //for each
			System.out.println(음식);
		}
		
//		HashMap
		Map<String, String> map = new HashMap<String, String>();
		
//		put : 데이터 insert
		map.put("1", "이용규");
		map.put("2", "정근우");
		map.put("3", "이범호");
		map.put("4", "김태균");
		map.put("5", "청하");
//		map : key(중복 불가능), value(중복 허용)
		
//		데이터 출력하기
		String 선수이름 = map.get("1");
		System.out.println("국민타자 : " + 선수이름);
		
//		실무에서 map 사용하는 방법
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		map2.put("1", 100);
		map2.put("2", "300");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
