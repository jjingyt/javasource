package collection;

// Set => hashCode() ���� Ȯ�� => ���ٸ� ���� ��ü => �������� ����
//                             => ���� : equals �˻� �� �װ͵� ���ٸ�
public class HashCodeString {
	public static void main(String[] args) {
		String obj1 = "�ȳ��ϼ���";
		String obj2 = new String("�ȳ��ϼ���");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}
}
