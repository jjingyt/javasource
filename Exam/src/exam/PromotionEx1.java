package exam;

public class PromotionEx1 {
	public static void main(String[] args) {
		// 변수 선언
		// 정수타입 => byte(1byte) < short(2byte) < int(4byte) < long(8byte)
		// 실수타입 => float(4byte) < double(8byte)
		
		byte byteValue = 10;
		
		// 자동 형변환(Promotion) 
		int intValue = byteValue;
		System.out.println(intValue);
		
		intValue = 500;
		long longValue=intValue;
		
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2; // 'A'+1
		
		System.out.println(charValue3); // 66
		
		// 강제 형변환(casting)
		System.out.println((char)charValue3); //B

	}
}




