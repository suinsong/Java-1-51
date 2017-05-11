
public class J14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이항연산자 - ①산술연산자(+, -, *, /(몫), %(나머지))
	
		int a=10;
//		System.out.println(a/3);
		System.out.println(a%3);

		
		
		
		// ②관계 연산자(<, >, <=, >=, ==, !=): 최종 결과값이 true or false로 나타남
		
		int x=20;
		System.out.println(x/3>2);
		System.out.println(x/10==2);
		System.out.println(x/10!=2);
		
		
		
		// ③논리(진리) 연산자(&&(and) , || ,!(항이 하나만 있어도 됨 단항연산자임))
		//Q) 어떤 문자가 대문자인지 알아보기
		char c='A';
		System.out.println(c>='A' && c<='Z');
		System.out.println(c>='A' || c<='Z');
		System.out.println(!(c>='A'));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
