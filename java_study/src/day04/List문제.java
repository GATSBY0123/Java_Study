package day04;

import java.util.List;
import java.util.ArrayList;

class ī��{
	private String �޴��̸�; //ex) �Ƹ޸�ī��, ��, ���� ���
	private int ����;
	public String get�޴��̸�() {
		return �޴��̸�;
	}
	public void set�޴��̸�(String �޴��̸�) {
		this.�޴��̸� = �޴��̸�;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public int get����Ʈ����() {
		return ����Ʈ����;
	}
	public void set����Ʈ����(int ����Ʈ����) {
		this.����Ʈ���� = ����Ʈ����;
	}
	private int ����Ʈ����;
}

/*
1. �ʵ庯�� getter setter �޼ҵ� ����
2. ����������3000��, �Ƹ޸�ī�� 4000��, �� 4500��, ��ü ���� 
3. ������ ��ü list�� ���
4. list�� �ִ� ��� ���� ����ϱ�
5. list�� �󶼰� ������ ī���ī�� �̸� ����
*/
public class List���� {

	public static void main(String[] args) {

		List<ī��> list = new ArrayList<ī��>();
		
		ī�� c = new ī��();
		c.set�޴��̸�("����������");
		c.set����(3500);
		list.add(c);
		
		ī�� c2 = new ī��();
		c2.set�޴��̸�("�Ƹ޸�ī��");
		c2.set����(4000);
		list.add(c2);
		
		ī�� c3 = new ī��();
		c3.set�޴��̸�("��");
		c3.set����(4500);
		list.add(c3);
		
		for(ī�� x : list) {
			System.out.println(x.get�޴��̸�() + " ���� : " + x.get����() + "��");
		}
		
		for(int i=0; i<list.size(); i++) {
			String �޴��̸� = list.get(i).get�޴��̸�(); //�޼ҵ� ü�̴�
			if("��".equals(�޴��̸�)) {
				list.get(i).set�޴��̸�("ī���ī");
				System.out.println("��� : " + list.get(i).get�޴��̸�());
			}
		}
		
//		list.get(i).get�޴��̸�();
		ī�� cafe = list.get(0); //0��° ����ȣ��
		cafe.get�޴��̸�(); //cafe Ŭ������ �ִ� get�޴��̸� �޼ҵ� ȣ��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
