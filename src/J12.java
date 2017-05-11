import bit.data.MovieVO;

public class J12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		MovieVO m1 =new MovieVO();   //★☆m1=인스턴스 변수
		m1.title="반지의 제왕";
		m1.major="아라곤";
		m1.price=10000;
		m1.step=12;
		
		
		MovieVO m2 =new MovieVO();
		m2.title="타이타닉";
		m2.major="잭";
		m2.price=10000;
		m2.step=10;
		
		System.out.print(m1.title+"\t"+m1.major+"\t"+m1.price+"\t"+m1.step);
		System.out.println();
		System.out.print(m2.title+"\t"+m2.major+"\t"+m2.price+"\t"+m2.step);
				
		
			
			
			
			
			
	}

}
