
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
		
		//이동--->1. 한 클래스 내에서 다른 메서드로 이동
//				 2. 다른 클래스의 메서드로 이동
		add(buf);// call by reference(번지이동)
		
				
		
		
		
	}

	private static void add(int[] arr) {
		int intSum=0;
		for (int i = 0; i < arr.length; i++) {
			intSum += arr[i];
			
		}
		System.out.println(intSum);
	}

}
