import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class QWindow extends Window {

    //festlegen der Attribute
    public static int bank = 0;
    public static int counter = 0;
    private int numQuestion = 0;
    private static int count = 0;
    //public static String questionsArr [][] = new String[3][2]; //Array mit Fragen und Antworten
    public static ArrayList<Integer> oldNum = new ArrayList<Integer>();

    //Images
    static JLabel picLabel = new JLabel(Pictures.icon1);

    //Random Generator
    static Random random = new Random();

    //Label für Bank und Counter
    static Label bankLabel = new Label();
    static Label counterLabel = new Label();
    static Label questionLabel = new Label();

    //Fonts für die Label
    Font labelFont = new Font(bankLabel.getName(), Font.BOLD, 30);

    //Konstruktor mit super Aufruf
    public QWindow(String title, int width, int hight)
    {
        super(title, width, hight);

        frame.add(questionLabel);
        questionLabel.setVisible(true);
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setFont(labelFont);


        //Counter (Bank) wird nicht angezeigt zählt aber im Hintergrund mit
       /*
        frame.add(bankLabel);
        bankLabel.setVisible(true);
        bankLabel.setForeground(Color.MAGENTA);
        bankLabel.setFont(labelFont);
        bankLabel.setLocation(100,100); */

        frame.add(counterLabel);
        counterLabel.setVisible(true);
        counterLabel.setForeground(Color.WHITE);
        counterLabel.setFont(labelFont);

        frame.add(picLabel);
        picLabel.setVisible(true);

        Questions.initializeArr();

        displayBank();
        frame.setVisible(true);
        nextQuestions();


    }

    //Setter für Bank
    public static void setBank(int inputBank)
    {
        bank = inputBank;
    }

    //Getter für Bank
    public static int getBank() {return bank;}

    public static int getCounter(){return counter;}

    public static void setCounter(int inputCounter){counter = inputCounter;}

    public static void displayBank()
    {
        bankLabel.setText(Integer.toString(bank));
        counterLabel.setText("Bank: " + Integer.toString(counter));
    }

    public static void nextQuestions()
    {
        do {
            count = random.nextInt(Questions.questionsAnswersArr.length);
        }while((oldNum.contains(count)));

         questionLabel.setText(Questions.questionsAnswersArr[count][0]);
         Awindow.answerLabel.setText(Questions.questionsAnswersArr[count][1]);
         oldNum.add(count);
         setImage(bank);
    }

    public static void setImage(int num)
    {
        switch (num)
        {
            case 0: picLabel.setIcon(Pictures.icon1); break;
            case 1: picLabel.setIcon(Pictures.icon1); break;
            case 2: picLabel.setIcon(Pictures.icon2); break;
            case 4: picLabel.setIcon(Pictures.icon3); break;
            case 6: picLabel.setIcon(Pictures.icon4); break;
            case 9: picLabel.setIcon(Pictures.icon5); break;
            case 12: picLabel.setIcon(Pictures.icon6); break;
            case 15: picLabel.setIcon(Pictures.icon7); break;
            case 18: picLabel.setIcon(Pictures.icon8); break;
            case 21: picLabel.setIcon(Pictures.icon9); break;
            case 25: picLabel.setIcon(Pictures.icon10); break;
            default: picLabel.setIcon(Pictures.icon10);
        }
    }


}
