import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SatWork {
    public static Connection con;

    public static void main(String[] args) {
        // ===== DB Connection =====
        try {
            String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
            String dbUser = "root";
            String dbPassword = "root";

            con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("Connected Successfully");
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        }

        // ===== Frame Setup =====
        JFrame frame = new JFrame("Patient Appointment Details Form");
        frame.setSize(525, 550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== Font =====
        Font font = new Font("Times New Roman", Font.BOLD, 15);

        // ===== Labels =====
        JLabel P_id = new JLabel("Enter Patient ID : ");
        P_id.setFont(font);
        P_id.setBounds(50, 20, 150, 30);
        frame.add(P_id);

        JLabel P_name = new JLabel("Enter Patient Name : ");
        P_name.setFont(font);
        P_name.setBounds(50, 70, 150, 30);
        frame.add(P_name);

        JLabel P_phNum = new JLabel("Enter Patient Phone Number : ");
        P_phNum.setFont(font);
        P_phNum.setBounds(50, 120, 250, 30);
        frame.add(P_phNum);

        JLabel P_DName = new JLabel("Select Doctor : ");
        P_DName.setFont(font);
        P_DName.setBounds(50, 170, 150, 30);
        frame.add(P_DName);

        JLabel P_age = new JLabel("Enter Patient Age : ");
        P_age.setFont(font);
        P_age.setBounds(50, 220, 150, 30);
        frame.add(P_age);

        JLabel gender = new JLabel("Select Gender : ");
        gender.setFont(font);
        gender.setBounds(50, 270, 150, 30);
        frame.add(gender);

        // ===== TextFields =====
        JTextField p_id = new JTextField();
        p_id.setBounds(300, 20, 150, 30);
        frame.add(p_id);

        JTextField p_name = new JTextField();
        p_name.setBounds(300, 70, 150, 30);
        frame.add(p_name);

        JTextField p_phNum = new JTextField();
        p_phNum.setBounds(300, 120, 150, 30);
        frame.add(p_phNum);

        JTextField p_age = new JTextField();
        p_age.setBounds(300, 220, 150, 30);
        frame.add(p_age);

        // ===== Combo Box =====
        String[] doctors = {"Dr. Pardss", "Dr. Johnny", "Dr. Williams"};
        JComboBox<String> comboDoctor = new JComboBox<>(doctors);
        comboDoctor.setBounds(300, 170, 150, 30);
        frame.add(comboDoctor);

        // ===== Radio Buttons =====
        JRadioButton rMale = new JRadioButton("Male");
        rMale.setBounds(300, 270, 80, 30);
        frame.add(rMale);
        
        JRadioButton rFemale = new JRadioButton("Female");
        rFemale.setBounds(390, 270, 100, 30);
        frame.add(rFemale);
        
        ButtonGroup gp = new ButtonGroup();
        gp.add(rMale);
        gp.add(rFemale);

        // ===== Submit Button =====
        JButton submitButton = new JButton("Submit Patient Details");
        submitButton.setBounds(275, 320, 200, 30);
        frame.add(submitButton);

        // ===== Action Listener =====
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String r = p_id.getText().trim();
                String n = p_name.getText().trim();
                String c = p_phNum.getText().trim();
                String b = comboDoctor.getSelectedItem().toString();
                String a = p_age.getText().trim();
                String g = rMale.isSelected() ? "Male" : rFemale.isSelected() ? "Female" : "";

                if (r.isEmpty() || n.isEmpty() || c.isEmpty() || a.isEmpty() || g.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields (including gender) are required", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    // Validate age is a number
                    int ageValue = Integer.parseInt(a);
                    
                    insertDataToDB(r, n, c, b, ageValue, g);

                    // Clear form after success
                    p_id.setText("");
                    p_name.setText("");
                    p_phNum.setText("");
                    p_age.setText("");
                    comboDoctor.setSelectedIndex(0);
                    gp.clearSelection();
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid numeric age", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set visible LAST to ensure components render correctly
        frame.setVisible(true);
    }

    public static void insertDataToDB(String r, String n, String c, String b, int a, String g) {
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection not established", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO Appointment (p_id, p_name, p_phone, doctor, age, gender) VALUES (?,?,?,?,?,?)";
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, r);
            pt.setString(2, n);
            pt.setString(3, c);
            pt.setString(4, b);
            pt.setInt(5, a);
            pt.setString(6, g);
            
            pt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data inserted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DB Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}