package day01;

public class Method_Study {
	
	
	//���� 1. �Ʒ� �޼ҵ� �̸���, ����Ÿ��, �Ķ���� Ÿ���� �ۼ��Ͻÿ�.
	// �޼ҵ� �̸� : eat
	// ���� Ÿ�� : void
	// �Ķ���� Ÿ�� : String
	
	public static void eat() {
		
	}
	
	//���� 2. �Ʒ� �޼ҵ� �̸���, ����Ÿ��, �Ķ���� Ÿ���� �ۼ��Ͻÿ�.
	// �޼ҵ� �̸� : getFood
	// ���� Ÿ�� : int
	// �Ķ���� Ÿ�� : String, int
	
	public int getFood(String food, int money) {
		return 0;
	}
	
	//void�� ������ ����.
	//����Ÿ���� ������ return�� �ۼ��ؾ� ��
	public static int getSum(int x, int y) {
		System.out.println("x�� ���� => " + x);
		System.out.println("y�� ���� => " + y);
		
		int sum = x + y;
		
		return sum;
	}
	
	//���� 1. �Ķ���� ���� 100�̶�� x�� 2�� ���ؼ� �����Ͻÿ�.
	public static int getNum(int x) {
		if(x == 100) return x * 2; //x�� 100�̸� ���⼭ return
		return 0; //�ƴ϶�� ���⼭  return
	}
	
	//���� 2. �ִ� ���ϱ�
	
	public static int getMax() {
		int array[] = {10, 20, 100, 5};
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) max = array[i];
		}
		return max;
	}
	
	//���� 3. x�� y���� ũ�� x�� y�� x���� ũ�� y�� �����ϴ� ���� ����.
	
	public static int getNum2(int x, int y) {
		
	if(x > y) return x;
	if(y > x) return y;
	return 0;
	}
	
	public static void main(String[] args) {

		eat(); //�ۼ��� �޼ҵ带 main�Լ��� ȣ���ߴ�.
		//����ƽ �޼ҵ�(�Լ�)���� ����ƽ �޼ҵ�(�Լ�)�� �� �� �ִ�.(������ ���ü� �ִ�)
		
		//getSum�޼ҵ� ȣ���ϱ�
		
		int sum = getSum(50,30);
		System.out.println("sum =>" + sum);
		
		int num = getNum(100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
