package inheritenceprograms;

public class Car extends Vehicle {
	public void speed()
	{
		System.out.println("Speed");
	}

	public static void main(String[] args) 
	{
		
Car obj1=new Car();
obj1.speed();
obj1.run();

}
}