
public class J25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < (4 - i)) {
					System.out.print("¤±");
				} else {
					System.out.print("¡Ú");
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i) {
					System.out.print("¤±");
				} else {
					System.out.print("¡Ú");
				}
			}
			System.out.println();
		}

	}

}