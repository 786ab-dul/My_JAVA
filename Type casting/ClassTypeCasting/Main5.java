class Demo1
{
	double z = 10.00;
}
class Dumbtaka extends Demo1
{
	int x = 10;
}


class Main5
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Dumbtaka();
		System.out.println(d1.z);
		
		Dumbtaka d2 = (Dumbtaka)d1;
		System.out.println(d2.x);
		System.out.println(d2.z);
	}
}