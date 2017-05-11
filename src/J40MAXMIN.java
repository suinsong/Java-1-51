
public class J40MAXMIN {

	public static void main(String[] args) {

		// 4. 최대값, 최소값 구하기

		int[] a = { 4, 3, 1, 2, 5 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
			if (min > a[i])
				min = a[i];
		}
		System.out.println(max);
		System.out.println(min);

	}

}
