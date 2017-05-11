
public class J20forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for문은 얼마정도 반복해야하는지 알때
//		while문은 얼마정도 반복해야하는지 모를때
		
		
		
//		Q) 1~10까지의 수 중 짝수만 출력하시오.
		
		for (int i = 1; i <=10; i++) {
			
			if (i%2==0) {
				System.out.println(i);
				}
				}
		
		System.out.println();
		System.out.println();
		
		
//	 	Q) 1~30까지 수 중 3의 배수이고 5의 배수인 수만 출력하시오
		for (int i = 1; i <=30; i++) {
			if (i%3==0 && i%5==0) {
			System.out.println(i);	
			} 
		}
		
		
		
		//Q) while문을 이용해 1~50까지 5의 배수만 출력
		
		
		int x=1;
	
		while (x<=50) {
			if (x%5==0) {
				System.out.println(x);
			} 
		x++;	// ★☆증감식은 밑에다가 써줘야 함
		}
		
		System.out.println();
		System.out.println();
		
		
//		문자 A~Z까지 출력하시오
		char a='A';
		do {System.out.print(a);
			a++;
		} while (a<='Z');
		
		
		
		
/* while 반복문	
 * -형식 (선조건 후처리)
 * 	ⓐ 초기값 (미리 선언)
 * 		while(ⓑ 조건){
 *  		 조건이 참일 경우에 실행
 *  	            ⓒ 증감식
 *				 }
 *
 *
 * -형식(선처리 후조건)
 *   do{
 *   
 *   
 *   } while(조건);
 *   
 *   	
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



