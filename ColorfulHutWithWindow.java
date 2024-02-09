import javax.swing.*;
import java.awt.*;

public class ColorfulHutWithWindow extends JFrame {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.yellow);

        g.fillRect(50, 150, 200, 100);

        g.setColor(Color.red);

        int[] xPoints = { 50, 150, 250 };
        int[] yPoints = { 150, 50, 150 };
        int nPoints = 3;
        g.fillPolygon(xPoints, yPoints, nPoints);

        g.setColor(Color.white);

        g.fillRect(100, 170, 80, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colorful Hut with Window Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        ColorfulHutWithWindow hutDrawing = new ColorfulHutWithWindow();
        frame.add(hutDrawing);

        frame.setVisible(true);
    }
}
