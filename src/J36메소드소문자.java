
public class J36�޼ҵ�ҹ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = new char[5];
		c[0] = 'A';
		c[1] = 'P';
		c[2] = 'P';
		c[3] = 'L';
		c[4] = 'E';

	lowchar(c);
	
	}
//	
//	char c='A'+1; //'A'�� 65+1=66=B
//	System.out.println(c);//B���� ����
	
	
//�Ű������� ���� �������� �޾Ƽ� ��� ���ڸ� ���ҹ��ڷ� �����Ͽ� ����ϴ� �ż��带 ����(lowchar)
	
	
	public static void lowchar (char[] c){
		for (int i = 0; i < c.length; i++) {
			System.out.print((char)(c[i]+32));
			
			
		}
		
		
			
	}
	
	
	
}
