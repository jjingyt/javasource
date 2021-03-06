package classTest;

public class GoodsStockEx2 {
	public static void main(String[] args) {

		
		//첫번째 상품 재고관리
		GoodsStock2 product1 = new GoodsStock2("p12345",30);
		
		//클래스 외부에서 속성을 직접 변경하는 것은 안됨
		//private => GoodsStock2.code is not visible
		//product1.code = "p12345";
		//product1.stockNum = 30;
		
		//상품판매 => 재고 감소
		//메소드 호출 => 리턴값이 있다면 리턴값을 받기(syso, 변수)
		//System.out.println("현재 재고수량 "+product1.subtrackStock(15));
		
		//변수 선언
		int stockNum = product1.subtrackStock(15);
		//이후로 stockNum 사용할 수 있다.
		System.out.println("현재 재고수량 "+stockNum);
			
		
		//반품 => 재고 증가
		//메소드 호출 => 리턴타입이 없으면 호출만 하면 됨
		product1.addStock(5);
		System.out.println("현재 재고수량 "+product1.getStockNum());
		
		
		

	}
}
