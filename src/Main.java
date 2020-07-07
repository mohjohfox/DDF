public class Main {

    public static void main(String[] args)
    {
        //Erstellt ein Answer Window mit den Parametern Title, Breite und Höhe des Fensters
        Awindow answerWindow = new Awindow("Answer Window", 500,500);
        QWindow questionWindow = new QWindow("Question Window", 500,500);

        //Fügt spezifische Buttons in den Fenstern hinzu
        answerWindow.addButton();
    }

}
