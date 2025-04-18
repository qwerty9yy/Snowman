import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Circle {
    private int x;
    private int y;
    private int sizes;
    private int sizesH;

    public Circle(int x, int y, int sizes){
        this.x = x;
        this.y = y;
        this.sizes = sizes;
    }

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Circle(int x, int y, int sizes, int sizesH){
        this.x = x;
        this.y = y;
        this.sizes = sizes;
        this.sizesH = sizesH;
    }

    public void drawCircle(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Заливка круга (внутренняя часть)
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, sizes, sizes);

        // Контур круга (обводка)
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5)); // Толщина линии 5 пикселей
        g2d.drawOval(x, y, sizes, sizes);
    }

    public void drawCircleSmall(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, 10, 10);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(x, y, 10, 10);
    }
    public void drawCircleEye(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, 15, 15);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(x, y, 15, 15);
    }
    public void drawHat(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RoundRectangle2D rectangle2D = new RoundRectangle2D.Double(x, y, sizes, sizesH, 20, 20);
        g2d.setColor(Color.WHITE);
        g2d.fill(rectangle2D);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(rectangle2D);
    }
    public void drawRE(Graphics2D g2d){

    }
}
