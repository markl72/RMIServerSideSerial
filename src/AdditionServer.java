//import java.io.ObjectInputFilter;
import java.io.FileOutputStream;
import java.io.ObjectInputFilter;
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

// To clear RMI Registry port:
// net stop winnat
// net start winnat
// or run start rmiregistry as administrator?
 
public class AdditionServer implements Remote {
		
	  public static void main (String[] argv) throws RemoteException, MalformedURLException {
		   try {
				   
			   Addition Addition = new Addition();	
			  // TCPEndpoint te = new TCPEndpoint("192.160.0.15", 1019);
			   //LiveRef lref = new LiveRef(1);
			  // UnicastServerRef ref = new UnicastServerRef(new LiveRef(0), impl.checker);
			   //Run configurations: -Djava.rmi.server.hostname=192.168.0.15 -Djava.rmi.server.useCodebaseOnly=true


			   //ObjectInputFilter objfilter = ObjectInputFilter.Config.createFilter("NumberPair;!*");
			   //ObjectInputFilter.Config.setSerialFilter(objfilter);
			   
			   // Create RMI exported object for Addition 
			   Remote stub = UnicastRemoteObject.exportObject(Addition,0);
			   System.out.println(stub);
			   
		   
	   		   Naming.rebind("Addition", Addition); // use this option if rmiregistry is on default port 1099
	   		   
			   //Registry registry = LocateRegistry.getRegistry(1020);
			   //registry.bind("Hello3", Hello);
			   			   
	   		   //System.out.println("java.rmi.server.hostname: " + System.getProperty("java.rmi.server.hostname"));
	   		   //System.out.println("java.rmi.server.activation.port: " + System.getProperty("java.rmi.server.activation.port"));
	   		   //System.out.println("java.rmi.server.codebase: " + System.getProperty("java.rmi.server.codebase"));
	   		   //System.out.println("java.rmi.server.useCodebaseOnly: " + System.getProperty("java.rmi.server.useCodebaseOnly"));
	   		   	   		   
	           //Registry registry = LocateRegistry.getRegistry();
			   //Remote stub2 = UnicastRemoteObject.exportObject(registry, 0, objfilter);   
			   //System.out.println(stub2);
	   		   //Naming.rebind("reg",registry);
 
			   System.out.println("Addition Server is ready.");
			   }catch (Exception e) {
				   System.out.println("Addition Server failed: " + e);
				}
		   }
	  
	   
	   
		   
	   
	   
	   
}