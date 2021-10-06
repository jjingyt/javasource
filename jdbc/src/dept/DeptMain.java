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
			System.out.println("1.전체부서 조회");
			System.out.println("2.특정 부서 조회");
			System.out.println("3.부서 추가");
			System.out.println("4.부서 수정");
			System.out.println("5.부서 삭제");
			System.out.println("6.종료");
			System.out.println("******************************");
			
		
		System.out.print("선택>>> ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			List<DeptDTO> list= dao.getRows();
			System.out.println("부서번호\t부서명\t지역");
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
			System.out.println("번호를 확인해 주세요");
			break;
		}
	}
	}
}
