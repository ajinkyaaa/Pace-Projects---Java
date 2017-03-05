import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Field;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyClient extends Applet{
  //Complete this class
  private String colorBg,  message;
  public void init(){
	  setSize(400, 100);
    try{
      Scanner scn = new Scanner(System.in);
      Socket sock = new Socket("localhost", 7000);
      InputStream instream = sock.getInputStream();
     
      PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
     
    	  BufferedReader br = new BufferedReader(new InputStreamReader(instream));
    	  message = br.readLine();
    	  String[] splitMessage = message.split("-");
    	  colorBg = splitMessage[0];
    	  message = splitMessage[1];
    	  Color color;
    	  try {
    		  Field field = Class.forName ("java.awt.Color").getField (colorBg);
    	      color = (Color)field.get(null);
    	  } catch (Exception e) {
    	      color = Color.white; // Not defined
    	  }
    	  setBackground(color);
    	  //repaint();
    	  System.out.println("Server Message has been implemented in Applet.");

    }
    catch(Exception e){
      System.out.println("Error: " + e);
      System.exit(0);
    }
  }

  public void paint(Graphics page){
	  page.drawString(message, 50, 50);
	
  }   
}
