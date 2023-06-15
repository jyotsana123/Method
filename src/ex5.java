
public class ex5 {
	
	void m1(int a)   //you can define two methods with different signature
	{
		System.out.println("m1 method");
	}

	void m1()
	{
		System.out.println("m1 method without parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex5 ex = new ex5();
		ex.m1();
		ex.m1(5);
	}

}
