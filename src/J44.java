
public class J44 {

	public static void main(String[] args) {
		// 정렬 sorting :오름차순, 내림차순

		int[] a = { 4, 3, 1, 2, 5 };

		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];

					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
}