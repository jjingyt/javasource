import java.util.Scanner;

// ���Կ����� 
//		= 
//			���׿� �ִ°� ���׿� �־��
//	 		��� ������ �� ���� �ʰ� �ߵ�

// ���������
//		+
//			String + ? => �ٿ��� String����
//		-
//		*
//		/
//			int / int => ������ int��
//			�� �߿� �ϳ��� �Ǽ����̾�� => ������ �Ǽ�������
//		%	���� ������

// ������������(���������+���Կ�����)
//		+=
//		-=
//		*=
//		/=
//		%=

// ����������
//		++
//		--
public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int xx = k.nextInt();
		System.out.print("y : ");
		int yy = k.nextInt();
		System.out.println("-----");
		System.out.printf("x�� %d, y�� %d\n", xx, yy);

		String laugh = "��";
		
		int a = xx + yy;
		String aa = xx + laugh;
		
		int b = xx-yy;
		int c = xx * yy;
		
		int d = xx / yy;
		double dd = xx / yy;
		double ddd = xx / (double) yy;
		
		int e = xx % yy;
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println("���� " + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ddd);
		System.out.println(e);
		System.out.println("-----");
	
		// xx = xx + 5;
		xx += 5;
		System.out.println(xx);
		
		// yy = yy - 3;
		yy -= 3;
		System.out.println(yy);
		
		xx *= 2;
		System.out.println(xx);
		
		yy /= 2;
		System.out.println(yy);
		
		xx %= 3;
		System.out.println(xx);
		System.out.println("-----");
		// xx = xx + 1;
		// xx += 1;
		xx++;
		System.out.println(xx);
	}
}










