package javaPackage;

public class Customer {
	String name;
	String sex;
	String address;
	int fee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj= new Customer();
		obj.name="regina";
		obj.sex= "Male";
		obj.address="Virgania";
		obj.fee= 2000;
		
		System.out.println("Name of customer1 "+obj.name);
		System.out.println("Sex of customer1 "+obj.sex);
		System.out.println("Address of customer1 "+obj.address);
		System.out.println("Fee of customer1 "+obj.fee);
		
		Customer obj2= new Customer();
		obj2.name="Fidelis";
		obj2.sex= "Male";
		obj2.address="Virgania";
		obj2.fee= 4000;
		
		System.out.println("Name of customer2 "+obj2.name);
		System.out.println("Sex of customer2 "+obj2.sex);
		System.out.println("Address of customer2 "+obj2.address);
		System.out.println("Fee of customer2 "+obj2.fee);
	}

}
