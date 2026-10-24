class Cool
{
	void add(){
		System.out.println("Hi");
	}
}
class Goolata extends Cool
{
	void dispu(){
		System.out.println("Hello");
	}
}


class Main4
{
	public static void main(String[] args) 
	{
		Cool c1 = new Goolata();
		c1.add();
		
		Goolata g1 = (Goolata)c1;
		g1.add();
		g1.dispu();
	}
}