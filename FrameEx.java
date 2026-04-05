import javax.swing.*;
import java.awt.*;

class FrameEx {
    public static void main(String[] args) {
        //Frame properties
        //JFrame =GUI window to add components to
        JFrame frame =new JFrame();//creates a frame
        frame.setTitle("Java Programming");//set the title to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420,420); //set the x-dimensions and y-dimensions of frame
        frame.setVisible(true);//make frame visible

        ImageIcon image=new ImageIcon("imagetitle.png");//create an imagination
        frame.setIconImage(image.getImage()); //change icon of frame

        //two ways of changing the background
       // frame.getContentPane().setBackground(Color.green);//change color to the background
       // frame.getContentPane().setBackground(new Color(0,0,255));
        frame.getContentPane().setBackground(new Color(0x123456));


    }
}