package Apple;

public class Apple implements AppleImple{

	int ������� = 0; //�ʵ庯��
	int ����Ʈ = 0; //�ʵ庯��
	
	public Apple() {
		this.������� = 5; //��������̶�� �ʵ庯���� �ʱ�ȭ ��.
		this.����Ʈ = 1000;
	}
	

	@Override
	public void ���������ȸ�ϴ�() {
		System.out.println("���� ���������" + this.�������);
	}

	@Override
	public void ������Դ�(int ����) {
		if(this.������� < ����) {
			System.out.println("����� �������ּ���!");
		}else {
			this.������� = this.������� - ����;
			System.out.println("��� �ȳ�");
			}
		}
	
	//@ : ������̼�
	@Override 
	public void ����������ϴ�(int ����) {
		if(���� >= 15) {
			System.out.println("����� ������ �� �����ϴ�.");
		}else {
			this.������� = this.������� + ����;
			System.out.println("����� �����߾��~");
		}
		if(���� >= 10) {
			this.����Ʈ = this.����Ʈ + 1000;
			System.out.println("õ����Ʈ�� ���޵Ǿ����ϴ�.");
		}
	}
	
	public void ����Ʈ��ȸ() {
		if(this.����Ʈ >= 2000) {
			System.out.println("������ ������ �� �־��!");
		}
			System.out.println("���� ����Ʈ��" + this.����Ʈ);
	}
}
	
