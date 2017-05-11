import bit.data.MovieVO;

public class J26swap {

	public static void main(String[] args) {
		// 1. 메모리 교환 방법(swap)
		int x=10;
		int y=20;
		int temp=x;
		x=y;
		y=temp;
		
		
//		x와 y의 값을 서로 바꿔서 출력하시오
		System.out.print(x);
		System.out.print(y);
		
		System.out.println();
		
		
		MovieVO m1=new MovieVO();
		m1.title="타이타닉";
		
		MovieVO m2=new MovieVO();
		m2.title="반지의 제왕";
		
		
		MovieVO m3=m1;
		m1=m2;
		m2=m3;
		//m1과 m2의 갑승 ㄹ교환하여 출력하시오
		
		System.out.println(m1.title);
		System.out.println(m2.title);
		
		
			
				
		
		
		
		
		
		

	}

}
