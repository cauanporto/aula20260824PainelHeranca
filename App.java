import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add( panel );
        application.setSize( 225, 225 );
        application.setVisible( true );
    }
}
