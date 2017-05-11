
public class J02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		a=100000000;
		b=20;
		
		int c=a+b;
				System.out.println(c);
		
		//long은 컴터가 자꾸 int(정수)로 인식함 그래서 큰 수 만들고 싶을땐
		// 뒤에다가 L표시 해줘야 큰 숫자로 인식함
		long x,y;
		x=1000000000000L;
		y=200;
		
		
		//float는 원래 더블(8바이트)로 인식함 
		//그래서 4바이트일경우 뒤에 F를 붙여줘야 4바이트 float로 인식함
		float f1,f2;
		f1=34.666f;
		System.out.println(f1);
		
		
		
		//실수와 정수의 연관관계
		//실수인 값을 정수로 바꾸는 법
		float x1=35.7f;
		int x2=(int)x1;
		
		
		//자료형을 변화시키는 것(형변화)= 케스팅
		//캐스팅 시 변화를 시키고 자료를 잘리는 것이기 때문에 조심해야함, 데이터 손실때문에
		//다운 or 축소캐스팅: 자료를 잘라버리는 것 
		
		
		
		System.out.println(x2);
		
		
		//정수를 float로 바꿀때는 자동으로 됨=자동형변화= upcasting
		//
		int y1=37;
		float y2=y1;
		
		System.out.println(y2);
		
		
		
		
		
		
		
		
	}

}
