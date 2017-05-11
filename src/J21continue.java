
public class J21continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i <=10; i++) {
			if (i%2==0) continue; //컨티뉴를 만나서 짝수를 그냥 조건식으로 올라가버림 
//						                        아래 문장은 실행하지 않음
			System.out.println(i);
		}
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <=10; i++) {
			if (i%2!=0) continue; //홀수는 다시 올라감 --->짝수만 나옴
			System.out.println(i);
		}
		
		
		System.out.println();
		System.out.println();
		
		
		for (int i = 1; i <= 100; i++) {
			if (i==50) break;			
			
			System.out.println(i);
		}
		
		
		
		/* 제어문:break; continue
		 * 
		 * 
		 * ◆ break: 반복문의 흐름을 제어
		 * 
		 * 
		 * ◆continue:
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
