package afterschool;

public class Exam11 {
	public static void main(String[] args) {
		// �迭 => ��(new)
		
		// �迭 ����� ����, �ʱ�ȭ
		int arr[]= {100,25,73,54,65,67,79,81,90,10};
		
		// ���
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}
		System.out.println();
		
		
		for(int j:arr) {
			System.out.print(j+" ");			
		}
		
	}
}















