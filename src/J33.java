
public class J33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		메서드 호출시---> 매개변수전달기법
//	★☆ call by value(값), call by reference(번지)
	
	int a=10;
	int b=20;
	int v=calc(a,b);
	System.out.println(v);
	
	
	float x = 34.5f;
	float y = 56.7f;
	float f = calc(x,y);
	System.out.println(f);
	
	}

	private static float calc(float x, float y) {
		// TODO Auto-generated method stub
		return (x+y);
	}
                      //이렇게 이름이 같은 메소드를 쓸 수 있음=메소드의 overloading(오버로딩)=중복정의
	                  //어차피 시그니처가 달라서 이렇게 써도 됨
						//속도와 무관해서 막 써도 됨
						//☆★정적바인딩(컴파일시점에서 호출될 메서드가 결정되는 바인딩(연결))
	             		//           이미 연결 다 해서 실행할때 찾지 않음
	                    //★☆동적바인딩(실행시점에서 호출될 메서드가 결정되는 바인딩(연결))=method override
	                    //           속도가 느려지는 원인이 됨
	
	
	private static int calc(int a, int b) {
	//자기 클래스 안에서는 private 가능쓰
		return (a+b);
	}

	
	
	}
	
	
	

