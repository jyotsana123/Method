
public class methodVsreturntype {
	
	int m1()
	{
		//System.out.println("m1 method");
		return 10;
	}
	
	float m2()
	{
		System.out.println("m2 method");
		return 10.5f;
	}
	
	static char m3()
	{
		System.out.println("m3 method");
		return 's';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodVsreturntype t = new methodVsreturntype();
		int a = t.m1();
		System.out.println(a);
		float f = t.m2();
		System.out.println(f);
		char c = m3();
		System.out.println(c);

	}

}
