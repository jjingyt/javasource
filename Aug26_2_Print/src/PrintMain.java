// ���� 1.8.0-302
// 1 : major
// 8.0-302 : minor
//	���ڸ��� �ٲ���� ����
//	major������ �ٲ� : �ٸ� ���α׷�

// �ܿ��� ���ñ� -> �ϵ� �۾��ش뼭 �ܿ��� ���Ͻø�

public class PrintMain {
	// ��� �ڵ�� �� ������

	public static void main(String[] args) {
		// ����� ���͸� ����

		// �ܼ�â�� ���
		System.out.print("������ �������� ��� �����ٵ�");
		// �ܼ�â�� ����ϰ� ���� �� �ٲ�
		System.out.println("�� ã�ƺ����� ���뾾");
		// ������ �����ϸ鼭 �ܼ�â�� ���
		System.out.printf("%.1f", 45.124564563);
		System.out.println();
		///////////////////////////
		// Ư������
		//		\n - new line(�ٸ� �ٲ�)
		//		\r - carriage return(Ŀ�� �Ǿ�����)
		//		\r\n - �ϼ��� �ٹٲ�
		//			\n�� �־ �˾Ƽ� �ٹٲ��� �ϼ��Ǵ� ���α׷��� ����
		//		\t - tab
		//		\\ - \
		//		\" - "
		System.out.println("����ö 3ȣ��"); // �п��ö� �� Ÿ�� �Դ��� ���
		System.out.println("\\2000"); // ����� �� \2000
		System.out.println("��\n��");
		System.out.println("�� :\t�д�");
		System.out.println("���� :\t����");
		System.out.println("\""); // "
	}
}



