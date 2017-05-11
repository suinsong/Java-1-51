
public class J04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//모든 문자는 숫자로 되어있음 
		//그러나 유니코드에 있을뿐...
		
		
		int han='박';
		
		System.out.println(han); //'박'이 숫자로 48149
		System.out.println((char)48149);//그럼 '박'으로 결과값나옴
		
		
//		int a='안녕키키' 는 안 됨 왜냐면 단일문자만 가능하니깐~~
		
		
		
		//▶boolean
//		자료는 연산 불가능
		
//		boolean t=true;  0이외의 값
//		boolean f=false; 0임
		
//		true--->false 하고 싶으면 앞에 !만 붙이면 됨
		System.out.println(!true);
		
		System.out.println(!false);
		
		boolean x=true && false; //&&는 and 전부 참이여야 true
		System.out.println(x);
		
		
		boolean y=true|| false; //||는 or 둘 중 하나만 참이여도 true
		System.out.println(y);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
