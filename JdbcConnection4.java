    import java.sql.*;
    public class JdbcConnection4{
    public static void main(String[] args) throws Exception{
        //register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //get connection
        String url,username,password;
        //command to enter in cmd ---> mysql -u root -p
        //password:root
        //create database--->create database jdbcdb;
        url="jdbc:mysql://localhost:3306/jdbcdb";
        username="root";
        password="root";
        Connection con=DriverManager.getConnection(url,username,password);
        if(con!=null)
        {
            System.out.println("Connected sucessfully");
        }
        else{
            System.out.println("Connection failed");
        }
        //create statemnet object
        Statement st=con.createStatement();
        //execute a query
        //executeUpdate-->CREATE,INSERT,UPDATE,DELETE,ALTER
        //executeQuery-->SELECT
        //execute
        String query1 = "INSERT INTO student VALUES(?,?,?)";
        PreparedStatement ps = con.prepareStatement(query1);
        ps.setInt(1, 3);
        ps.setString(2, "Surya");
        ps.setString(3, "IT");
        ps.executeUpdate();
        
        ps.setInt(1, 4);
        ps.setString(2, "Gowtham");
        ps.setString(3, "IOT");
        ps.executeUpdate();
        System.out.println("Data inserted using PreparedStatement");
        //close the connection
        con.close();
    }
    }