package employee.management.system;

import javax.swing.*;

public class Login extends JFrame {

    Login(){
        //jlable is used for show text in frame and also used for image in the splash(previous file) 
        JLabel username = new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);



        //to create layouut and put centre on the screen
        setSize(600, 300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Login();

    
    }
}
