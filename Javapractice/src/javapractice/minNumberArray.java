package javapractice;

public class minNumberArray 
{

	public static void main(String[] args)
	{
		int[] a = {7,2,4,9,7,8,5};
		int min = a[0];                            //a=2
		
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		System.out.println("min number is: " +min);
	}

}
