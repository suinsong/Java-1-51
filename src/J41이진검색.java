
public class J41이진검색 {

	public static void main(String[] args) {
		// 5. 검색(데이터가 사전에 오름차순 정렬되어 있다)
		//        데이터의 중앙에 있는 중앙값과 비교하는 방법=best!!!임
//		           =이진검색
		
		//        0  1  2  3  4  5  6  7  8  9번
		int[] a={10,20,30,40,50,60,70,80,90,100};
		int sd=70;
		int index=-1;
		
		//이것은 순차검색
		for (int i = 0; i < a.length; i++) {
			if(sd==a[i]){
				System.out.println(i);
				break;
			}
		}
	
	
	
	
	}
	

}
