class Demo10
{
	int r=10;
	double z=20.0;
}
class Dumtaka3 extends Demo10
{
	int x=10;
}


class Main12
{
	public static void main(String[] args) 
	{
		Demo10 d1 = new Dumtaka3();
		System.out.println(d1.z);
		System.out.println(d1.r);
		
		Dumtaka3 d2 = (Dumtaka3)d1;
		System.out.println(d2.x);
		
	}
}