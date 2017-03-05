import java.applet.Applet;
import java.awt.*;	

public class Main extends Applet {	
  Color [] c = 
  {
    Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
    Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
    Color.PINK, Color.RED, Color.YELLOW
  };

  public void init(){
    setSize(400, 400);	
  }

  public void paint(Graphics page){
    int x = 10, y = 10, w = 300, h = 300, index = 0, delta = 10;
    for(int i = 1; i <= 12; i++){
      page.setColor(c[index++]);
      page.fillOval(x, y, w, h);
      x += delta;
      y += delta;
      w -= 2 * delta;
      h -= 2 * delta;
    }
  }
}
