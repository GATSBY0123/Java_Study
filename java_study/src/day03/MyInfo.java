package day03;

public class MyInfo implements StudyImple{

	//�������̵� : �޼ҵ� ������(�籸��)
	//�����ε� : �޼ҵ� �̸��� ������ �Ķ���� Ÿ�� Ȥ�� ������ �ٸ�
	@Override
	public void printName(String name) { //�������̽����� ���ǵ� �޼ҵ带 �����
		//���⼭ ��������
		System.out.println(name + "�Դϴ�");
		
	}

	@Override
	public void printAge(int age) {
		System.out.println("���̴�" + age);
	}

	@Override
	public void printName(int age, String name) {
		System.out.println("����" + age + " �̸� " + name);
	}

}
