import java.util.Scanner;

public class ConsoleInputMain {
	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ��ؼ� k�� ������
		Scanner k = new Scanner(System.in);

		System.out.print("�Ĵ� �̸� : ");
		String name = k.next(); // �ֿܼ� �Է��� ������ name�� ����

		System.out.print("�Ĵ� ũ�� : ");
		double size = k.nextDouble();
		
		System.out.print("���̺� �� : ");
		int table = k.nextInt();
		
		System.out.print("�������ΰ� : ");
		boolean isOpen = k.nextBoolean();
		
		k.close();
		
		System.out.println("********");
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(isOpen);
		System.out.println("********");
		
	}
}
