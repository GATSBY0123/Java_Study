package day01;

public class For_Study {

	public static void main(String[] args) {

		//for �ݺ���
		//for���� ����ϴ� ���� : ������ �ݺ������� �۾��� �ϰ� ���� �� ���
		//for���� if/else ó�� ���� ���� ���
		//����Ʈ, �鿣�� �����ڸ� �Ϸ��� for�������� �˾߾� ��
		
		/*for(�ʱ⹮; ���ǽ�; �ݺ��� �۾�) {
			...�۾���...
		  }
		  1. �ʱ⹮ ����
		  2. ���ǽ� ����
		  3. �۾��� ����
		  4. �ݺ� �� �۾�
		*/
		for(int i=0; i<5; i++) {
			System.out.println("i�� ���� ? " + i);
		}
		
		//����1. 1���� 10���� for���� �ۼ��ϰ�, ¦���� ���ڸ� ����Ͻÿ�
		//=> 2, 4, 6, 8, 10
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);				
			}
		}
		//����2. 0���� 5���� for���� �ۼ��ϰ� i�� 4�� �� i�� 2�� ���Ͻÿ�
		
		for(int i=0; i<5; i++) {
			if(i == 4) {
				System.out.println(i*2);
			}
		}
		
		//����3. 1~10���� for���� �ۼ��ϰ� 1~10���� ������ ���Ͻÿ�.
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1���� 10���� ������ => " + sum);
		
		//����4. (�����) 1 ~ 5���� for���� �ۼ��ϰ� 3���� break �̿��ؼ� for�� ���߱�
		
		for(int i=1; i<=5; i++) {System.out.println(i);
			if(i == 3) break;
		}
		
		//����5. 1~10���� for���� �ۼ��ϰ�, ¦���� � ���� ���Ͻÿ�.
		
		int count = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) count++;
		}
		System.out.println("¦�� ���� = " + count + "��");
		
		//����6. 1 ~ 20���� for���� �ۼ��ϰ�, 1 ~ 20 ������ ���ϴµ�, ������ 60�� ������ break������ for���� Ż���Ͻÿ�
		int sum1 = 0;
		for(int i=1; i<=20; i++) {
			sum1 = sum1 + i;
			System.out.println(sum1);
			if( sum1 > 60) break;
		}
		
		
		
		
		
		
		
	}
}
