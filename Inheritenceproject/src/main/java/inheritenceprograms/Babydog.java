package inheritenceprograms;

public class Babydog extends Dog {
	public void walk() {
		System.out.println("Walking");
	}
public static void main(String args[]) {
	

Babydog obj=new Babydog();
obj.walk();
obj.jump();
obj.run();
}
}