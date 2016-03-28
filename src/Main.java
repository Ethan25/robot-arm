import javax.swing.*;
import java.awt.*;



//i changed some code yo
public class Main extends JFrame {

    public Main() {
        setTitle("Robot Arm");
        setSize(1000, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Arm arm1 = new Arm(300, 300, 0, 10, 200, 50);
        Main window = new Main();

        //Testing:
        arm1.print();

    }

    public void paint(Graphics g) {

        Arm.draw(g);

    }

}