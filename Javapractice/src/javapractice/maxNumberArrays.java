package javapractice;

public class maxNumberArrays 
{

	public static void main(String[] args)
	{
		int[] a = {2,5,7,3,6,7};
		int max = a[0];
		
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i] > max)
			{
				max=a[i];
			}
		}
		
		System.out.println("max number: " +max);
	
	}

}

