import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels{
    public static void main(String[] args)
    {
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("Twitter bird.jpeg");
        label.setText("Hii");
        label.setIcon(image);


        JPanel greenPanel=new JPanel();
        greenPanel.setBounds(0,0,250,250);
        greenPanel.setBackground(Color.GREEN);

        JPanel redPanel=new JPanel();
        redPanel.setBounds(250,0,250,250);
        redPanel.setBackground(Color.RED);

        JPanel yellowPanel=new JPanel();
        yellowPanel.setBounds(0,250,250,250);
        yellowPanel.setBackground(Color.yellow);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(greenPanel);
        frame.add(yellowPanel);
        frame.add(redPanel);
        yellowPanel.add(label);
    }    
}