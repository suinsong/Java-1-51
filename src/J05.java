
public class J05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수: 데이터를 한개의 형태만 저장가능(여러개를 저장불가)
		//---->변할수있는 수(변수)
		//---->고정되어 있는 수(상수)
		//한정자 : final, static
		
		final int MAX=10; // final(한정자)을 앞에다 넣어주면 됨 <수정불가>
//		                                   그럼 상수가 되어 절대로 변하지 않음
//		                                   그래서 MAX or MIN이런 곳에서 씀
		
//		변수--->배열--->클래스
//		배열은 a[1], a[2], a[3]...[] 이런 식 이것을 index(색인) 라고 함
//		배열 덩어리 이것들을 ☆객체☆라고 함
		
//		Q) 정수 여러 개를 저장할 변수를 만들기
//		A) ☆★ int[] a; ☆★ 
//		이러면 a에 여러개 담을 수 있음
//		이런식으로 char[], float[]..도 가능쓰
		
		int[] b;
		
		
//		Q) 연결된 배열 구조 만들기
//		A) new[]
		
		b= new int[3];
		
//		b[0]/ b[1]/ b[2] 이렇게 0번부터 시작함
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		
		
		int sum= b[0]+b[1]+b[2];
				
				System.out.println(sum);
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
