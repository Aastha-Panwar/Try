//first non duplicate character in a string

import java.util.*;
public class Main1{

     public static void main(String []args){
        String s = "hfgsjfgsgfkqah";
        
        ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
        
        for(int i = 0; i<s.length(); i++)
        {
            if(list.contains(s.charAt(i)))
            {
				list2.add(s.charAt(i));
            }
            else{
                list.add(s.charAt(i));
            }
        }
		
        list.removeAll(list2);
				
        System.out.println(list.get(0));
     }
}