package day02;

class ����{
	
	String �������̵�;
	String ĳ��������;
	int ü�� = 100;
	int ����;
	
	public void �������׸´�(int ������) {
		//�������� �޾��� �� ü���� ���̴� ��������
		this.ü�� = this.ü�� - ������; 
	}
	//����) ü���� ȸ���ϴ� �޼ҵ� �ۼ�
	public void ü����ȸ���ϴ�(int ü��ȸ��) {
		this.ü�� = this.ü�� + ü��ȸ��;
	}
	public void ������() {
		this.����++;
	}
	public void �����������ϴ�(String �����̸�) {
		System.out.println("����� ������ " + �����̸� + "�Դϴ�.");
	}
	public void ��������ȸ() {
		int ���� = this.����;
		String ���� = this.ĳ��������;
		System.out.println("���� : " + ���� + "���� : " + ����);
	}
}

public class Class_Game {

	public static void main(String[] args) {
		
		���� ����1 = new ����();
		int ��������� = 60;
		����1.�������׸´�(���������);
		//����1.ü�� => ü�� �ʵ庯�� ����
		System.out.println("������ ���� ü���� => " + ����1.ü��);
		
		int ���� = 60;
		����1.ü����ȸ���ϴ�(����);
		System.out.println("������ ���� ü���� => " + ����1.ü��);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
