import javax.swing.*;
import java.awt.*;

public class DrawingCanvas extends JComponent {
    private int width;
    private int heigth;

    //Нос
    private int[] xPoints = {360, 358, 600};
    private int[] yPoints = {225, 210, 212};

    //большие шары
    private Circle big = new Circle(225, 400, 250);
    private Circle middle = new Circle(250, 250, 200);
    private Circle small = new Circle(275, 125, 150);

    //Пугоаицы
    private Circle small1 = new Circle(360, 375);
    private Circle small2 = new Circle(360, 350);
    private Circle small3 = new Circle(360, 325);

    //Улыбка
    private Circle small4 = new Circle(367, 242);
    private Circle small5 = new Circle(347, 242);
    private Circle small6 = new Circle(327, 237);
    private Circle small7 = new Circle(387, 237);

    //Глаза
    private Circle eye1 = new Circle(335, 182);
    private Circle eye2 = new Circle(380, 182);

    //Шляпа
    private Circle hat1 = new Circle(295, 20, 110, 125);
    private Circle hat2 = new Circle(295, 110, 110, 35);

    //Руки



    public DrawingCanvas(int w, int h){
        this.width = w;
        this.heigth = h;
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        big.drawCircle(g2d); //вызываю большой круг
        middle.drawCircle(g2d); //вызываю средний круг
        small.drawCircle(g2d); //вызываю маленький круг

        small1.drawCircleSmall(g2d);
        small2.drawCircleSmall(g2d);
        small3.drawCircleSmall(g2d);

        small4.drawCircleSmall(g2d);
        small5.drawCircleSmall(g2d);
        small6.drawCircleSmall(g2d);
        small7.drawCircleSmall(g2d);

        // Заливка треугольника
        g2d.setColor(Color.WHITE);
        g2d.fillPolygon(xPoints, yPoints, 3);

        // Обводка треугольника
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawPolygon(xPoints, yPoints, 3);

        //Глаза
        eye1.drawCircleEye(g2d);
        eye2.drawCircleEye(g2d);

        //Шляпа
        g2d.setColor(Color.WHITE);
        g2d.fillOval(260, 140, 180, 20);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawOval(260, 140, 180, 20);

        hat1.drawHat(g2d);
        hat2.drawHat(g2d);

        //Руки

    }
}
