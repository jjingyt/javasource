package dept;

import java.util.List;
import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		boolean run  = true;
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		while(run) {
			System.out.println("******************************");
			System.out.println("1.��ü�μ� ��ȸ");
			System.out.println("2.Ư�� �μ� ��ȸ");
			System.out.println("3.�μ� �߰�");
			System.out.println("4.�μ� ����");
			System.out.println("5.�μ� ����");
			System.out.println("6.����");
			System.out.println("******************************");
			
		
		System.out.print("����>>> ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			List<DeptDTO> list= dao.getRows();
			System.out.println("�μ���ȣ\t�μ���\t����");
			for(DeptDTO dto : list) {
				System.out.println(dto.getDeptNo() + "\t");
				System.out.println(dto.getDname() + "\t");
				System.out.println(dto.getLoc() + "\t");
			}
			System.out.println();
			break;
		case 2:
			
			break;
		case 3:
	
			break;
		case 4:
	
			break;
		case 5:
			
			break;
		case 6:
			run = false;
			break;

		default:
			System.out.println("��ȣ�� Ȯ���� �ּ���");
			break;
		}
	}
	}
}
