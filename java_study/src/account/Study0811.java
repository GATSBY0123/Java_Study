package account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Study0811 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("ġ����");
		
//		����) list�ȿ� �ִ� �����͸� ����Ͻÿ�.(for���� �̿��ؼ�)
//		����) ġ������ �����ϰ� list �ȿ� �ִ� �����͸� ����Ͻÿ�.(for���� �̿��ؼ�)
//		2�� hint => remove() �޼ҵ� ����ϱ�
		
		for(int i=0; i<list.size(); i++) {
			String ���� = list.get(i);
			System.out.println(����);
		}
		
		list.remove(1); //ġ���� ����
		for(int i=0; i<list.size(); i++) { //�Ϲ� for
			String ���� = list.get(i);
			System.out.println(����);
		}
		
		for(String ���� : list) { //for each
			System.out.println(����);
		}
		
//		HashMap
		Map<String, String> map = new HashMap<String, String>();
		
//		put : ������ insert
		map.put("1", "�̿��");
		map.put("2", "���ٿ�");
		map.put("3", "�̹�ȣ");
		map.put("4", "���±�");
		map.put("5", "û��");
//		map : key(�ߺ� �Ұ���), value(�ߺ� ���)
		
//		������ ����ϱ�
		String �����̸� = map.get("1");
		System.out.println("����Ÿ�� : " + �����̸�);
		
//		�ǹ����� map ����ϴ� ���
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		map2.put("1", 100);
		map2.put("2", "300");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
