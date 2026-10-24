class Cola23
{
	int f=10;
	void disp(){
		System.out.println("Hi");
	}
}
class Chungacha extends Cola23
{
	int d = 20;
}


class Main14
{
	public static void main(String[] args) 
	{
		Cola23 c23 = new Chungacha();
		c23.disp();
		System.out.println(c23.f);
		
		Chungacha c1 = (Chungacha)c23;
		System.out.println(c1.d);
		
	}
}