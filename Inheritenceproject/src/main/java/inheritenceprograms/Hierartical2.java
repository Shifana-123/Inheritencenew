package inheritenceprograms;

public class Hierartical2 extends Hierartical1 {
public void Grapes()
{
	System.out.println("Green");
}
public static void main(String args[]) {
	Hierartical2 obj =new Hierartical2();
	obj.Grapes();
	obj.Fruits();
	Hierartical1 obj1=new Hierartical1();
	obj1.Apple();
	obj1.Fruits();

}

}
