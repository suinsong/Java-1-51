
public class J03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����Char - ���Ϲ���(����<---/--->�񿵹�)
//	                      1����Ʈ             2����Ʈ
//		����ǥ��'A' 2����Ʈ
//		���ڵ����ʹ� ��ǻ�� ���ο��� ��ġ�� �����
//		��ǻ�ʹ� 2���� ü��ۿ� �ν� ���� 
//		�پƽ�Ű�ڵ��
//		A�� 65... a�� 97...32����
//		0�� 48 1�� 49...
		
				
//		��int(4����Ʈ) a='A'(2����Ʈ)������ �� ��� ���ڰ� �ƴ� ���� 65�� ��
		
		int a='A';
		System.out.println(a); //65 ���ڷ� ����

		
		
		//��char�� 2����Ʈ�� ������int�� 4����Ʈ���� �ڵ����� ���ִµ�
		
		char c='A'+1; //'A'�� 65+1=66=B
		System.out.println(c);//B���� ����
		
		
		
		
		char lower='A'+32;
		System.out.println(lower);
		
		char upper='a'-32;
		System.out.println(upper);
				
		
		
		//'1'+'1'=2 ����� �ϱ�
		//'1'�� 49�̴ϱ� 0�� 48
		
		int one='1';
		System.out.println(one);//'1'�� 49
		
		
		//'1'�� 49�̰� '0'�� 48 �̴ϱ� 1�̰�
		//'1'�� 49�̰� -48�̴ϱ� 1�� �� 2�� ����
		int v= ('1'-'0')+('1'-48); 
		System.out.println(v);
				
		
		
		

		
		
		
	}

}
