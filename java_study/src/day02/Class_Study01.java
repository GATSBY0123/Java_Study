package day02;

//��� �ڹ� Ŭ������ ����Ʈ�� Object�� ��ӹ޴´�.

class DW { //DW�� Ŭ����(����) �̸�
	
	//DWŬ���� �ȿ��� DW�� �����ִ� ����(�޼ҵ�)�� �´�.
		
	public void ����ϴ�() {
		System.out.println("������ ���!");
	}
	public void �����ϴ�() {
		System.out.println("������ �����̾�!");
	}
	//���� 2. DWŬ������ ȣ���ϰ�, DW Ŭ������ ���ǵ� �޼ҵ带 ��� ����Ͻÿ�!
	
	public String ����������(String �������̸�, String �������̸�) {
		return �������̸� + "��" + �������̸� + "��(��) �˷��ִ�.";
		
	//���� 3. ������ ��ξ� �޼ҵ� ȣ��.
	}
}

class PizzaStore{ //Ŭ���� �̸� �տ��� ������ �빮��
	
	public void makePizza() {
		System.out.println("���ڸ� �����.");
	}
	public void eatPizza(String pizzaName) {
		System.out.println(pizzaName + "�� �Դ�.");
	}
}

//public class�� �ڹ����Ͽ��� �ϳ��� �´�.
public class Class_Study01 {
	

	//static �޼ҵ忡�� static �޼ҵ�� new�� ����ؼ� �ҷ��� �޼ҵ常 ���.
	public static void main(String[] args) {

		//main�Լ����� PizzaStore Ŭ������ ���(ȣ��)�ϰ�ʹ�.
		//�ٸ� Ŭ�������ִ� �޼ҵ峪 ������ ����� ���� new�� �� ����Ѵ�.
		PizzaStore pizza = new PizzaStore();
		int x = 10;
		
		//new PizzaStore(); PizzaStoreŬ������ ����ϰڴ�(�ҷ����ڴ�).
		pizza.makePizza(); //PizzaStore�� �ִ� makePizza�޼ҵ� ���
		
		//����1. eatPizza �޼ҵ带 ȣ���ؼ� "ġ�����ڸ� �Դ�" ��� ���!
		
		pizza.eatPizza("ġ������");
		
		//PizzaStore pizza = new PizzaStore(); �� ��� ���� PizzaStore�� �ִ� �޼ҵ� 2���� ����� �� �ִ� ���
		
		new PizzaStore().eatPizza("ġ������");
		
		DW d = new DW();
		
		//DWŬ���� ȣ�� ��� 1
		d.�����ϴ�();
		d.����ϴ�();
		
		//DWŬ���� ȣ�� ��� 2
		new DW().�����ϴ�();
		new DW().����ϴ�();
		
		//���� 3. ���������� �޼ҵ� ȣ��.
		
		d.����������("���Ľ�", "java");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
