
public class J16대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		대입연산자: L-Value = R-Value ;
//		        R를 L에다가 넣는다
//			
		
		/*L-Value = R-Value ;
		 *   변수    = 번수;   a=b;
		 *   변수    = 수식;   a=b+c;
 		 *   변수    = 값;    a=20;
		 *   변수   = 메소드호출문  a=sum(10,20); 
		 *    
		 */
		
		
//		복합대입연산자: 산술연산자+대입연산자를 결합(+=, -=, *=, /=, %=)
		
		int a=10;
		a=a+20; //a+=20
		System.out.println(a);
		
//		Q) x에 1을 증기시키는 모든 방법을 쓰시오.
		int x=1;
		++a;
		x++;
		x=x+1;
		x+=1;
			
		System.out.println(x);
		
		
		}
			
				
		
		/*
		 * 수식표기법(연산자 위치에 따른 표기법)-->계산하는 방법(stack:스택LIFO)
		 * ⓐ inFix 중위 : a+b  -->인간중심
		 * ⓑ preFix 전위: +ab  -->컴퓨터중심
		 * ⓒ postFix 후위: ab+
		 *  
		 */
		
		

	}


