import javax.swing.*;
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
        frame.setLayout(new FlowLayout());
        frame.getContentPane();
        frame.setVisible(true);
    }

}
