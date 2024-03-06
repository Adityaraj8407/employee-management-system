package employee.management.system;

import java.awt.Image;

import javax.swing.*;
public class splash extends JFrame{

   splash(){

    ImageIcon i1 = new ImageIcon("icons/front.gif"); 
    Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 1170, 650);
    add(image);

    setSize(1170, 650);
    setLocationRelativeTo(null);// open app in the centre of the screen
    setLayout(null);
    setVisible(true);

    try {
        Thread.sleep(5000);
        setVisible(false);
        new Login();
    } catch (Exception e) {
        e.printStackTrace();
    }
   }

    public static void main(String[] args) {
        new splash();

    }
}