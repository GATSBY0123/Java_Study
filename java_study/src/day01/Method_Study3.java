package day01;

public class Method_Study3 {
	
	//***파라미터에 배열도 받을 수 있다.
	public static int getIndex(int[] array) {
		//문제 1. 배열값 평균 구해서 평균값 리턴하시오
		int avg = 0;
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println(avg);
		return avg;
	}
	//*** 리턴 타입에 배열도 온다.
	
	public static int[] getArray() {
		int array[] = {3, 5};
		return array;
	}
		
	public static int getResult(int x, int y) {
		return 0;
	}
	
	//문제 10.파라미터에 배열을 받은 값을 정렬하고 정렬된 배열을 리턴하시오
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
	
	//문제 11.짝수 개수를 리턴하시오.
	
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
		
		int array[] = {8, 10, 20, 30}; //배열 생성
		getIndex(array); //getIndex 함수 호출 후 array 파라미터에 대입
		
		int array_1[] = getArray();
		//getArray() return이 배열이기 때문에 가능한 문법
		System.out.println("0번째 나와 => " + array_1[0]);
	}
}
