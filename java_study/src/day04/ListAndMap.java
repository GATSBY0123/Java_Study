package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ���{
	
	private String ����̸�; //�ʵ庯��
	private int �������;
	
	public void set�̸�(String ����̸�) {
		this.����̸� = ����̸�;
	}
	public String get�̸�() {
		return this.����̸�;
	}
	
	public void set�������(int �������) {
		this.������� = �������;
	}
	public int get�������() {
		return this.�������;
	}

}

public class ListAndMap {

	public static void main(String[] args) {

		��� m = new ���();
//		m.����̸�("���缮"); ����! ���� : �ʵ庯���� public�� �ƴ� private!
		
//		����1. �ʵ庯���� ������ �� �� �ְ� ������ �����Ͻÿ�.��, ���������ڴ� private����
		m.set�̸�("���缮");
		String �̸� = m.get�̸�();
		System.out.println("�̸� => " + �̸�);
		
		m.set�������(51);
		int ������� = m.get�������();
		System.out.println("���� => " + �̸�);
		
		List<���> list = new ArrayList<���>();
		list.add(m);
		
		��� m2 = new ���();
		m2.set�̸�("������");
		m2.set�������(40);
		
		list.add(m2);
		
		for(��� x : list) {
			System.out.println(x.get�̸�() + ", " + x.get�������());
		}
		
//		���� 2. �Ϲ� for������ list�ȿ� �ִ� ���ҵ� ����ϱ�
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get�̸�() + ", " + list.get(i).get�������());
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", m); //m�� ���缮
		map.put("2", m2); //m2�� ������
		
		��� ���1 = (���) map.get("1"); //(���) : cast
		System.out.println("�̸� : " + ���1.get�̸�());
		System.out.println("���� : " + ���1.get�������());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
