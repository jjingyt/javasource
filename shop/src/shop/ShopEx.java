package shop;

public class ShopEx {
	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//���� �̸� ����
		shop.setTitle("Java Shop");
		//�� ����
		shop.genUser();
		//��ǰ ����
		shop.genProduct();
		//���� ����
		shop.start();
	}
}
