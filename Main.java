import com.db4o.Db4o;
import com.db4o.ObjectServer;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) 
	{
		System.out.println("TestServer Started");
		
		ObjectServer server = Db4o.openServer("test.dat", 8989);
		
		server.grantAccess("user","password");
		
		System.out.println("Server Created");
		
		while(true)
		{
			
		}
	}
}