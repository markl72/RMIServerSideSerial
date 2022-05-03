import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.*;
import java.rmi.server.*;
 
public class Addition //extends UnicastRemoteObject 
	implements AdditionInterface{
 		
	public Addition () {      
	}
 
      public int add(Object a, int b)  {
    	  int result= 1+20;//a.number+b;
    	  System.out.println(a);
    	  System.out.print(a.getClass());
    
    	  return result;
      }


      

 }