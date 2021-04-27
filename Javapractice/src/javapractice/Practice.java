package javapractice;

public class Practice 
{

	public static void main(String[] args) 
	{
		int[] a = {56, 63, 84, 90,45,77};
		int k = 4;
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i == k-1)
			{
				System.out.println("4th smallest number is ==> " +a[i]);
			}
		}
		
		
		

	}

}
