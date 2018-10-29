import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
		try {
			Scanner br =new Scanner(System.in);

			Socket s2= new Socket("localhost",1234);

			DataOutputStream dout = new DataOutputStream(s2.getOutputStream());
			DataInputStream data = new DataInputStream(s2.getInputStream());

			while(true)
			{
				String str = data.readUTF();
				System.out.println(str);
				
				dout.writeUTF(br.next());
			
			}


		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
