import java.io.ObjectInputStream;
import java.rmi.*;
	   
public interface AdditionInterface extends Remote {
	public int add(Object a) throws RemoteException;
}

