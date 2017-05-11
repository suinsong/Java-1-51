
public class J27누적하기 {

	public static void main(String[] args) {
		// 2. 누적하는 방법

		// 1~10까지 총합을 구하여 출력하시오

//		int Sum = 0;
//		for (int i = 1; i < 11; i++) {

//			Sum += i;

//		}
//		System.out.println(Sum);

//	}

	// 1~10까지 수 중 짝수 와 홀수의 수 총합 구하기

	int even = 0;
	int odd = 0;
		
		for(int i=1; i<=10;i++){
		if(even%2==0){
			even+=i;
		}else{odd+=i;
				
			
		}}
		
		
		System.out.println(even);
		System.out.println(odd);
		}

		
		
		
		
}