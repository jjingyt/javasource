package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ���̺� ���� �Ȱ��� �ۼ�


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class DeptDTO {
	private int DeptNo;
	private String Dname;
	private String loc;
	
	//������,getter/setter,tostring
}
