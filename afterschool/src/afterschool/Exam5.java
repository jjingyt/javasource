package afterschool;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ������ �Է��ϰ� �������� 0�� �Է��ϼ���
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		int num;
		int count = 0;
		double sum = 0;
		
		//��������� int���� �Է¹ް�, num�̶�� ������ ���,
		//num�� 0�� �ƴϾ�� �Ѵ�.
		while((num = sc.nextInt())!=0) {
			sum += num;
			count++;
		}
		// 10 30 -20 40 0
		// �Է��� ���� ������ 4���̸� ����� 15.0�Դϴ�.
		//System.out.printf("�Է��� ���� ������ %d���̸� ����� %.1f�Դϴ�.",count,(double)sum/count);
		System.out.printf("�Է��� ���� ������ %d���̸� ����� %.1f�Դϴ�.",count,sum/count);
		//System.out.print("�Է��� ���� ������ "+count+"���̸� ����� "+sum/count+" �Դϴ�.");
	}
}










