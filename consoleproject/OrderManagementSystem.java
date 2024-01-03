package consoleproject;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
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

class Order {
	private ArrayList<Product> products;
	private double totalPrice;
	
	public Order() {
		this.products = new ArrayList<Product>();
		this.totalPrice = 0;
	}
	
	public void addProduct(Product product) {
		products.add(product);
		totalPrice += product.getPrice();
		System.out.println(product.getName() + "가 주문에 추가되었습니다");
	}
	
	public void showOrderDetails() {
		System.out.println("주문 내역");
		for (Product product : products) {
			System.out.println("- " + product.getName() + " : " + product.getPrice() + " 원");
		}
		System.out.println("총 가격: " + totalPrice + " 원");
	}
	
}

public class OrderManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Order order = new Order();
		
		boolean isRunning = true;
		
		while (isRunning) {
			System.out.println("------------------------------------------------");
			System.out.println("1.제품추가 2.주문확인 3.종료");
			System.out.println("------------------------------------------------");
			System.out.println("메뉴를 선택해주세요");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("제품명을 입력하세요");
				scanner.next();
				String productName = scanner.nextLine();
				
				System.out.println("가격을 입력하세요");
				double productPrice = scanner.nextDouble();
				
				Product newProduct = new Product(productName, productPrice);
				order.addProduct(newProduct);
				System.out.println(productName + " 제품이 추가되었습니다");
				break;
			case 2:
				order.showOrderDetails();
				break;
			case 3:
				isRunning = false;
				break;
			default:
				System.out.println("잘못된 선택입니다");
				break;
			}
		}
		scanner.close();
	}
}
