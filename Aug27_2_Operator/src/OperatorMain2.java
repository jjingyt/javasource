import java.util.Scanner;

// ��������
//		>		>=		==		!=			<=		<
//		�ʰ�	�̻�	����	�ٸ���		����	�̸�

// �����տ�����
//		&& &		|| |			!
//		��/and		�ų�/or		�ݴ�/not

public class OperatorMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("Ű : ");
		double height = k.nextDouble();
		System.out.print("���� : ");
		int age = k.nextInt();

		System.out.println("-----");
		System.out.printf("Ű %.1fcm, ���� %d��\n", height, age);

		// Ű�� 150 �ѳ�
		boolean a = (height > 150);
		System.out.println(a);

		// ���̰� 10�� ����
		boolean b = (age <= 10);
		System.out.println(b);

		// ���̰� 5�� �̻��̰�, Ű�� 200cm �̻��ΰ�
		boolean c = (height >= 200) && (age >= 5);
		//boolean c = (age >= 5) && (height >= 200);
		System.out.println(c);

		// Ű�� 200cm�̻��̰ų�, ���̰� 5�� �̻��ΰ�
		boolean d = (age >= 5) || (height >= 200);
		//boolean d = (height >= 200) || (age >= 5);
		System.out.println(d);

		// d�� true�� e�� false
		// d�� false�� e�� true
		boolean e = !d;
		System.out.println(e);
	}
}
