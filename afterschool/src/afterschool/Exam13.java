package afterschool;

public class Exam13 {
	public static void main(String[] args) {
		int arr[][]=new int[3][2];
		
		System.out.println("���� ���� "+arr.length);
		System.out.println("���� ���� "+arr[0].length);	
		
		
		for(int i=0;i<arr.length;i++) { //���� ����
			for(int j=0;j<arr[i].length;j++) { //���� ����
				arr[i][j]=j+1;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) { //���� ����
			for(int j=0;j<arr[i].length;j++) { //���� ����
				System.out.printf("%2d",arr[i][j]);
			}
			System.out.println();
		}

	}
}










