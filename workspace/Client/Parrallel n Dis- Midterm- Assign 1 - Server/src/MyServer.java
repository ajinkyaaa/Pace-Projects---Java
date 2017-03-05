import java.io.*;
import java.net.*;
import java.util.*;

public class MyServer {
  public static void main(String[] args) throws IOException {
    
    try {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a message to send: ");
      String message = keyboard.nextLine();
      byte[] buffer = message.getBytes();
      int port = 16790;
      InetAddress host = InetAddress.getByName("localhost");
      DatagramSocket serverSocket = new DatagramSocket();
      DatagramPacket datagram = new DatagramPacket(buffer, buffer.length, host, port);
      serverSocket.send(datagram);
      serverSocket.close();
    } catch (IOException e) {
        System.out.println("Error: " + e);
        System.exit(0);
    }
  }
}
