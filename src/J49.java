
public class J49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		
		int[] buf=new int[3];
		buf[0]=a;
		buf[1]=b;
		buf[2]=c;
		
		//�̵�--->1. �� Ŭ���� ������ �ٸ� �޼���� �̵�
//				 2. �ٸ� Ŭ������ �޼���� �̵�
		add(buf);// call by reference(�����̵�)
		
				
		
		
		
	}

	private static void add(int[] arr) {
		int intSum=0;
		for (int i = 0; i < arr.length; i++) {
			intSum += arr[i];
			
		}
		System.out.println(intSum);
	}

}
