import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.db4o.Db4o;
import com.db4o.ObjectServer;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("TestServer Started");
		
		ObjectServer server = Db4o.openServer("test.dat", 8989);
		
		server.grantAccess("user","password");
		
		System.out.println("Server Created");
		
		String choice = "";
		Scanner in = new Scanner(System.in);
		while(!choice.equals("0"))
		{
			System.out.println("Press '0' for exit");
			choice = in.nextLine().trim();
		}
		in.close();
	}
}