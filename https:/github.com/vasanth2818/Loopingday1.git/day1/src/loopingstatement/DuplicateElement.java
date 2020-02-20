package loopingstatement;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList al=new ArrayList();
       al.add("java");
       al.add("android");
       al.add("php");
       al.add("java");
       al.add("python");
       al.add("android");
       HashSet h=new HashSet();
       for(int i=0;i<al.size();i++)
       {
    	   boolean t=h.add(al.get(i));
    	   if(t==false)
    	   {
    		   System.out.println(al.get(i));
    		   
    	   }
       }
       
       		
       
       		
       
       	
	}

}
