
public class J03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자Char - 단일문자(영문<---/--->비영문)
//	                      1바이트             2바이트
//		문자표현'A' 2바이트
//		문자데이터는 컴퓨터 내부에서 수치로 저장됨
//		컴퓨터는 2진수 체계밖에 인식 못함 
//		☆아스키코드☆
//		A는 65... a는 97...32차이
//		0은 48 1은 49...
		
				
//		☆int(4바이트) a='A'(2바이트)가능함 그 대신 문자가 아닌 숫자 65로 들어감
		
		int a='A';
		System.out.println(a); //65 숫자로 나옴

		
		
		//☆char는 2바이트고 정수인int는 4바이트지만 자동으로 해주는듯
		
		char c='A'+1; //'A'는 65+1=66=B
		System.out.println(c);//B값이 나옴
		
		
		
		
		char lower='A'+32;
		System.out.println(lower);
		
		char upper='a'-32;
		System.out.println(upper);
				
		
		
		//'1'+'1'=2 만들게 하기
		//'1'이 49이니깐 0은 48
		
		int one='1';
		System.out.println(one);//'1'은 49
		
		
		//'1'은 49이고 '0'은 48 이니깐 1이고
		//'1'은 49이고 -48이니깐 1임 총 2가 나옴
		int v= ('1'-'0')+('1'-48); 
		System.out.println(v);
				
		
		
		

		
		
		
	}

}
