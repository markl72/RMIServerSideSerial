import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.*;
import java.rmi.server.*;
 
public class Addition //extends UnicastRemoteObject 
	implements AdditionInterface{
 		
	public Addition () {      
	}
 
      public int add(Object a)  {
    	  NumberPair b = (NumberPair)a;
    	  int result = b.number1 + b.number2;
    	  
    	  //System.out.println(a);
    	  //System.out.print(a.getClass());
    
    	  return result;
      }


      

 }