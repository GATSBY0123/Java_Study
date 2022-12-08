package account;

import java.util.ArrayList;
import java.util.List;

public class Study0810 {

	public static void main(String[] args) {
		
//		제네릭과 컬렉션즈
//		List, Map
//		List<String> String만 넣을 수 있는 list
		List<String> list = new ArrayList<String>();
		
//		list는 배열임! 배열과 다른점은 배열길이를 자유롭게 추가 삭제할 수 있다.
		list.add("돈까스");
		list.add("김밥");
		list.add("콩국수");
		list.add("칼국수");
		
//		길이를 가져오는 방법
		System.out.println("배열길이는 : " + list.size());
		
//		원소(데이터)를 가져오는 방법
		System.out.println(list.get(0));
		
//		문제) 콩국수 출력하시오!
		System.out.println(list.get(2)); //방법 1
		System.out.println(list.get(list.size()-1)); //방법 2
		
//		배열(list)하고 for문은 친구!
//		문제) 원소 값이 칼국수면 오늘은 칼국수입니다. 출력하시오!
		
		for(int i=0; i<list.size(); i++) { //일반 for문
			String 음식 = list.get(i);
			System.out.println("메뉴이름 : " + 음식);
			if("칼국수".equals(음식)) { // ==(x) equals(o)
				System.out.println("오늘은 칼국수입니다.");
			}
		}
		for(String 음식 : list) { //for-each (향상된 for문)
			System.out.println("메뉴이름 : " + 음식);
		}
		
		List<String> 가수 = new ArrayList<String>();
		
		가수.add("성시경");
		가수.add("폴킴");
		가수.add("SG워너비");
		가수.add("VOS");
		가수.add("성시경");
		
//		문제) for문을 이용해서 이름이 중복되는 사람 수 구하기.
//		정답) 2명
		
		int count = 0;
		String 찾는이름 = "성시경";
		
		for(int i=0; i<가수.size(); i++) {
			String 이름 = 가수.get(i);
			if(이름.equals(찾는이름)) {
				++count;
			}
		}
		System.out.println(count + "명");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
