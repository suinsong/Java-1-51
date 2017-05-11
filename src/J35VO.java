import bit.data.MovieVO;

public class J35VO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieVO vo=new MovieVO();
		vo.title="ÇØ¸®Æ÷ÅÍ";
		vo.major="¿¥¸¶¿Ó½¼";
		vo.price=1000;
		vo.step=10;
		
		ptrMov(vo);//call by reference(¹øÁö)
		
	}

	public static void ptrMov (MovieVO m){
		System.out.println(m.title+"  "+m.major+"  "+m.price+"  "+m.step);
		
	}
	
	
	
}
