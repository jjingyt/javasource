package classTest;

public class Triangle3 {
	//�ﰢ�� ���� ���ϱ�	
	//�Ӽ� : �غ�, ����
	private int baseLine;
	private int height;
	
	
	//�����ڴ� �⺻ ������
	//Triangle2(){}
	
	// Triangle2() is undefined
	
	Triangle3(int baseLine,int height){
		this.baseLine = baseLine;
		this.height = height;
	}	
	
	//���(�޼ҵ�) : �غ� * ���� / 2 ��� ����
	int getArea() {
		return baseLine * height / 2;
	}
}