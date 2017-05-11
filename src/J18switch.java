
public class J18switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 선택문(switch ~case) : 메뉴만들기
		 * break는 case마다 다 있어야 함
		 * 
		 * -형식
		 * switch(  값    ){
		 * case 값1:
		 * 
		 * break;
		 * case 값2:
		 * 
		 * break;
		 * case 값3:
		 * 
		 * break;
		 * default: 그 어느 case에도 맞는게 없으면 이것을 실행
		 * 
		 *  break; 디폴트의 브레이크는 있어도 되고 없어도 됨
		 *  
		 *  }
		 * 
		 * 
		 */
		
		
		
//		Q)a가 홀수인지 짝수인지 판단하기
		int a=8;
		int b=a%2;
		
		switch (b) {
		case 1:System.out.println("홀수");
			break;

		case 0: System.out.println("짝수");
		    break;}
		
		
//		Q)학점구하기
		
		int jum=82;
		if(jum>=0 && jum<=100){
		switch (jum/10) {
		case 10:
		
		case 9:
			System.out.println("A");
			break;
			
		case 8:
			System.out.println("B");
			break;
			
		case 7:
			System.out.println("C");
			break;
			
		default:
			System.out.println("D");
			break;
		
		} }
		
		else{System.out.println("잘못된 점수");
		
		}
		
		char menu='I';//Create - Read - Updata - Delect
		switch (menu) {
		case 'C':System.out.println("insert메서드로 이동하는 코드");
			
			break;

		case 'U':System.out.println("update메서드로 이동하는 코드..");
			
			break;
			
		case 'R':
			System.out.println("read 메서드로 이동하느 ㄴ코드");
		
			break;
			
			
		case 'D':
			System.out.println("delect메서드로 이동하는 코드..");
		
		
		default:
			System.out.println("잘못된 메뉴입니다");
			break;
		}
		
		
		
	
	
	
	
	
	}
		
		
		
		

		}
		
	
