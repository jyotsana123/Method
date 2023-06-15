

//https://www.youtube.com/watch?v=ZblCcJTtN9Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=17


class X{}
class Emp{}
class Y{}
class Student{}       //this example is important for project level
public class ex3 {
	
	void m1(X x, Emp e)     //in real time project you need to pass class object in the method parameter, by this u can pass
	{
		System.out.println("m1 method");
	}
	
	static void m2(Y y, Student s)
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X x1 = new X();
		Emp e1 = new Emp();
		ex3 ex = new ex3();
		//ex.m1(new X(), new Emp());   //by this we can reduce the three lines of code in single line
		ex.m1(x1, e1);     //in real time by this you can call the method and passing the argument in it.
		
		Y y = new Y();
		Student st = new Student();
		ex3.m2(y, st);  //ex3.m2(new Y(), new Student());

	}

}
