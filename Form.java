import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Form {

    public static Connection con;

    public static void main(String[] args) throws Exception {


        // ===== DB Connection =====
        String dbURL = "jdbc:mysql://localhost:3306/swingdb";
        String dbUser = "root";
        String dbPassword = "root";

        con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        System.out.println("Connected Successfully");

        // ===== Frame =====
        JFrame frame = new JFrame("Student Data Entry");
        frame.setSize(520, 550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Font font=new Font("comic sans Ms",Font.BOLD,18);
        //== Lable ====
        JLabel roll=new JLabel("Enter your roll number");
        roll.setBounds(10,20,250,30);
        roll.setFont(font);
        frame.add(roll);

        JLabel name=new JLabel("Enter your name");
        name.setBounds(10,70,250,30);
        name.setFont(font);
        frame.add(name);

        JLabel college=new JLabel("Enter your college");
        college.setBounds(10,120,250,30);
        college.setFont(font);
        frame.add(college);

        JLabel branch=new JLabel("select your branch");
        branch.setBounds(10,170,250,30);
        branch.setFont(font);
        frame.add(branch);

        JLabel age=new JLabel("Enter your age");
        age.setBounds(10,220,250, 30);
        age.setFont(font);
        frame.add(age);

        JLabel  gender=new JLabel("Select gender");
        gender.setBounds(10,270,250,30);    
        gender.setFont(font);
        frame.add(gender);  

        //== TextField ===
        //roll number
        JTextField tf1=new JTextField();
        tf1.setBounds(270,20,220,30);
        frame.add(tf1);
        //name
        JTextField tf2=new JTextField();
        tf2.setBounds(270,70,220,30);
        frame.add(tf2);
        //college
        JTextField tf3=new JTextField();
        tf3.setBounds(270,120,220,30);
        frame.add(tf3);
        //age
        JTextField tage=new JTextField();
        tage.setBounds(270,220,220,30);
        frame.add(tage);
        //== combo box ===
        String  branchs[]={"CSE","ECE","AIML","DS","IT"};
        JComboBox<String> comboBranch=new JComboBox<>(branchs);
        comboBranch.setBounds(270,170,220,30);
        frame.add(comboBranch);
        
        //=== Radio Buttons ===
        JRadioButton rMale=new JRadioButton("Male");
        rMale.setBounds(270,270,80,30);
        JRadioButton rFemale=new JRadioButton("Female");
        rFemale.setBounds(360,270,100,30);
        ButtonGroup gp=new ButtonGroup();
        gp.add(rMale);
        gp.add(rFemale);
        frame.add(rMale);
        frame.add(rFemale);
        //== Button ===
        JButton button =new JButton("Submit");
        button.setBounds(320,350,160,50);
        button.setFont(new Font("comic sans MS",Font.BOLD,26));
        button.setFocusable(false);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String r=tf1.getText().trim();
                String n=tf2.getText().trim();
                String c=tf3.getText().trim();
                String b=comboBranch.getSelectedItem().toString();
                String a=tage.getText().trim();
                String g=rMale.isSelected()?"Male":
                         rFemale.isSelected()?"Female":"";
                if(r.isEmpty()||n.isEmpty()|| c.isEmpty()||a.isEmpty())
                    {
                        JOptionPane.showMessageDialog
                        (frame,"Required data missing","Error",
                        JOptionPane.ERROR_MESSAGE);
                        return;
                    } 
                    insertDataToDB(r,n,c,b,a,g);//method to store data to db
                    //clear form
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tage.setText("");
                    comboBranch.setSelectedItem(0);
                    gp.clearSelection();
            }
        });


    }
    public static void insertDataToDB
    (String r,String n,String c,String b,String a,String g)
    {
        try{
            String sql="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
            PreparedStatement pt=con.prepareStatement(sql);
            pt.setString(1, r);
            pt.setString(2, n);
            pt.setString(3, c);
            pt.setString(4, b);
            pt.setInt(5,Integer.parseInt(a));
            pt.setString(6, g);
            pt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data inserted sucessfully"
            ,"success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
