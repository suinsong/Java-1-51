
public class J30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 40;

		intHap(a, b);// method call 호출----> 파라메터전달(parameter passing)
		System.out.println("종료");
	
	}

	public static void intHap(int x, int y){
		int Sum=x+y;
		System.out.println(Sum);
			}


}// 종료

// 메서드 생성 장소
// [형식] 머리 +몸
// '리턴타입' 메서드 이름(){

// }
// ()안에 매개변수 리스트를 넣음 / 매개변수는 외부로부터 동작하게 하는 무언가를 받는 장소임
// 동작구현-> 일을 함-> 결과를 만들어냄-> ☆★돌려줌(return)

// 매개변수로 정수 2개를 받아서 총합을 구하여 출력하는 메소드를 정의하시오.
