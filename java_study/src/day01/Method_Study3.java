package day01;

public class Method_Study3 {
	
	//***�Ķ���Ϳ� �迭�� ���� �� �ִ�.
	public static int getIndex(int[] array) {
		//���� 1. �迭�� ��� ���ؼ� ��հ� �����Ͻÿ�
		int avg = 0;
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println(avg);
		return avg;
	}
	//*** ���� Ÿ�Կ� �迭�� �´�.
	
	public static int[] getArray() {
		int array[] = {3, 5};
		return array;
	}
		
	public static int getResult(int x, int y) {
		return 0;
	}
	
	//���� 10.�Ķ���Ϳ� �迭�� ���� ���� �����ϰ� ���ĵ� �迭�� �����Ͻÿ�
	//ex) {5, 1, 2, 10} => {1, 2, 5, 10} 
	
	public static int[] getSort(int[] array) {
		
		int len = array.length;
		for(int i=len; i>0; i--) {
			boolean isChange = false;
			for(int j=0; j<(i-1); j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isChange = true;
				}
			}
			if(!isChange) break;
		}
		return array;
	}
	
	//���� 11.¦�� ������ �����Ͻÿ�.
	
	public static int getCount() {
		int count = 0;
		int array[] = {2, 3, 8, 10};
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) count++;
		} 
		return count;
	}
	
	public static void main(String[] args) {
		
		int a[] = {5, 1, 2, 10};
		getSort(a);
		
		int array[] = {8, 10, 20, 30}; //�迭 ����
		getIndex(array); //getIndex �Լ� ȣ�� �� array �Ķ���Ϳ� ����
		
		int array_1[] = getArray();
		//getArray() return�� �迭�̱� ������ ������ ����
		System.out.println("0��° ���� => " + array_1[0]);
	}
}
