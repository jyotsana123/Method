
//https://www.youtube.com/watch?v=ZblCcJTtN9Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=17
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		System.out.println(a+b); //but this is completely invalid in java, inside the class directly business login is not allowed
                                 //that is why we need to declare one method and inside the method write the business logic
		
		System.out.println("nishu"+"pandey");
		System.out.println(100+200);
		System.out.println(100+200+"nishu"+"pandey"+100+200); //priority goes to left to right
		                                                      //int + int = int      100+200 = 300
		                                                      //int + string = string  300+nishu = 300nishu
		                                                      //string+int = string    300nishupandey+100+200 = 300nishupandey100200
	}

}


//java is not supporting operator overloading but there is one implicit operator overloading which is + operator

//1. method return type is mandatory in java   void m1()
//2. return type could be primitive type, class type, array type etc.
//3. if method return type is other than void then we must return that value by return statement
//4. inside the method return statement must be the last statement of the method
//5. methos is able to return the value but holding the value is optional, but it's always recommended to hold the return value.'