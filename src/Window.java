import javax.swing.*;

//Elternklasse von Answers Window und Question Window
public class Window {

    protected JFrame frame;

    public void createWindow(String title, int width, int height)
    {
        //Create and set up window
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.getContentPane();
        frame.setVisible(true);
    }

}
