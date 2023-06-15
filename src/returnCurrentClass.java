
public class returnCurrentClass {
	
	returnCurrentClass m1()
	{
		System.out.println("m1 method");
		returnCurrentClass cc = new returnCurrentClass();
		return cc;	
	}
	
	returnCurrentClass m2()
	{
		System.out.println("m2 method");  
		return this;	      //recommended to use this return
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		returnCurrentClass cc = new returnCurrentClass();
		returnCurrentClass rc = cc.m1();
		returnCurrentClass rc2 = cc.m2();
		
		
	}

}
