
public class J46빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 빈도수 구하기
		int[] a = { 5, 1, 3, 5, 1, 1, 2, 3, 3, 4 };
		int a1, a2, a3, a4, a5;
		a1=a2=a3=a4=a5=0;
		
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case 1:
				a1++;
				break;
				
			case 2:
				a2++;
				break;
			
			case 3:
				a3++;
				break;
			
			case 4:
				a4++;
				break;
			
			case 5:
				a5++;
				break;
			}
		}

		
		System.out.println(1+"의 개수는:"+a1);
		System.out.println(2+"의 개수는:"+a2);
		System.out.println(3+"의 개수는:"+a3);
		System.out.println(4+"의 개수는:"+a4);
		System.out.println(5+"의 개수는:"+a5);
		
	}

}
