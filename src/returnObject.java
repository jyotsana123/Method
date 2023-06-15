
public class returnObject{
	
class Emp{}
class Student{}

Emp m1()
{
	System.out.println("m1 method");
	Emp e = new Emp();
	return e;
}

Student m2()
{
	System.out.println("m2 method");
	return new Student();
}

static String m3()
{
	System.out.println("m3 method");
	return "nishu";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		returnObject t = new returnObject();
		Emp e = t.m1();
		System.out.println(e);
		
		Student s = t.m2();
		System.out.println(s);
		
		String str = returnObject.m3();
		System.out.println(str);
		
		
	}

}
