package day01;

public class For_Study2 {

	public static void main(String[] args) {

		//����1. 1���� 10������ ���� ���Ͻÿ� (for���� �̿�)
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//����2. 1���� 10���� �� ¦�� ����?
		
		int count=0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) count++;
		}
		System.out.println(count);
	}
}
