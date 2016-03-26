/**
 * Created by Ethan on 3/24/2016.
 */

import javax.swing.*;
import java.awt.*;

public class Arm {

    static Joint joint;

    static Line line1, line2;
    static double radius, center_x, center_y, arm_length, current_angle;

    public Arm(double x, double y, double angle, double width, double length, double joint_size) {
        joint = new Joint(x, y, joint_size);

        radius = joint_size / 2;
        center_x = x + radius;
        center_y = y + radius;
        arm_length = length;
        current_angle = angle;

        double l1_x1 = center_x + (radius * Math.cos(current_angle + Math.PI / 4));
        double l1_x2 = center_x + (radius * Math.cos(current_angle + Math.PI / 4) + arm_length * Math.cos(current_angle));
        double l1_y1 = center_y - (radius * Math.sin(current_angle + Math.PI / 4));
        double l1_y2 = center_y - (radius * Math.sin(current_angle + Math.PI / 4) + arm_length * Math.sin(current_angle));
        line1 = new Line(l1_x1, l1_x2, l1_y1, l1_y2);

        double l2_x1 = center_x + (radius * Math.cos(current_angle - Math.PI / 4));
        double l2_x2 = center_x + (radius * Math.cos(current_angle - Math.PI / 4) + arm_length * Math.cos(current_angle));
        double l2_y1 = center_y - (radius * Math.sin(current_angle - Math.PI / 4));
        double l2_y2 = center_y - (radius * Math.sin(current_angle - Math.PI / 4) + arm_length * Math.sin(current_angle));
        line2 = new Line(l2_x1, l2_x2, l2_y1, l2_y2);
    }

    public static void pivot(double angle, double speed) {


    }

    public static void draw(Graphics g) {
        g.drawOval((int) joint.x, (int) joint.y, (int) joint.size, (int) joint.size);
        g.drawLine((int) line1.x1, (int) line1.y1, (int) line1.x2, (int) line1.y2);
        g.drawLine((int) line2.x1, (int) line2.y1, (int) line2.x2, (int) line2.y2);
    }

    public static void print() {
        System.out.println("Joint x:  " + joint.x + " y:  " + joint.y + " size: " + joint.size);
        System.out.println("Line1 x1: " + line1.x1 + " x2: " + line1.x2 + " y1: " + line1.y1 + " y2: " + line1.y2);
        System.out.println("Line2 x1: " + line2.x1 + " x2: " + line2.x2 + " y1: " + line2.y1 + " y2: " + line2.y2);
    }
}
