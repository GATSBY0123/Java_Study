package day01;

public class Array_Study {

	public static void main(String[] args) {

		//�迭 ?
		int a = 5;
		int b = 10;
		int c = 10;
		
		//������ 100�� �����϶� ������ 100���� �����ϴ� ���� �����, ����� ������ �迭�� ����
		//�迭�� 0���� �����ϴ� �ֳ��ϸ� �̱����� �������
		int array[] = {5, 10, 10};
		
		//����1. �ι�° ���Ҹ� ����ϰ�, �迭�� ���̵� ����Ͻÿ�
		
		System.out.println(array[1]);		//�迭 ���� ����
		System.out.println(array.length); 	//�迭 ����
		
		int item = array[0]; //0��° ���Ҹ� item�� ����
		System.out.println(item);
		
		array[0] = 100; //100�� 0��° ���ҿ� ����
		
		if(array[0] == 100) {
			System.out.println("0��° ���Ҵ� 100");
		}
		
		//����2. ������ ���ҿ� 50�� �����ϰ� if �������� 50�̸� 50 ����ϴ� ���� ����
		array[2] = 50; //���� �迭 ���̸� �˾ƾ���
		//������ ���������ϴ� �ٸ� ���
		array[array.length - 1] = 50; //���� �迭 ���̸� ���� ������ ���ҿ� ���� ����
		if(array[2] == 50) {
			System.out.println("2��° ���Ҵ� 50");
		}
		
		//����3. �迭�ȿ� �ִ� ��� ���� ����Ͻÿ�
		
		System.out.println(array[0]); 	//0��° ���� ���
		System.out.println(array[1]);	//1��° ���� ���
		System.out.println(array[2]);	//2��° ���� ���
		
		//���� 3���� �Ʒ� for���� �̿��ϸ� �밡�� �۾��� ���� �� �ִ�
		int size = array.length;
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
		
		//����3-1. 0��° ���ҿ� 2��° ���ҿ� ���� 50 ���� �� ��� (����� �� for�� �̿��ؼ�)
		int arr_1[] = {1, 30, 40};
		arr_1[0] = 50;
		arr_1[2] = 50;
		//��� 1.
		for(int i=0; i<arr_1.length; i++) {
			System.out.println(arr_1[i]);
		}
		//��� 2.
		for(int i : arr_1) {
			System.out.println(i);
		}
		
		//����4. ��� ���Ұ� ���ϱ�
		int sum1 = 0;
		int arr[] = {10, 20, 30, 40, 50};
		for(int i=0; i<arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println(sum1);
		
		//����5. �Ʒ� ������ �ִ� ���ϱ� (for���� �̿��ؼ� Ǯ ��)
		//System.out.println(arr_2[1]); => (x)
		int arr_2 [] = {30, 100, 20, 5};
		int max = 0;
		for (int i=0; i<arr_2.length; i++) {
			if(max < arr_2[i]) {
				max = arr_2[i];
			}
		}
		System.out.println(max);
		
		//����6. �Ʒ� �迭���� ���Ұ��� 50�̸� for���� ���߽ÿ�
		int arr_3[] = {3, 7, 19, 50, 3, 1};
		for(int i=0; i<arr_3.length; i++) {
			if(arr_3[i] == 50)	break;
		}
		
		
		//����7. �Ʒ� �迭���� ������ ���ҿ� 2�� �����ְ� ������ ���Ҹ� ����Ͻÿ�
		int arr_4 [] = {4, 1, 9};
		int result = arr_4[arr_4.length-1] * 2;
		System.out.println(result);
	
		//����8. �迭 ��ġ �ٲٱ� 0��°�� 2��° ���Ұ� ���� �ٲٱ�
		int arr_5 [] = {3, 5, 8};
		int temp = 0;
		temp = arr_5[0];
		arr_5[0] = arr_5[2];
		arr_5[2] = temp;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
