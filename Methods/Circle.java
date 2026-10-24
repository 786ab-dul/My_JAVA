class Circle 
{
	static void area(){
		final double pi = 3.142;
		int r = 3;
		double ar = pi*r*r;
		System.out.println(ar);
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of Circle");
		area();
	}
}
