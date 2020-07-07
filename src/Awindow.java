import java.awt.*;

public class Awindow extends Window{

    //Konstruktor mit super Aufruf
    public Awindow(String title, int width, int hight)
    {
        super(title, width, hight);
    }
    //Initialization and declaration buttons
    Button rightButton = new Button();
    Button falseButton = new Button();

    //Methode zum Hinzufügen der Buttons
    public void addButton()
    {
        rightButton.setLabel("Richtig");
        falseButton.setLabel("Falsch");
        frame.add(rightButton);
        frame.add(falseButton);
    }

}
