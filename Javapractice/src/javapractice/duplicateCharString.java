package javapractice;

public class duplicateCharString
{

	public static void main(String[] args) 
	{
       
		String str = "mahabaleshwar";
	    int length = str.length();
		char[] ch = str.toCharArray();
		
		System.out.println("Duplicate char are");
		
		for(int i=0; i<length; i++)
		{
			for(int j=i+1; j<length; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(+ch[j]);
					break;
				}
			}
			
		}
		
		
		
		
		
	}

}
