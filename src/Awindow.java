import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awindow extends Window{

    //Initialization and declaration buttons
    Button rightButton = new Button();
    Button falseButton = new Button();
    Button bankButton = new Button();


    //Label
    public static JLabel answerLabel = new JLabel();

    //Font für Lable
    Font labelFont = new Font(answerLabel.getName(), Font.BOLD, 30);

    //Counter
    int count; //Countet hoch und wird für die Punkteanzahl benötigt -> bekommt Daten von QWindow zugewissen im ButtonLauscher

    //Erstellen eines Buttonlisteners
    ButtonLauscher buttonListener = new ButtonLauscher();

    //Konstruktor mit super Aufruf und den Buttons wird ein ActionsListener hinzugefügt
    public Awindow(String title, int width, int hight)
    {
        super(title, width, hight);
        rightButton.addActionListener(buttonListener);
        falseButton.addActionListener(buttonListener);
        bankButton.addActionListener(buttonListener);
        addButton();
        frame.add(answerLabel);
        answerLabel.setVisible(true);
        answerLabel.setForeground(Color.MAGENTA);
        answerLabel.setFont(labelFont);
        frame.setVisible(true);
    }

    //Methode zum Hinzufügen der Buttons
    private void addButton()
    {
        rightButton.setLabel("Richtig");
        falseButton.setLabel("Falsch");
        bankButton.setLabel("Bank");
        frame.add(rightButton);
        frame.add(falseButton);
        frame.add(bankButton);
    }

    //interne Klasse die den Ablauf regelt, wenn ein Button gedrückt wird
    class ButtonLauscher implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == rightButton){

                count = QWindow.getBank();

                if (count < 2)
                {
                    count++;
                }
                else if(count >= 2 && count < 6)
                {
                    count = count+2;
                }
                else if (count >= 6 && count < 21)
                {
                    count = count+3;
                }
                else
                    {
                        count = count+4;
                    }
                QWindow.bankLabel.setText(Integer.toString(count));
                QWindow.setBank(count);
                QWindow.nextQuestions();
            }
            else if (e.getSource() == falseButton)
            {
                QWindow.setBank(0);
                QWindow.displayBank();
                //QWindow.setImage(0);
                QWindow.nextQuestions();
            }
            else if (e.getSource() == bankButton)
            {
                QWindow.setCounter(QWindow.getCounter() + QWindow.getBank());
                QWindow.setBank(0);
                QWindow.displayBank();
                //QWindow.setImage(0);
                QWindow.nextQuestions();
            }
        }
    }

}
