public class ReverseString
{
	public static void main(String[] args) {
	    String str = "aastha";


	   // Approch1
	    char[] ch = str.toCharArray();
	    for(int i =ch.length-1;i>=0;i--)
	    {
	        System.out.print(ch[i]);
	    }
	    System.out.println(" ");
	   
	   
	   
	   // Approch2
	   for(int i =str.length()-1;i>=0;i--)
	   {
	       System.out.print(str.charAt(i));
	   }
	   System.out.println(" ");
	   
	   
	   
	   //Approch3
	   StringBuffer sb = new StringBuffer(str);
	   System.out.print(sb.reverse());
	   System.out.println(" ");
	   
	   
	   //Approch4
	   StringBuilder sbu = new StringBuilder(str);
	   System.out.print(sbu.reverse());
	}
}
