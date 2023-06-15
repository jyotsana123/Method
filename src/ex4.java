
public class ex4 {
	
	void m1()    //duplicate methods are not allowed in class, it's not possible to define 2 methods with same signature in a class
	{
		System.out.println("m1 method");
	}

	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex4 ex = new ex4();
		ex.m1();
	}

}
