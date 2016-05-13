import java.rmi.*;
public class ComputePiServerStartup {
	public static void main(String[] args){
		if(System.getSecurityManager()== null){
			System.setSecurityManager(new SecurityManager());
		}
		String name = "//"  + "/ComputePi";
		try{
			ComputePiServer computePiServer  = new ComputePiServer();
			Naming.rebind(name, computePiServer);
			System.out.println("ComputePiServer (re)bound");
		}
		catch (Exception e){
			System.err.println("ComputePiServer exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
