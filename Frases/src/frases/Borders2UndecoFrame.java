package frases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Borders2UndecoFrame extends JFrame{
    JLabel label = new JLabel("Welcome!", JLabel.CENTER);
    public Borders2UndecoFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(200, 200));
        add(label, BorderLayout.CENTER);
        setUndecorated(true);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
        setVisible(true);

    }
    public static void main(String[] args) {
        new Borders2UndecoFrame();
    }

} 