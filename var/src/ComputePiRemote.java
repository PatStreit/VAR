import java.math.*;
import java.rmi.*;
public interface ComputePiRemote extends Remote {
	BigDecimal computePi(int precision) throws RemoteException;
	

}
