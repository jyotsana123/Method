
public class ex2 {
	
	void m1(int a, char ch)
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	
	static void m2(String str, double d)
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex2 ex = new ex2();
		ex.m1(10, 'a');
		ex2.m2("jyotsana", 10.5);
	}

}
