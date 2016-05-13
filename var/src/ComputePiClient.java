import java.math.*;
import java.rmi.*;
public class ComputePiClient {
	public static void main(String[] args){
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		try{
			String name = "//" + args[0] + "/ComputePi";
			ComputePiRemote computePiRemote = (ComputePiRemote) Naming.lookup(name);
			BigDecimal pi = computePiRemote.computePi(Integer.parseInt(args[1]));
			System.out.println(pi);
		}
		catch(Exception e ){
			System.err.println("ComputePiClient exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
