package day02;

class ġŲ�� {
	
	int �Ķ��̵�ġŲ���� = 100; //�ʵ庯�� (�ʵ庯���� �ʱ�ȭ���� �ʿ����)
	int ���ġŲ����; //����. �����ڿ��� ���ġŲ ������ 19000���� �����Ͻÿ�
	
	public ġŲ��() { //����Ʈ�� ����
		//����Ÿ���� ���� �޼ҵ���. => �����ڶ�� �θ���.
		//������ ���� : Ŭ������ �ִ� �ʵ庯�� Ȥ�� �޼ҵ带 �ʱ�ȭ�ϱ� ����
		this.�Ķ��̵�ġŲ���� = 18000;
		this.���ġŲ���� = 19000;
	}
	
	public void �ֹ����޴�(String �޴��̸�) {
		System.out.println(�޴��̸� + "��(��) �ֹ� �޾ҽ��ϴ�.");
	}
}
public class Class_Study3 {
	
	public static void main(String[] args) {

		//����2. ġŲ�� Ŭ������ ȣ���ؼ� �޼ҵ带 ����غ��ÿ�
		
		ġŲ�� c = new ġŲ��(); //new ġŲ��(); �ڵ����� �޼ҵ�(������)�� ȣ����
		c.�ֹ����޴�("���ġŲ");
		System.out.println("ġŲ ���� : " + c.�Ķ��̵�ġŲ���� + "��");
		System.out.println("ġŲ ���� : " + c.���ġŲ���� + "��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}