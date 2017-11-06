package by.htp.les6;

public class B extends A {
	
	
	public B() {
		
	}
	
	public B(String title) {
		super(title);
		
		System.out.println("B");
		
		System.out.println(super.getTitle() + " ");
		
	}

}
