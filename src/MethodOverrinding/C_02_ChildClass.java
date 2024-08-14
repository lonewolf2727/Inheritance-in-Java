package MethodOverrinding;

public class C_02_ChildClass extends C_01_ParentClass{
	
	public void display() {
		System.out.println("This is Parent Class display method.");
	}
	public void show() {
		System.out.println("This is PArent class show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_02_ChildClass obj = new C_02_ChildClass();
		obj.display();
		obj.show();
		obj.display();
		C_01_ParentClass obj2 = new C_01_ParentClass();
		obj2.display();
		obj2.show();
		
		C_01_ParentClass obj3 = new C_01_ParentClass();
		obj3.display();
		obj3.show();

	}

}
