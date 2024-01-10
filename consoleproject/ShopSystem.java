package consoleproject;

import java.util.ArrayList;
import java.util.List;

class Product3 {
	private String productName;
	private double price;
	private int quantity;
	
	public Product3(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
	
	
}

class Customer {
	private String name;
	private double budget;
	
	public Customer(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}
	
	public void buyProduct(Product3 product, int quantity) {
		if (product != null && product.getQuantity() >= quantity) {
            double totalCost = product.getPrice() * quantity;
            if (totalCost <= budget) {
                product.setQuantity(product.getQuantity() - quantity);
                budget -= totalCost;
                System.out.println(name + "님이 " + product.getProductName() + " 상품 " + quantity + "개를 구매하셨습니다.");
            } else {
                System.out.println(name + "님의 예산이 부족하여 구매할 수 없습니다.");
            }
        } else {
            System.out.println("상품 재고가 부족하거나 존재하지 않습니다.");
        }
    }
}

class Shop {
    private List<Product3> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product3 product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("상점 상품 목록:");
        for (Product3 product : products) {
            System.out.println("- " + product.getProductName() + " | 가격: $" + product.getPrice() + " | 재고: " + product.getQuantity() + "개");
        }
        System.out.println();
    }
}

public class ShopSystem {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // 상품 추가
        Product3 product1 = new Product3("Notebook", 899.99, 5);
        Product3 product2 = new Product3("Headphones", 49.99, 10);
        shop.addProduct(product1);
        shop.addProduct(product2);

        // 상점의 상품 목록 출력
        shop.displayProducts();

        // 고객 생성 및 상품 구매 시나리오
        Customer customer1 = new Customer("Alice", 1500);
        customer1.buyProduct(product1, 2); // Alice가 Notebook 2개 구매 시도
        customer1.buyProduct(product2, 3); // Alice가 Headphones 3개 구매 시도

        Customer customer2 = new Customer("Bob", 500);
        customer2.buyProduct(product2, 5); // Bob이 Headphones 5개 구매 시도

        // 최종 상점의 상품 목록 출력
        shop.displayProducts();
    }
}







