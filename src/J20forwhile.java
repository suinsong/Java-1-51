
public class J20forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for���� ������ �ݺ��ؾ��ϴ��� �˶�
//		while���� ������ �ݺ��ؾ��ϴ��� �𸦶�
		
		
		
//		Q) 1~10������ �� �� ¦���� ����Ͻÿ�.
		
		for (int i = 1; i <=10; i++) {
			
			if (i%2==0) {
				System.out.println(i);
				}
				}
		
		System.out.println();
		System.out.println();
		
		
//	 	Q) 1~30���� �� �� 3�� ����̰� 5�� ����� ���� ����Ͻÿ�
		for (int i = 1; i <=30; i++) {
			if (i%3==0 && i%5==0) {
			System.out.println(i);	
			} 
		}
		
		
		
		//Q) while���� �̿��� 1~50���� 5�� ����� ���
		
		
		int x=1;
	
		while (x<=50) {
			if (x%5==0) {
				System.out.println(x);
			} 
		x++;	// �ڡ��������� �ؿ��ٰ� ����� ��
		}
		
		System.out.println();
		System.out.println();
		
		
//		���� A~Z���� ����Ͻÿ�
		char a='A';
		do {System.out.print(a);
			a++;
		} while (a<='Z');
		
		
		
		
/* while �ݺ���	
 * -���� (������ ��ó��)
 * 	�� �ʱⰪ (�̸� ����)
 * 		while(�� ����){
 *  		 ������ ���� ��쿡 ����
 *  	            �� ������
 *				 }
 *
 *
 * -����(��ó�� ������)
 *   do{
 *   
 *   
 *   } while(����);
 *   
 *   	
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



