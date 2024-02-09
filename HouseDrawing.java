import javax.swing.*;
import java.awt.*;

public class HouseDrawing extends JFrame {
    public HouseDrawing() {
        setTitle("Windows-Style House Drawing");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.pink);
        g.fillRect(250, 400, 300, 250);

        int xPoints[] = { 250, 400, 550 };
        int yPoints[] = { 400, 250, 400 };

        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(Color.gray);

        g.fillRect(350, 500, 100, 150); 
        g.setColor(Color.RED);

        g.fillRect(280, 480, 30, 30);
        g.setColor(Color.GREEN);

        g.fillRect(310, 480, 30, 30);
        g.setColor(Color.BLUE);

        g.fillRect(280, 510, 30, 30);
        g.setColor(Color.YELLOW);

        g.fillRect(310, 510, 30, 30);
        g.setColor(Color.BLACK);

    }

    public static void main(String[] args) {
        new HouseDrawing();
    }

}