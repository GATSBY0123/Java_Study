package day01;

public class IfElse_Study2 {

	public static void main(String[] args) {
		
		//step1. ���ڿ��� ��
		String name = "ȫ�浿"; //String�� class Ÿ���̴�.
		
		// ����1. �̸��� ȫ�浿�̶�� �α��� �Ϸ��� ����Ͻÿ�  
		//name == "ȫ�浿" // ���ڸ� ���ϴ°� �ƴ�
		//name.equals("ȫ�浿");
		//String�� Ŭ�����̱� ������ equals �޼ҵ带 ����ؼ� ���ؾ���
		//"ȫ�浿".equals(name);
		
		if("ȫ�浿".equals(name)) {
			System.out.println("�α��� �Ϸ�"); //System ���� Ŭ������
		}
		
		//����2. else�� ������� ���� ȫ�浿�� �ƴ϶�� �α��� ���� ���
		
		if(!"ȫ�浿".equals(name)) {
			System.out.println("�α��� ����!"); //!�� ������ �ǹ�
		}
		
		//��� : else�� �ִ��� ������� �ʱ�(else�� �������� ���߿� �ڵ尡 ������� ���� ��ƴ�)
		
		//step.2 boolean���� if/else ����ϴ¹�
		
		boolean isLogin = true; //boolean Ÿ�� �������� �տ� is Ȥ�� has�� �´�
		
		//����3 .isLogin�� true�� �α��� �Ϸ� false�� �α��� ����(��, else ������� �� ��)
		//tip) boolean�� flag(���)���̶�� �θ��⵵ �Ѵ�
		
		if(isLogin) {
			System.out.println("�α��� �Ϸ�");
		}
		if(!isLogin) {
			System.out.println("�α��� ����");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
