// ������ �Ǵ��ϱ⿡ xx�� �ʿ��ϴٸ� �� �� ���°�
// CPU - ������ġ => ������ ���� - x

// RAM - ������ġ => ������ ���� ����(������ ���� ���� ��)
//		��������, �ӽ�����(�ڵ�����(������ϰų�...))
//			static - ????
//			stack - ���α׷� ����� �ڵ� �ݳ� -> ���� �ݳ� �Ұ���
//			heap - �ڵ� �ݳ����� ���� -> ������ �������� �ݳ�ó���ؾ�
//				Java���� GarbageCollection�����
//					heap���� �ڵ����� �ý���

// 16GB - 15.9GB������
//		�� ������ �� ���� �ݳ��ؾ�

// SSD/HDD - ������ġ => ������ ���� ����
//		��������, �������� -> ���� -> DB
// GPU - �׷��� ǥ���ϴµ� �ʿ���(CPU+RAM+HDD) - x

// ����(Variable)
//		������ ��� �׸�
//		���α׷� ���� �߿� ������� �����͸� �ӽ÷� ������ ��

// ����
//		�׸�����  			�׸��̸�;
//		�����������		�׸��̸�;
//		�ڷ���(data type)	������;

// �ڷ���
//		�⺻��
//			���� - byte, short, int-�ַ�, long
//			�Ǽ� - float, double-�ַ�
//			�ѱ��� - char
//			�� - boolean
//			���� - void
//		������
//			�������� - String
//			��Ÿ���...

// ������
//		�������
//			���ڷ� ���ۺҰ�
//			Ư������ �Ұ�(_$�� ������)
//			�ڹٹ��� �Ұ�

//			�ҹ��ڷ� ����
//			����+���� ��������
//			���� �˱� ���� 
//				-> �ٵ� ����� ������
//					korScore : ��Ÿü
//					kor_score : ��ü

// = ����x
//   �����ʿ� �ִ°� ���ʿ� �־��

// �⺻�ڷ���
//		�ƹ� ó���� ���ϰ� ���� ������ ���� �ν�

// ����ȯ(casting)
//		(�ڷ���) ��
public class VariableMain {
	public static void main(String[] args) {
		// ���������� 80���ΰŸ� �ӽ÷� ������ �� �ְ�
		int kor; // ���� �����
		kor = 80; // ������ �� ����
		System.out.println("korScore");
		System.out.println(kor); // kor������ ����ִ� �� ���
		System.out.println(kor);
		
		// ����� 24.38���ΰŸ� �ӽ÷� ������ �� �ְ�
		float temp;
		temp = (float) 24.38;
		System.out.println(temp);
		
		// ����� ���ڸ� �ӽ÷� ������ �� �ְ�
		char laugh;
		laugh = '��';
		System.out.println(laugh);
		
		// ������� ���ڸ� �ӽ÷� ������ �� �ְ�
		String laugh2;
		laugh2 = "����";
		System.out.println(laugh2);
		
		// ����°��� �ӽ÷� ������ �� �ְ�
		boolean isHungry;
		isHungry = false;
		System.out.println(isHungry);

		// Java����	���������� ����� ���� �ȳ����� ����� �Ұ���
//		int age; 
//		System.out.println(age);
		
		int age = 35;
		System.out.println(age);
		
	}
}








