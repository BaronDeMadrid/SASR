package Swing;
import java.awt.*;

import javax.swing.JFrame;
public class Swinger extends JFrame{
Swinger(){
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize(); 
setBounds(i_windowWidth,i_windowLength,screen.width,screen.height);
setTitle(s_Title);
Image icon = screen.getImage(s_nameOfImage);
setExtendedState(Frame.MAXIMIZED_BOTH);
screen = Toolkit.getDefaultToolkit();

}
}