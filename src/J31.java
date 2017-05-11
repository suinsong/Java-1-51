
public class J31 {

	public static void main(String[] args) {
				
		int a=twohap(123,456);
		System.out.println(a);
			
	}

	//매개변수로 정수 2개를 받아서 총합을 구하여 리턴하는 메서드를 정의(twohap)
	
		public static int twohap(int a, int b){
			int sum= a+b;
//			System.out.println(sum);
			return sum;//리턴은 결과값을 메서드 이름(변수)에 담아서 리턴함
		//				 ★☆ 즉, int twoHap=sum;이거랑 비슷함
//						 메서드(일을 한 다음에 담고)는 변수와 같다
			
			
		}
}
