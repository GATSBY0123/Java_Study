package account;

import java.util.ArrayList;
import java.util.List;

public class Study0810 {

	public static void main(String[] args) {
		
//		���׸��� �÷�����
//		List, Map
//		List<String> String�� ���� �� �ִ� list
		List<String> list = new ArrayList<String>();
		
//		list�� �迭��! �迭�� �ٸ����� �迭���̸� �����Ӱ� �߰� ������ �� �ִ�.
		list.add("���");
		list.add("���");
		list.add("�ᱹ��");
		list.add("Į����");
		
//		���̸� �������� ���
		System.out.println("�迭���̴� : " + list.size());
		
//		����(������)�� �������� ���
		System.out.println(list.get(0));
		
//		����) �ᱹ�� ����Ͻÿ�!
		System.out.println(list.get(2)); //��� 1
		System.out.println(list.get(list.size()-1)); //��� 2
		
//		�迭(list)�ϰ� for���� ģ��!
//		����) ���� ���� Į������ ������ Į�����Դϴ�. ����Ͻÿ�!
		
		for(int i=0; i<list.size(); i++) { //�Ϲ� for��
			String ���� = list.get(i);
			System.out.println("�޴��̸� : " + ����);
			if("Į����".equals(����)) { // ==(x) equals(o)
				System.out.println("������ Į�����Դϴ�.");
			}
		}
		for(String ���� : list) { //for-each (���� for��)
			System.out.println("�޴��̸� : " + ����);
		}
		
		List<String> ���� = new ArrayList<String>();
		
		����.add("���ð�");
		����.add("��Ŵ");
		����.add("SG���ʺ�");
		����.add("VOS");
		����.add("���ð�");
		
//		����) for���� �̿��ؼ� �̸��� �ߺ��Ǵ� ��� �� ���ϱ�.
//		����) 2��
		
		int count = 0;
		String ã���̸� = "���ð�";
		
		for(int i=0; i<����.size(); i++) {
			String �̸� = ����.get(i);
			if(�̸�.equals(ã���̸�)) {
				++count;
			}
		}
		System.out.println(count + "��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
