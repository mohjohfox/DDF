public class Main {

    public static void main(String[] args)
    {
        Awindow answerWindow = new Awindow();
        QWindow questionWindow = new QWindow();

        //Erstellt ein Answer Window mit den Parametern Title, Breite und Höhe des Fensters
        answerWindow.createWindow("Answer Window", 500,500);
        answerWindow.addButton();
    }

}
