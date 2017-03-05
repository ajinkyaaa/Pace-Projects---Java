
import java.io.*;
import java.net.*;

public class MyClientChat {
  public static void main(String[] args){
      Thread thrdcl = new Thread(new ThreadClient());
      Thread thrdsr = new Thread(new ThreadServer());
      thrdcl.start();
      thrdsr.start();
  }
}
