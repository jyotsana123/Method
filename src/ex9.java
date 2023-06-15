
//https://www.youtube.com/watch?v=ZblCcJTtN9Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=17

public class ex9 {
	
	int x = 100;   
	int y = 200;
	
	static void add(int x, int y)
	{
		System.out.println(this.x+this.y); //inside the static area this keyword is not allowed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex9 ex = new ex9();
		ex.add(10, 20);
	}

}
