
public class J17IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7;
		if (a%2==0) {System.out.println("짝수");}
		else{System.out.println("홀수");}
		
		int b=7;
		System.out.println((b%2==0) ? "짝수" : "홀수");
		
//		Q) 어떤 수가 3의 배수이면 5의 배수인지 판단하여 출력하시오
		int x=15;
//		System.out.println((x%3==0 && x%5==0);"3의 배수이면서 5의 배수임":"배수아님")
				
		if (x%3==0 && x%5==0) {System.out.println( x +"는 YES");
			} else {System.out.println(x +"는 NO");}
		
		
		
//		Q)어떤 문자가 소문자인지 판단하시오.(lower/upper)
//		char c='g';
//		int d='g';
		
//		if (d>97) {System.out.println("lower");
			
//		} else {System.out.println("upper");
//		}

		
		
//		☆★ 다중 if문
		
		char c='g';
		if (c>='A' && c<='Z') {
			System.out.println("UPPER");
		} else if(c>='a' && c<='z'){
			System.out.println("LOWER");
		}else{System.out.println("대문자도 소문자도 아님");}
		

//		Q)학점구하기 
//		90-100: A 학점
//		80-89: B 학점
//		70-79: C 학점
//		69점이하: D 학점
		
		int jum=865;
		if (jum>=90 && jum<=100 ) {
			System.out.println("A학점");}
		 else if(jum>=80 && jum<=89){
			System.out.println("B학점");}
			else if(jum>=70 && jum<=79){
				System.out.println("C학점");}
				else if(jum>=0 && jum<70){
				System.out.println("D학점");}
				else{System.out.println("점수는 0~100점 사이가 유요한 값입니다.");}
	
//		if if 여러번 = 중첩이프문
		int java=76;
		if (java>=0 && java<=100) {
			if (java>=90) {System.out.println(java + "A학점");
			} else if(java>=80 ) {System.out.println(java+"B학점");
			} else if(java>=70 )System.out.println(java+"C학점");
		    } else{System.out.println("유효하지 않은 점수입니다");}
		
		
		
	}

		

		

		/*int a=10;
		 * ⓐ조건문(if) '블럭이프문'이라고 함
		 * 		if(조건문a>10){
		 *				조건이 참일 경우만 실행...
		 * 					     }
		 *  거짓일 경우는 else씀{
		 *                       }
		 *
		 *{  이런 중괄호에 쌓은 부분을    } ====> 블럭, 로컬, 지역, scope, 범위 등등 이라고 함 
		 * 
		 * 
		 * 
		 * ⓑ선택문(switch~case)
		 * ⓒ반복문(for, while)
		 * ⓓ제어문(break, continue)
		 * 
		 * 배열
		 * 매서드 = 동작
		 */
		
		
}
	
	
