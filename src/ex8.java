
//https://www.youtube.com/watch?v=ZblCcJTtN9Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=17

public class ex8 {
	
	int x = 100;   
	int y = 200;
	
	void add(int x, int y)
	{
		System.out.println(x+y);  //if local and instance var. has same name then priority goes to only local var.
		                          // to represent instance var. need to use this keyword
		System.out.println(this.x+this.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex8 ex = new ex8();
		ex.add(10, 20);
	}

}
