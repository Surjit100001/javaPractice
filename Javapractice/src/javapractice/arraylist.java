package javapractice;

public class arraylist 
{

     public static void main(String[] args) 
     {
    	String st = "shivanand";
    	int length = st.length();
    	char[] ch = st.toCharArray();
    	
    	for(int i=0; i<=length-1; i++)
    	{
    		for(int j=i+1; j<=length-1; j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				System.out.println(ch[j]);
    			}
    		}
    	}
    	
    	
    	
	 }
	
}
