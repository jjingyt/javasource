package afterschool;

public class Exam8 {
	public static void main(String[] args) {
		// �迭 => ��(new)
		
		// �迭 ����
		int arr[];
		// ����
		arr = new int[10];
		
		// �ʱ�ȭ => 1 ~ 10 ���� ���� ����
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]+" ");
			arr[i] = i+1;
		}
		
		// ���
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}
		
		System.out.println(arr[10]);
	}
}















