package afterschool;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		//int Ÿ���� 5�� �����ϴ� �迭 ����
		int arr[]=new int[5];
		
		//�迭�� �ʱ�ȭ�� ���� ����ڷκ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���");
		
//		System.out.print("ù��° ���� �Է� ");
//		arr[0] = sc.nextInt();
//		
//		
//		System.out.print("�ι�° ���� �Է� ");
//		arr[1] = sc.nextInt();
//		
//		
//		System.out.print("�ټ���° ���� �Է� ");
//		arr[4] = sc.nextInt();
		//int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"��° ���� �Է� ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
			
		}		
		
		System.out.println();
		
		//�Է¹��� �� ���
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}	
		
		System.out.printf("��ü �� : %d, ��� : %.1f",sum,(double)sum/arr.length);
		
	}
}













