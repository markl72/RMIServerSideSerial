import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class NumberPair implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	public int number1;
	public int number2;
	   
	public NumberPair(int num1, int num2) throws IOException  {  
		number1 = num1;
		number2 = num2;
	}	
}
