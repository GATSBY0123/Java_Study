package day01;

public class Method_Study4 {
	
	public static int[] getArray() {
		int array[] = {10, 50};
		return array;
	}
	//���� 1. getstrArray �޼ҵ带 main�Լ��� ȣ���ϰ� ���� �Ͻÿ�.
	public static String[] getstrArray() {
		String array[] = {"�ٴ�", "���", "�Ǻ��ġ", "ī���"};
		return array;
	}
	
	public static String printFood() { //printFood ���θ޼ҵ忡 ȣ��
		System.out.println("��� �߾�~~~��");
		return "��� �߾�~~~��";
	}
	
	//���� 3. �Ʒ� �޼ҵ带 ���θ޼ҵ忡 ȣ�� �� ������ �����ϰ� ����Ͻÿ�.
	public static int getSum(int x, int y) {
		return x + y ;
	}
	
	//���� 4. �Ʒ� �޼ҵ� ���θ޼ҵ忡 ȣ�� �� ���� �����ϰ� ����Ͻÿ�.
	public static String getStr(String food) {
		return food;
	}
	
	//���� 5. �Ʒ� �޼ҵ� ���θ޼ҵ忡 ȣ�� �� ���� �����ϰ� ����Ͻÿ�.
	public static String getStr(String[] food) { //�޼ҵ� �̸��� ������ �Ķ����(����, �Ű�����) Ÿ���� �ٸ� : *�����ε�
		//����. �Ķ���ͷ� �迭�� �޴µ�, ������ ���ҿ� ���� ���� �Ͻÿ�
		return food[food.length-1];
	}
	
	public static void main(String[] args) {
		//���� Ÿ���� ������ ������ ������
		int[] array = getArray(); //getArray �޼ҵ� ȣ��
		String[] strArray = getstrArray();
		String name = printFood(); //���� �Ұ��� why? return�� ���� void�̱� ������!
		
		//���� 2. printFood �޼ҵ带 �����ؼ� �� ���� ���ֱ�
		
		//���� 3�� ���
		int result = getSum(10, 20);
		System.out.println("��� : " + result);
		
		String food = getStr("��â����");
		System.out.println("��� : " + food);
		
		String foodList[] = {"��â����", "��â����", "������"};
		String f = getStr(foodList);
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
