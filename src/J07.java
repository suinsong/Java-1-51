
public class J07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		☆★☆ a는 '객체 변수'임 
//	       '번지'가 들어가 있음
	
		
//		Q) 정수 4개를 저장할 배열을 생성하시오.
		
		int[] a=new int[4]; //선언과 동시에 초기화
		
		
		//a.length 객체의 길이 구할 때
		System.out.println(a.length);
		System.out.println(a[2]);			
//		왜 길이를 구해야함?------>반복문 쓸때 필요함
		
		
//		Q) 모든 원소에 10을 저장하시오.
		a[0]=a[1]=a[2]=a[3]=10;
		
		
		
//		Q) index인덱스가 2인 원소를 출력하시오.
	//	System.out.println(a[2]);
//		System.out.println(5/0);
		
//		자바의 모든 오류를 클래스로 만들어 놓음
		
		System.out.println(a[2]+a[1]);
		
//		배열은 동일한 여러개의 데이터를 담는, 묶는(★) 바구니
		
		
		float f1=34.56f;
		float f2=31.56f;
		float f3=37.56f;
		
		float[] f4 =new float[3];
		f4[0]=f1;
		f4[1]=f2;
		f4[2]=f3;
		
//	먼저 일일이 하나씩abcd.. 만듦
//		---> 저장할 공간A을 만듦
//		--->그 다음 A에 abcd...를 넣어줌
		
		System.out.println(f4.length);
		System.out.println(f4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
