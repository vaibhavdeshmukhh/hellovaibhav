package ss.aa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class App 
{
    public static void main( String[] args )
    {
       LinkedList l= new  LinkedList();
        l.add("A");
        l.add("B");
        l.add("10");
        l.add("null"); 
        l.add("A");
        System.out.println(l);//[A, B, 10, null, A]
        l.set(0,"vaibhav");
        System.out.println(l);//[vaibhav, B, 10, null, A]
        l.add(1, "deshmukh");
        System.out.println(l);//[vaibhav, deshmukh, B, 10, null, A]
        l.addFirst("c");
        System.out.println(l);//[c, vaibhav, deshmukh, B, 10, null, A]
        l.addLast("M");
        System.out.println(l);//[c, vaibhav, deshmukh, B, 10, null, A, M]
  /*  	Vector v=new Vector();
    	System.out.println(v.capacity());//10
    	for(int i = 1;i<=10;i++){
    		v.addElement(i);
    	}
    	
    	System.out.println(v.capacity());//10
    	v.addElement("A");
    	System.out.println(v.capacity());//20
    	System.out.println(v);*///[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
    	
     	
        
       
    }
}
