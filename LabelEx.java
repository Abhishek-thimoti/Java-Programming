import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LabelEx {
    public static void main(String[] args) {
        //JLabel=a GUI display area for a string of text, an image, or both
        ImageIcon image=new ImageIcon("woman.png");
        Border border=BorderFactory.createLineBorder(Color.green,3);
        JLabel label=new JLabel();//create a label
        label.setText("Java Programming Language");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text CENTER,LEFT,RIGHT of the imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text to TOP,CENTER,BOTTOM of the imageicon
        label.setForeground(new Color(0X00FF00));//set font colour of text
        label.setFont(new Font("MV Boil",Font.PLAIN,20));//set Font of text
        label.setIconTextGap(-15);//setgap of text to image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon + text within the label
        label.setHorizontalAlignment(JLabel.CENTER);//set Horizontal position of icon + text within the label
        //label.setBounds(0, 0, 250,250);//set x,y positions within frame as well as dimensions

        
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}
