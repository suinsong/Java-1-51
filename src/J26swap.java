import bit.data.MovieVO;

public class J26swap {

	public static void main(String[] args) {
		// 1. �޸� ��ȯ ���(swap)
		int x=10;
		int y=20;
		int temp=x;
		x=y;
		y=temp;
		
		
//		x�� y�� ���� ���� �ٲ㼭 ����Ͻÿ�
		System.out.print(x);
		System.out.print(y);
		
		System.out.println();
		
		
		MovieVO m1=new MovieVO();
		m1.title="Ÿ��Ÿ��";
		
		MovieVO m2=new MovieVO();
		m2.title="������ ����";
		
		
		MovieVO m3=m1;
		m1=m2;
		m2=m3;
		//m1�� m2�� ���� ����ȯ�Ͽ� ����Ͻÿ�
		
		System.out.println(m1.title);
		System.out.println(m2.title);
		
		
			
				
		
		
		
		
		
		

	}

}
