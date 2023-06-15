
public class ex1 {
	
	//https://www.youtube.com/watch?v=ZblCcJTtN9Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=17
	
	//example 1
	
	void m1()  //Instance method
	{
		System.out.println("m1 instance method");
	}
	
	static void m2()  //static method
	{
		System.out.println("m2 static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex1 t = new ex1();
		t.m1();
		ex1.m2();

	}

}
