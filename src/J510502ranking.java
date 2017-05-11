
public class J510502ranking {

	public static void main(String[] args) {

		int[] jum = { 80, 60, 90, 50, 70, 49 };
		// ★★석차 매기기

		int[] rank = new int[jum.length];

		
		for (int i = 0; i < jum.length; i++) {
			int r = 1; // 석차 저장 변수---->★☆ 1등으로 가정
			for (int j = 0; j < jum.length; j++) {
				if (jum[i] < jum[j]) {
					r += 1;
				}
			}
			rank[i] = r;
		}

		System.out.println("점수\t석차");
		System.out.println("===========");
		for (int i = 0; i < jum.length; i++) {
			System.out.println(jum[i] + "\t" + rank[i]);

		}

	}

}
