
public class J38 {

	public static void main(String[] args) {

		float x = 35.93f;
		float y = 36.52f;

		J38 obj = new J38();//새로 개체를 만들고, 쓸때는 .찍고 호출하면 됨
		float v =  obj.floatHap(x, y);

		// float v= floatHap(x,y);

		System.out.println(v);
	}

	// Q실수 두개를 매개 변수로 받아서 총합을 구하여 리턴하는 메서드를 정의(floatHap)

	public float floatHap(float a, float b) {
		float c = a + b;
		return c;
	}

}
