package Inheritance;

public class Child_Class extends Base_Class{
	
	public void mult(){
		System.out.println("Multiplication is 250");
	}
	public void div() {
		System.out.println("Division is 100");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Class obj = new Child_Class();
		obj.add();
		obj.subs();
		obj.mult();
		obj.div();
		System.out.println("============");
		
		Base_Class obj2 = new Base_Class();
		obj2.add();
		obj2.subs();
		System.out.println("===========");

	}

}
