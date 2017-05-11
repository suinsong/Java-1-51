
public class J28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 카운트 방법 (1씩 누적)
		// Q)1~10까지의 수 중 홀수의 개수와 짝수의 개수=?

		int ecnt = 0; // 짝수의 개수
		int ocnt = 0; // 홀수의 개수

		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				ecnt++;

			} else {
				ocnt++;
			}
			i++;
		}

		System.out.println("ecnt=" + ecnt);
		System.out.println("ocnt=" + ocnt);

	}

}
