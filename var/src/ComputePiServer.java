import java.math.*;
import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("serial")
public class ComputePiServer extends UnicastRemoteObject implements ComputePiRemote{
	protected ComputePiServer() throws RemoteException {
		super();
	}
	@Override
	public BigDecimal computePi(int precision) throws RemoteException{
		int v = 0;
	    
	    double x,y;
	    System.out.println(" Monte Carlo Methode");
	    System.out.println(" Naeherung fuer Pi:");
	    for (int i = 1; i <= precision; i++)   {	
	      x = Math.random();
	      y = Math.random();
	      if (Math.hypot(x,y) <= 1)	
	        v = v + 1;
	    }  
	    double pi = 4*(double)v / precision; 
	    System.out.printf(" %d Tropfen, davon %d Tropfen im Viertelkreis, Pi etwa %g%n",precision,v,pi);
	    return new BigDecimal (pi);
	}

}
