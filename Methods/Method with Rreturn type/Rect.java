class Rect 
{
	static int area()
	{
		int w = 5;
		int h = 20;
		int res = w*h;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of Rect");
		int x = area();
		System.out.println(x);
	}
}
