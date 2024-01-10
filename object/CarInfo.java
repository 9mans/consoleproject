package object1;

class Car {
	
	String brand;
	String model;
	int year;
	
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println("자동차 브랜드: " + brand);
		System.out.println("자동차 모델명: " + model);
		System.out.println("자동차 연식: " + year);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

	
	
}

public class CarInfo {

	public static void main(String[] args) {
		
		Car myCar = new Car("현대", "소나타", 2010);
		
		System.out.println(myCar);
		myCar.displayInfo();
	}
}

