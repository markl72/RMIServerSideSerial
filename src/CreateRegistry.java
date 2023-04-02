//import java.io.ObjectInputFilter;
import java.io.FileOutputStream;
//import java.io.ObjectInputFilter;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
import java.rmi.server.*;

import sun.rmi.server.UnicastServerRef;
import sun.rmi.transport.LiveRef;
import sun.rmi.transport.tcp.TCPEndpoint;


 
public class CreateRegistry implements Remote {
		
	  public static void main (String[] argv) throws RemoteException, MalformedURLException {

	
	  // https://stackoverflow.com/questions/8386001/how-to-close-rmiregistry-running-on-particular-port
		  
		// create the registry
		  Registry rmiRegistry = LocateRegistry.createRegistry(1099);
		  
		  
		  // deregister the registry
		  if (rmiRegistry != null) {
		      UnicastRemoteObject.unexportObject(rmiRegistry, true);
		  }
	  }  
	   
}