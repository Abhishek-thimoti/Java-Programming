import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello, this is a new window");
    NewWindow() {
        label.setBounds(0, 0, 100, 150);
        label.setFont(new Font(null, Font.PLAIN, 18));
        frame.add(label);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
