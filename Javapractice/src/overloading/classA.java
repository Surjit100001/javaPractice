package overloading;

public class classA 
{
	public int m1(int a, int b)
	{
		return a+b;
	}
	
	public int m1(int a, int b, int c)
	{
		return a+b+c;
	}

	public float m3(float a, float b)
	{
		return a+b;
 	}

	
	public float add(float a, int b)
	{
		return a+b;
 	}


}
