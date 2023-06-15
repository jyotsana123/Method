
public class returnInstanceLocalVar {
	
	int a = 100;
	
	int m1(int a)
	{
		System.out.println("m1 method");
		return a;   //return local var
	}
	
	int m2()
	{
		System.out.println("m2 method");
		return a;  //return instance var if no local var.
	}
	
	int m3(int a)
	{
		System.out.println("m3 method");
		return this.a;  //return instance var
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnInstanceLocalVar t = new returnInstanceLocalVar();
		int x = t.m1(5);
		System.out.println(x);
		int y = t.m2();
		System.out.println(y);
		int z = t.m3(9);
		System.out.println(z);
		

	}

}
