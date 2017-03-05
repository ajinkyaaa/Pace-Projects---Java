//Client class to call server


import java.rmi.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project4Client{
  

public static void main(String args[]){
    try{
      int port = 16790;    
      int scnInput = 0;
      String host = "localhost";
      Scanner scn = new Scanner(System.in);
      System.out.println("Please enter a positive integer.");
      try{
      scnInput = scn.nextInt();
      if(scnInput < 0)
      {
    	  throw new InputMismatchException() ;
      }
      }
      catch(Exception ex)
      {
    	  System.out.println("Oops! Please enter positive Integers only. \n");
    	 
      }
      String registryURL = "rmi://" + host + ":" + port + "/CalculateSum";
      Project4ServerInterface h = (Project4ServerInterface)Naming.lookup(registryURL);
      System.out.println("Lookup completed " );
      int message = h.calculateSum(scnInput);
      System.out.println("The sum is: " + message);
    } 
    catch (Exception e){
      e.printStackTrace();
    } 
  }
}
