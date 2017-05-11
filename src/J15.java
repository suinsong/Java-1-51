
public class J15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		삼항연산자: ⓐ조건  ? ⓑ참일때 실행 : ⓒ거짓일때 실행
//		         ⓐ값이 참이면 ⓑ이 실행
//		         ⓐ값이 거짓이면 ⓒ이 실행
		 
		int a=5;
		char c=(a%2==0) ? 'T':'F';
		System.out.println(c);
		
		
//		Q) 어떤수 X의 값이 3의 배수이면서 5의 배수이면 Y,아니면 N
		int x=15;
		char y=(x%3==0 && x%5==0)? 'T':'F';
		System.out.println(y);
		
		
		
		int m=12;
		String n=(m%2==0)? "12는 짝수입니다":"12는 홀수입니다";
		System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
