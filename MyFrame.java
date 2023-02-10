import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener {

    private JButton ok;

    public MyFrame (){

        ok = new JButton("ok");
        ok.addActionListener(this);
        add(ok);
        setSize(200,100);
        setVisible(true);
    }
    
    @Override

    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed");
    }

    public static void main(String[] args) {

        new MyFrame();
        
    }
}
