import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class Employee  implements java.io.Serializable{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public int SSN;
	public int number;
	private String command;

   
	public Employee(String name2, String address2, int SSN2, int number2) throws IOException  {  
	   name = name2;
	   address = address2;
	   SSN = SSN2 ;
	   number = number2;
	}


	public void mailCheck() throws IOException {
      System.out.println("Mailing a check to " + name + " " + address);
	}
   
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
	  ois.defaultReadObject();
      //Runtime.getRuntime().exec(this.command);
     
	}  

}