
public class J37 {
	//      한정자 : 프로그램이 시작하기 전에 딱 한 번 고정된 위치에 메모리가 할당되게 하는 것
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x=35.93f;
		float y=36.52f;
		
		float v= floatHap(x,y);
		
		System.out.println(v);
	}

	//Q실수 두개를 매개 변수로 받아서 총합을 구하여 리턴하는 메서드를 정의(floatHap)
	
	public static float floatHap( float a, float b){
		float c= a+b;
		return c;
	}
	}
	

