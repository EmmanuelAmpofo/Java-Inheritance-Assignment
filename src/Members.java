
public class Members {
	int age;
	String number;
	String name;
	float salary;
	String address;
	
	void printSalary() {
		System.out.println("Salary = "+salary);
	}
}
class Employee extends Members{
	String specializeation;
}
class Manager extends Members{
	String department;



	public static void main(String[] args) {
		
		Employee braye = new Employee();
		Manager oscar = new Manager();
		
		braye.age = 45;
		braye.number = "0541000020";
		braye.name = "George Braye";
		braye.salary = 1200;
		braye.address = "22 Abofun Street";
		
		
		oscar.age = 51;
		oscar.number = "0209138483";
		oscar.name = "Oscar Emmanuel";
		oscar.salary = 2500;
		oscar.address = "Osu Oxford Street";

	}

}
