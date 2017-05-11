
public class J36메소드소문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = new char[5];
		c[0] = 'A';
		c[1] = 'P';
		c[2] = 'P';
		c[3] = 'L';
		c[4] = 'E';

	lowchar(c);
	
	}
//	
//	char c='A'+1; //'A'는 65+1=66=B
//	System.out.println(c);//B값이 나옴
	
	
//매개변수로 문자 여러개를 받아서 모든 문자르 ㄹ소문자로 벼경하여 출력하는 매서드를 정의(lowchar)
	
	
	public static void lowchar (char[] c){
		for (int i = 0; i < c.length; i++) {
			System.out.print((char)(c[i]+32));
			
			
		}
		
		
			
	}
	
	
	
}
