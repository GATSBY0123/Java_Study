package day01;

public class Firstjava {

	public static void main(String[] args) { //Main �Լ�
		
		int x = 10;
		int y = 20;
		
		//x = x + y;
		//x�� ����?
		
		x += y;
		//x +=y�� x = x + y �� ����
		
		int money = 130000; //�Ž�����
		int oman = 50000;
		int man = 10000;
		//���� 1. �� ������ 5������ ���� �� �ִ��� ���Ͻÿ�!
		
		int omanCount = money / oman;
		System.out.println("������ => " + omanCount);
		
		//���� 2. �� ������ ����� ���� ������ ���� �� �������?
		
		int temp = money % oman;
		int manCount = temp / man;
		System.out.println("���� => " + manCount);
				
		//if / else, for�� ���� ���
		
		int z = 100; 	// 1. z�� 100�� ����
		z = z * 2;		// 2. z�� z�� 2�� ���� ����� ����
		int a = z;		// 3. a�� z�� ����
		//a �����? => 200
		
		int result_1 = 100;
		int temp_1 = 0;
		temp_1 = result_1;
		temp_1 = 500;
		result_1 = result_1 * 2;
		temp_1 = result_1;
		//temp_1�� �����? => 200
		
	}
}
