package day01;

public class Method_Study2 {
	
	//���� 4. �Ķ���Ͱ��� myId�� ���ؼ� ������ true Ʋ���� false�� �����ϴ� ���� ����
	
	public static boolean isUserId(String userId) {
		String myId = "apple";
		if(myId.equals(userId)) return true;
		if(!myId.equals(userId)) return false;
		return true;
	}
	
	//���� 5. x�� y�� ���� ���� �þ࿡ 100�� ������ 0�� �����Ͻÿ�.
	
	public static int getSum(int x, int y) {
		if((x + y) > 100) return 0;
		return 0;
	}
	
	//���� 6. �Ķ���Ͱ��� ȫ�浿�̶�� name�� �����ϰ�, �ƴ϶�� null�� �����Ͻÿ�. 
	
	public static String getName(String name) {
		if(name.equals("ȫ�浿")) return name;
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
