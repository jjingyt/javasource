package string;

// String => Immutable

public class Replace {
	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		
		// �ڹ� => Java
		//str1 = str1.replace("�ڹ�", "java");
		
		str1 = str1.replaceFirst("�ڹ�", "Java");
		
		System.out.println(str1);

	}
}
