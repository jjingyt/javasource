import java.util.Scanner;

public class BimanCheckMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("�񸸵� �˻�-----");

		System.out.print("�̸� : ");
		String name = k.next();

		System.out.print("Ű : ");
		double height = k.nextDouble();

		System.out.print("������ : ");
		double weight = k.nextDouble();

		System.out.println("-----");
		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight / stdWeight) * 100;
		String result = (bimando > 120) ? "��" : "����";
		
		System.out.printf("ǥ��ü�� : %.2fkg\n", stdWeight);
		System.out.printf("�񸸵� : %.2fkg\n", bimando);
		System.out.printf("%s���� %s\n", name, result);

		System.out.println("��������� ���� �Ŀ�");
		String t = k.next();
	}
}


