package account;

public class Account implements AccountImple {
	
	int �����ܰ� = 0; //�ʵ庯��(��������)
	String �̸� = "�����";
	
	@Override
	public void ���¸���ȸ�ϴ�() {
		
		System.out.println(this.�̸� + "�� ���¸� ��ȸ�ϰڽ��ϴ�.");
		System.out.println("�����ܰ� : " + this.�����ܰ� + "�� �Դϴ�.");
		
		//����1 �����ܰ� ��ȸ���� �� �����ܰ� 10���� ���ϸ�
		//"���� ��ǰ�ϳ� ��õ�� �帱���?" �ϴ� ���� ����ϱ�!
		final int MAX_MONEY = 100000;
		if(this.�����ܰ� <= MAX_MONEY) {
			System.out.println("���� ��ǰ�ϳ� ��õ�� �帱���?");
		}
	}

	@Override
	public void �������ִ�(int money) {
		
		System.out.println(money + "�� ���� �߻�!");
		
//		����2. ������ �߻��ϸ� �����ܰ� �ݾ� �߰�
		this.�����ܰ� = this.�����ܰ� + money;
	}

	@Override
	public void �������ִ�(int money) {
		
		System.out.println(money + "�� ���� �߻�!");
		
//		����3. ������� ����
//		this.�����ܰ� = this.�����ܰ� - money;
		
//		����4. �����ܰ� ���� ������ ������ �̷��� �� ~ �׾� ����Ͻÿ�
		if(this.�����ܰ� < money) {
			System.out.println("�̷��� �� ~ �׾�");
		}else {
			this.�����ܰ� = this.�����ܰ� - money;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
