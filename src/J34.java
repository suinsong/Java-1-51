
public class J34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CALL BY REFERENCE
		// �������� ������ �����ϴµ� �� �������� ��� ������ΰ�!!!!!!!!!
		//            ------>>>> �迭�� ����� ��
		
		
		int[] a = new int[3];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;

		int realsum=arrHap(a);
		
		System.out.println(realsum);
	}

				//������ �ޱ�
	public static int arrHap(int[] a){
		int sum=0; 	
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
		
	}







}

