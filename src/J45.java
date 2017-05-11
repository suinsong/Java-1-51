
public class J45 {

	public static void main(String[] args) {
		// Char¹è¿­

		char[] a = { 'C', 'H', 'R', 'O', 'M', 'E' };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (a[i] > a[j]) {
					char tmp = a[i];
					a[i] = a[j];
					a[j] = (char) tmp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print((char) a[i] + "\t");
		}

		// for (int i = 0; i < a.length-1; i++) {
		// for (int j = i+1; j < 6; j++) {
		// if(a[i]>a[j]){
		// int tmp=a[i];
		// a[i]=i[j];
		// i[j]=tmp;
		// }
		// }

	}

}
