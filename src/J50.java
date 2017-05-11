
public class J50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 108, 32, 12, 56, 43, 67, 99, 81, 20, 78 };
		int sd = 43;
		// Q 43은 몇 번째 인덱스에 존재하는지 검색하여 출력하시오.(단, 이진검색을 이용)
		// 힌트: 사전에 데이터를 오름차순 정렬(선택정렬) 후 이진검색하기

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println();

		// 이진검색하기
		int low = 0;
		int high = a.length - 1;
		int middle = 0;
		int index = -1;
		while (low <= high) {
			middle = (low + high) / 2;
			if (sd == a[middle]) {
				index = middle;
				break;
			} else if (sd > a[middle]) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		if (index != -1) {
			System.out.println("37의 index는 [" + index + "]번째 자리에 있습니다.");
		} else {
			System.out.println("실패");
		}

	}
}