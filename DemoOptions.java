import javax.swing.JOptionPane;

public class DemoOptions{
    public static void main(String[] args)
    {
        // JOptionPane.showInputDialog(null,"Learning swing Helps you",
        // null,JOptionPane.QUESTION_MESSAGE);

        // int res = JOptionPane.showConfirmDialog(null,"Are you sure to delete?","confirm",
        // JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(res);

        // String name = JOptionPane.showInputDialog("Enter your name:");
        // System.out.println("Hello " + name);
        
        String option[] = {"java","python","c++"};
        JOptionPane.showOptionDialog(null,"Which language do you prefer?",
        "Select language",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,0);
    }
}