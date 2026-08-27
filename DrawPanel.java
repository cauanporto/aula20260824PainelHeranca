import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int samples = 15;
        int coeficiente_width = width / samples;
        int coeficiente_height = height / samples;        

        for (int i = 0; i <= samples; i++) {
            //Diagonal principal
            g.drawLine ((i*coeficiente_width), 0, 0, (height - i*coeficiente_height));
            g.drawLine ((i*coeficiente_width), height, width, (height - i*coeficiente_height));
            //Diagonal secundária
            g.drawLine ((i*coeficiente_width), height, 0, (i*coeficiente_height));
            g.drawLine ((i*coeficiente_width), 0, width, (i*coeficiente_height));
        }
    }
}