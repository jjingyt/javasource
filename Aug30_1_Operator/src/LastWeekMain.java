import java.util.Scanner;

// �����տ�����
//	&& &		|| |		!			^
//	��/and		�ų�/or		�ݴ�/not	xor

// XOR(eXclusive OR) - ��Ÿ�� or
//
//	2��¥�� : �ߴܵǴ� ���� - v
//		&& - �� Ȯ�� �����Ÿ� ������ ��ġ
//		|| - �� Ȯ�� �����Ÿ� ������ ��ġ
//	1��¥�� : ������ ���� ����

public class LastWeekMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("���� : ");
		int x = k.nextInt();
		System.out.print("���� : ");
		double y = k.nextDouble();
		System.out.print("���� : ");
		double z = k.nextDouble();
		System.out.print("���� : ");
		double w = k.nextDouble();

		System.out.println("-----");

		double v = x * y * z;
		System.out.printf("���� : %.1f��\n", v);
		System.out.printf("���� : %.1fkg\n", w);
		
		// ���� : ��
		// ���� : kg
		
		// ���ǰ� 10�̻��̰�, ���԰� 1000�̻��̸�
		boolean a = (w >= 1000) && (v >= 10) ;
		//boolean a = (v >= 10) && (w >= 1000);
		System.out.println(a);
		
		// o o -> o
		// o x -> o
		// x o -> o
		// x x -> x
		// ���ǰ� 10�̸��̰ų�, ���԰� 1000�̸��̸�
		boolean b = (w < 1000) || (v < 10) ;
		//boolean b = (v < 10) || (w < 1000);
		System.out.println(b);
		
		// o o -> x
		// o x -> o
		// x o -> o
		// x x -> x
		// ���ǰ� 10�̸��̵���, ���԰� 1000�̸��̵��� �ϳ���
		boolean d = (v < 10) ^ (w < 1000);
		System.out.println(d);
		
		// ���԰� 20�̻��̰�, ���԰� 30�̻��̸�
		boolean c = (w >= 30); 
		//boolean c = (w >= 20) && (w >= 30); 
		System.out.println(c);
		
		
	}
}


