class Triangle 
{
	static double area()
	{
		int b = 2;
		int h = 3;
		double res = (b*h)/2;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of triangle:");
		double x = area();
		System.out.println(x);
	}
}
