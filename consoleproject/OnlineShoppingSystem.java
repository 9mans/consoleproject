package consoleproject;

import java.util.ArrayList;
import java.util.Scanner;


class Product1 {
	private String name;
	private double price;
	
	public Product1(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
}


class ShoppingCart {
	
	private ArrayList<Product1> cart;
	

	public ShoppingCart() {
		this.cart = new ArrayList<>();
	}
	
	public void addToCart(Product1 product) {
		cart.add(product);
		System.out.println(product.getName() + " 가 장바구니에 추가되었습니다");
	}
	
	public void showCart() {
		if (cart.isEmpty()) {
			System.out.println("장바구니가 비어있습니다");
			return;
		}
		
		System.out.println("장바구니 내역");
		for (Product1 product : cart) {
			System.out.println("-" + product.getName() + " : " + product.getPrice() + " 원");
		}
	}
	
	public double calculateTotal() {
		double total = 0;
		for (Product1 product : cart) {
			total += product.getPrice();
		}
		return total;
	}
	
	public void clearCart() {
		System.out.println("장바구니비우기");
		cart.clear();
	}
	
    public boolean isEmpty() {
        return cart.isEmpty();
    }
}



public class OnlineShoppingSystem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		boolean isRunning = true;
		
		while (isRunning) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 제품보기 2. 장바구니 확인 3. 주문하기 4. 종료");
			System.out.println("------------------------------------------------");
			System.out.println("메뉴를 선택하세요");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					Product1 product = new Product1("티비", 10000);
					cart.addToCart(product);
					break;
				case 2:
				cart.showCart();
				break;
				
				case 3:
					
					if(!cart.isEmpty()) {
						System.out.println("총 주문가격: " + cart.calculateTotal());
						System.out.println(" 주문 완료");
						cart.clearCart();
					} else {
						System.out.println(" 장바구니가 비어있습ㅂ니다");
					}
					break;
				case 4: 
					isRunning = false;
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("잘못된 선택입니다");
			
			}
		
		
		
		}
	}
}
