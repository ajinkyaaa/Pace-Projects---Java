import java.net.*; 
public class RecieverServer{
  public static void main(String[] args){
    try{      
			InetAddress  group = InetAddress.getByName("239.1.22.3");
			MulticastSocket  s = new MulticastSocket(3456);
			s.joinGroup(group);
			s.setTimeToLive(32);
			System.out.println("Waiting for Clients input...");
			byte[] buf = new byte[1000];
			String Msg = "0";
			
			Integer Counter = 0;
			Integer FinalSummation = 0;
			while(Integer.parseInt(Msg) != 0 || Counter == 0)
			{
				Msg =  new String(buf);
				s.receive(new DatagramPacket(buf,buf.length,group,3456));
				
					try{
					Msg = new String(buf);
					Msg = Msg.replaceAll("[^A-Za-z0-9()\\[\\]]","");
					FinalSummation += Integer.parseInt(Msg);	
					System.out.println(Msg.replaceAll("[^A-Za-z0-9()\\[\\]]", ""));
					}
					catch(NumberFormatException ex){
						System.out.println("Oops!! Illegal character recieved. Client should enter numbers only ");
					}
					
					Counter++;
			}
			Msg = FinalSummation.toString();
				
			System.out.println("The sum of all the numbers received is:  " +Msg);
				
			s.close();
    }
    catch (Exception ex){
ex.printStackTrace( );
    }
  }
}
