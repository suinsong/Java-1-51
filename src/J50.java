
public class J50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 108, 32, 12, 56, 43, 67, 99, 81, 20, 78 };
		int sd = 43;
		// Q 43�� �� ��° �ε����� �����ϴ��� �˻��Ͽ� ����Ͻÿ�.(��, �����˻��� �̿�)
		// ��Ʈ: ������ �����͸� �������� ����(��������) �� �����˻��ϱ�

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

		// �����˻��ϱ�
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
			System.out.println("37�� index�� [" + index + "]��° �ڸ��� �ֽ��ϴ�.");
		} else {
			System.out.println("����");
		}

	}
}