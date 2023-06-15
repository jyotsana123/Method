
//https://www.youtube.com/watch?v=ZblCcJTtN9Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=17

public class ex7 {
	
	void m1()   
	{
		m2();  //you can call instance method directly in instance area
		System.out.println("m1 method");
		m2();
	}
	
	void m2()   
	{
		m3(2);
		System.out.println("m2 method");
	}
	
	void m3(int a)   
	{
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex7 ex = new ex7();
		ex.m1();   //how to call m2 method before executing the m1 method
		           //you need to call m2 method in m1 method first
		//ex.m2();
	}

}
