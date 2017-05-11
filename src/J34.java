
public class J34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CALL BY REFERENCE
		// 여러개는 번지로 전달하는데 그 여러개를 어떻게 만들것인가!!!!!!!!!
		//            ------>>>> 배열로 만드면 됨
		
		
		int[] a = new int[3];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;

		int realsum=arrHap(a);
		
		System.out.println(realsum);
	}

				//여러개 받기
	public static int arrHap(int[] a){
		int sum=0; 	
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
		
	}







}

