class Sample21
{
	int r=10;
	void co(){
		System.out.println("Hi");
	}
}
class Hahoha extends Sample21
{
	void disp(){
		System.out.println("Hello");
	}
}


class Main13
{
	public static void main(String[] args) 
	{
		Sample21 s21 = new Hahoha();
		s21.co();
		System.out.println(s21.r);
		
		Hahoha h1 = (Hahoha)s21;
		h1.disp();
		
	}
}