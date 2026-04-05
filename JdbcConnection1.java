import java.sql.*;
public class JdbcConnection1{
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
    String query="CREATE TABLE student("+
                 "id int,"+
                 "name varchar(150),"+
                 "branch varchar(150))";
    st.executeUpdate(query);
    System.out.println("Table created");
    //close the connection
    con.close();
}
}