package object1;

class Person {
	private String name;
	private int age;
	private String occupation;
	
	public Person(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public void displayInfo() {
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("직업" + occupation);
	}
}

public class PersonDemo {
	
	public static void main(String[] args) {
		
		Person person = new Person("김규남", 32, "무직");
		Person person1 = new Person("아무개", 31, "광부");
		
		System.out.println("첫 번째 사람 정보");
		person.displayInfo();
		
		System.out.println("두 번째 사람 정보");
		person1.displayInfo();
		
	}

}
