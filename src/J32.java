
public class J32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int start=50;
//		int end=150;					//�ż����� �ñ״�ó
		int a=sum(50,150); //�޼��� ȣ�� ����--->(����, Ÿ��)�� ���ƾ���!!!!!!
		System.out.println(a);
		
		
	}
//	�Ű������� 2���� ������ �޾Ƽ� �� �� ������ ������ ���Ͽ� �����ϴ� �޼��带 ����
	
	public static int sum(int s, int e){
		int hap=0;
		for (int i = s; i <=e; i++) {
			
			hap+=i;
		}return hap;
		
		
	}
	
	
}
