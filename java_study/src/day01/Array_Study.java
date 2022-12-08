package day01;

public class Array_Study {

	public static void main(String[] args) {

		//배열 ?
		int a = 5;
		int b = 10;
		int c = 10;
		
		//변수를 100개 선언하라 변수를 100번을 선언하는 것은 헛수고, 헛수고를 덜고자 배열이 나옴
		//배열은 0부터 시작하는 왜냐하면 미국인이 만들었음
		int array[] = {5, 10, 10};
		
		//문제1. 두번째 원소를 출력하고, 배열의 길이도 출력하시오
		
		System.out.println(array[1]);		//배열 원소 접근
		System.out.println(array.length); 	//배열 길이
		
		int item = array[0]; //0번째 원소를 item에 대입
		System.out.println(item);
		
		array[0] = 100; //100을 0번째 원소에 대입
		
		if(array[0] == 100) {
			System.out.println("0번째 원소는 100");
		}
		
		//문제2. 마지막 원소에 50을 대입하고 if 조건으로 50이면 50 출력하는 로직 구현
		array[2] = 50; //내가 배열 길이를 알아야함
		//마지막 원소접근하는 다른 방법
		array[array.length - 1] = 50; //내가 배열 길이를 몰라도 마지막 원소에 접근 보장
		if(array[2] == 50) {
			System.out.println("2번째 원소는 50");
		}
		
		//문제3. 배열안에 있는 모든 원소 출력하시오
		
		System.out.println(array[0]); 	//0번째 원소 출력
		System.out.println(array[1]);	//1번째 원소 출력
		System.out.println(array[2]);	//2번째 원소 출력
		
		//문제 3번은 아래 for문을 이용하면 노가다 작업을 줄일 수 있다
		int size = array.length;
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
		
		//문제3-1. 0번째 원소와 2번째 원소에 각각 50 대입 후 출력 (출력할 때 for문 이용해서)
		int arr_1[] = {1, 30, 40};
		arr_1[0] = 50;
		arr_1[2] = 50;
		//방법 1.
		for(int i=0; i<arr_1.length; i++) {
			System.out.println(arr_1[i]);
		}
		//방법 2.
		for(int i : arr_1) {
			System.out.println(i);
		}
		
		//문제4. 모든 원소값 더하기
		int sum1 = 0;
		int arr[] = {10, 20, 30, 40, 50};
		for(int i=0; i<arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println(sum1);
		
		//문제5. 아래 원소중 최댓값 구하기 (for문을 이용해서 풀 것)
		//System.out.println(arr_2[1]); => (x)
		int arr_2 [] = {30, 100, 20, 5};
		int max = 0;
		for (int i=0; i<arr_2.length; i++) {
			if(max < arr_2[i]) {
				max = arr_2[i];
			}
		}
		System.out.println(max);
		
		//문제6. 아래 배열에서 원소값이 50이면 for문을 멈추시오
		int arr_3[] = {3, 7, 19, 50, 3, 1};
		for(int i=0; i<arr_3.length; i++) {
			if(arr_3[i] == 50)	break;
		}
		
		
		//문제7. 아래 배열에서 마지막 원소에 2를 곱해주고 마지막 원소만 출력하시오
		int arr_4 [] = {4, 1, 9};
		int result = arr_4[arr_4.length-1] * 2;
		System.out.println(result);
	
		//문제8. 배열 위치 바꾸기 0번째와 2번째 원소값 서로 바꾸기
		int arr_5 [] = {3, 5, 8};
		int temp = 0;
		temp = arr_5[0];
		arr_5[0] = arr_5[2];
		arr_5[2] = temp;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
