package users;

import java.util.ArrayList;
import java.util.List;

public class Home {

	public static void main(String[] args) {

		User �����1 = new User();
		�����1.������̸� = "���缮";
		�����1.����ڿ���ó = "010-3333";
		
		User �����2 = new User();
		�����2.������̸� = "�ڸ���";
		�����2.����ڿ���ó = "010-4444";
		
		User �����3 = new User();
		�����3.������̸� = "������";
		�����3.����ڿ���ó = "010-5555";
		
		List<User> list = new ArrayList<User>();
		list.add(�����1); //���缮 �߰�
		list.add(�����2); //�ڸ��� �߰�
		list.add(�����3); //������ �߰�
		
		User user = list.get(0); //����Ÿ���� User��.
		System.out.println(user.����ڿ���ó);
		System.out.println(user.������̸�);
		
//		�ڸ��� �̸�, ����ó ȣ��
		User user2 = list.get(1);
		System.out.println(user2.����ڿ���ó);
		System.out.println(user2.������̸�);
		
//		��� 2. ���� user Ȱ��
		user = list.get(1);
		System.out.println(user.����ڿ���ó);
		System.out.println(user.������̸�);
		
//		���� ������̸��� ���缮�̸� ����ڿ���ó�� 010-7777�� �����Ͻÿ�!
		for(int i=0; i<list.size(); i++) {
			User u = list.get(i);
			String name = list.get(i).������̸�;
			if("���缮".equals(name)) {
				list.get(i).����ڿ���ó = "010-7777";
			}
			System.out.println("����� �̸� : " + u.������̸�);
			System.out.println("����� ����ó : " + u.����ڿ���ó);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}