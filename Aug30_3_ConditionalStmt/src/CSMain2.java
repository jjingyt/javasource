import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("�߰���� : ");
		int mid = k.nextInt();
		System.out.print("�⸻��� : ");
		int _final = k.nextInt();

		System.out.println("-----");

		double avg = (mid + _final) / 2.0;
		System.out.printf("��� : %.1f\n", avg);

		// System.out.println((avg >= 90) ? "��" : "��!");
		// ����� 90�� �̻��̸� ����� ���, �ƴϸ� ��!��� ���
		// ��!�� ������, 80�� �̻��̸� �������� ���ض�	
		
		// if (A) {
		//		A ������������
		// } else if (B) {
		//		A�� ��, B�� ������������
		// } else if (C) {
		//		A�� ��, B�� ��, C�� ������������
		// } ...
		// } else {
		// 		���� �ϳ��� �´°� ������
		// }

		if (avg >= 90) {
			System.out.println("��");
		} else if (avg >= 80) {
			System.out.println("��");
		} else if (avg >= 70) {
			System.out.println("��");
		} else if (avg >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

		if (avg >= 90) {
			System.out.println("��");
		} else {
			if (avg >= 80) {
				System.out.println("��");
			} else {
				if (avg >= 70) {
					System.out.println("��");
				}
			}
		}

	}
}
