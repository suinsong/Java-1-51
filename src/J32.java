
public class J32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int start=50;
//		int end=150;					//매서드의 시그니처
		int a=sum(50,150); //메서드 호출 조건--->(개수, 타입)이 같아야함!!!!!!
		System.out.println(a);
		
		
	}
//	매개변수로 2개의 정수를 받아서 두 수 사이의 총합을 구하여 리턴하는 메서드를 정의
	
	public static int sum(int s, int e){
		int hap=0;
		for (int i = s; i <=e; i++) {
			
			hap+=i;
		}return hap;
		
		
	}
	
	
}
