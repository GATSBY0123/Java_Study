package account;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		
		System.out.println("�ܼ� ���α׷� ����");
		Account ������ = new Account();
		
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("[1]������ȸ [2]���� [3]���� [4]���� : ");
			
			int number = scan.nextInt();
			
			switch(number) {
			case 1 : 
				System.out.println("������ȸ"); 
				������.���¸���ȸ�ϴ�(); 
				break;
			case 2 : 
				System.out.println("����ݾ��� �Է��ϼ���!"); 
				int ���⵷ = scan.nextInt();
				������.�������ִ�(���⵷);
				break;
			case 3 : 
				System.out.println("���Աݾ��� �Է��ϼ���!"); 
				int ���� = scan.nextInt();
				������.�������ִ�(����);
				break;
			case 4 : 
				System.out.println("���α׷� ����"); 
				System.exit(0); 
				break;
			//System.exit(0); Java ��������
			}
		}
	}
}
