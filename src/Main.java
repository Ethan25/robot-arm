import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

    public Main() {
        setTitle("Robot Arm");
        setSize(1000, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Main window = new Main();
        Arm arm1 = new Arm(300, 300, 0, 10, 200, 50);

        //Testing:
        arm1.print();

    }

    public void paint(Graphics g) {

        Arm.draw(g);

    }

}