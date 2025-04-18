import javax.swing.*;

public class Main{
    public static void main(String[] args){
        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(700, 700);
        f.setSize(700, 700);
        f.setTitle("Снеговик");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}