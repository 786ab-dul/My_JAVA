class Cool2
{
	void disp(){
		System.out.println("Hello");
	}
	
}
class Dinga extends Cool2
{
	int x=10;
	void tata(){
		System.out.println("Hi");
	}
}


class Main9
{
	public static void main(String[] args) 
	{
		Cool2 c1 = new Dinga();
		c1.disp();
		
		Dinga d1 = (Dinga)c1;
		
		d1.tata();
		System.out.println(d1.x);
		
	}
}