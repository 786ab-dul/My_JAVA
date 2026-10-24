class Cool4
{
	void add(){
		System.out.println("Hello");
	}
	
}
class Goolata2 extends Cool4
{
	int r=10;
	void dispu(){
		System.out.println("Hi");
	}
}


class Main11
{
	public static void main(String[] args) 
	{
		Cool4 c4 = new Goolata2();
		c4.add();
		
		Goolata2 g1 = (Goolata2)c4;
		
		g1.dispu();
		System.out.println(g1.r);
		
	}
}