
public class J18switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ���ù�(switch ~case) : �޴������
		 * break�� case���� �� �־�� ��
		 * 
		 * -����
		 * switch(  ��    ){
		 * case ��1:
		 * 
		 * break;
		 * case ��2:
		 * 
		 * break;
		 * case ��3:
		 * 
		 * break;
		 * default: �� ��� case���� �´°� ������ �̰��� ����
		 * 
		 *  break; ����Ʈ�� �극��ũ�� �־ �ǰ� ��� ��
		 *  
		 *  }
		 * 
		 * 
		 */
		
		
		
//		Q)a�� Ȧ������ ¦������ �Ǵ��ϱ�
		int a=8;
		int b=a%2;
		
		switch (b) {
		case 1:System.out.println("Ȧ��");
			break;

		case 0: System.out.println("¦��");
		    break;}
		
		
//		Q)�������ϱ�
		
		int jum=82;
		if(jum>=0 && jum<=100){
		switch (jum/10) {
		case 10:
		
		case 9:
			System.out.println("A");
			break;
			
		case 8:
			System.out.println("B");
			break;
			
		case 7:
			System.out.println("C");
			break;
			
		default:
			System.out.println("D");
			break;
		
		} }
		
		else{System.out.println("�߸��� ����");
		
		}
		
		char menu='I';//Create - Read - Updata - Delect
		switch (menu) {
		case 'C':System.out.println("insert�޼���� �̵��ϴ� �ڵ�");
			
			break;

		case 'U':System.out.println("update�޼���� �̵��ϴ� �ڵ�..");
			
			break;
			
		case 'R':
			System.out.println("read �޼���� �̵��ϴ� ���ڵ�");
		
			break;
			
			
		case 'D':
			System.out.println("delect�޼���� �̵��ϴ� �ڵ�..");
		
		
		default:
			System.out.println("�߸��� �޴��Դϴ�");
			break;
		}
		
		
		
	
	
	
	
	
	}
		
		
		
		

		}
		
	
