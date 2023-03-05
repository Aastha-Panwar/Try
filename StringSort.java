import java.util.Arrays;
public class StringSort
{
	public static void main(String[] args) {
	    String str = "aastha";
	    
	   // Without using sort method
	    char a[] = str.toCharArray();
	    char temp;
	    
	    
	    for(int i =0;i<str.length();i++)
	    {
	        for(int j =0; j<str.length();j++)
	        {
	            if(a[i]>a[j])
	            {
	                temp = a[i];
	                a[i] =a[j];
	                a[j] =temp;
	            }
	        }
	    }
	    
	    		System.out.println(new String(a));

	   // using sort method
	   Arrays.sort(a);
	   
		System.out.println(new String(a));
	}
}