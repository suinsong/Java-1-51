
public class J33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�޼��� ȣ���---> �Ű��������ޱ��
//	�ڡ� call by value(��), call by reference(����)
	
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
                      //�̷��� �̸��� ���� �޼ҵ带 �� �� ����=�޼ҵ��� overloading(�����ε�)=�ߺ�����
	                  //������ �ñ״�ó�� �޶� �̷��� �ᵵ ��
						//�ӵ��� �����ؼ� �� �ᵵ ��
						//�١��������ε�(�����Ͻ������� ȣ��� �޼��尡 �����Ǵ� ���ε�(����))
	             		//           �̹� ���� �� �ؼ� �����Ҷ� ã�� ����
	                    //�ڡٵ������ε�(����������� ȣ��� �޼��尡 �����Ǵ� ���ε�(����))=method override
	                    //           �ӵ��� �������� ������ ��
	
	
	private static int calc(int a, int b) {
	//�ڱ� Ŭ���� �ȿ����� private ���ɾ�
		return (a+b);
	}

	
	
	}
	
	
	

