
public class J17IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7;
		if (a%2==0) {System.out.println("¦��");}
		else{System.out.println("Ȧ��");}
		
		int b=7;
		System.out.println((b%2==0) ? "¦��" : "Ȧ��");
		
//		Q) � ���� 3�� ����̸� 5�� ������� �Ǵ��Ͽ� ����Ͻÿ�
		int x=15;
//		System.out.println((x%3==0 && x%5==0);"3�� ����̸鼭 5�� �����":"����ƴ�")
				
		if (x%3==0 && x%5==0) {System.out.println( x +"�� YES");
			} else {System.out.println(x +"�� NO");}
		
		
		
//		Q)� ���ڰ� �ҹ������� �Ǵ��Ͻÿ�.(lower/upper)
//		char c='g';
//		int d='g';
		
//		if (d>97) {System.out.println("lower");
			
//		} else {System.out.println("upper");
//		}

		
		
//		�١� ���� if��
		
		char c='g';
		if (c>='A' && c<='Z') {
			System.out.println("UPPER");
		} else if(c>='a' && c<='z'){
			System.out.println("LOWER");
		}else{System.out.println("�빮�ڵ� �ҹ��ڵ� �ƴ�");}
		

//		Q)�������ϱ� 
//		90-100: A ����
//		80-89: B ����
//		70-79: C ����
//		69������: D ����
		
		int jum=865;
		if (jum>=90 && jum<=100 ) {
			System.out.println("A����");}
		 else if(jum>=80 && jum<=89){
			System.out.println("B����");}
			else if(jum>=70 && jum<=79){
				System.out.println("C����");}
				else if(jum>=0 && jum<70){
				System.out.println("D����");}
				else{System.out.println("������ 0~100�� ���̰� ������ ���Դϴ�.");}
	
//		if if ������ = ��ø������
		int java=76;
		if (java>=0 && java<=100) {
			if (java>=90) {System.out.println(java + "A����");
			} else if(java>=80 ) {System.out.println(java+"B����");
			} else if(java>=70 )System.out.println(java+"C����");
		    } else{System.out.println("��ȿ���� ���� �����Դϴ�");}
		
		
		
	}

		

		

		/*int a=10;
		 * �����ǹ�(if) '��������'�̶�� ��
		 * 		if(���ǹ�a>10){
		 *				������ ���� ��츸 ����...
		 * 					     }
		 *  ������ ���� else��{
		 *                       }
		 *
		 *{  �̷� �߰�ȣ�� ���� �κ���    } ====> ��, ����, ����, scope, ���� ��� �̶�� �� 
		 * 
		 * 
		 * 
		 * �μ��ù�(switch~case)
		 * �Ϲݺ���(for, while)
		 * �����(break, continue)
		 * 
		 * �迭
		 * �ż��� = ����
		 */
		
		
}
	
	
