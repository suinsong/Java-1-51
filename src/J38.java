
public class J38 {

	public static void main(String[] args) {

		float x = 35.93f;
		float y = 36.52f;

		J38 obj = new J38();//���� ��ü�� �����, ������ .��� ȣ���ϸ� ��
		float v =  obj.floatHap(x, y);

		// float v= floatHap(x,y);

		System.out.println(v);
	}

	// Q�Ǽ� �ΰ��� �Ű� ������ �޾Ƽ� ������ ���Ͽ� �����ϴ� �޼��带 ����(floatHap)

	public float floatHap(float a, float b) {
		float c = a + b;
		return c;
	}

}
