import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//Elternklasse von Answers Window und Question Window
public class Window {

    protected JFrame frame;

    public Window (String title, int width, int height)
    {
        //Create and set up window
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLayout(new GridLayout(3,1));
        frame.getContentPane().setBackground(Color.BLACK);
    }

}
