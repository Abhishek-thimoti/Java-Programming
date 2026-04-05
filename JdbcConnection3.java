    import java.sql.*;
    public class JdbcConnection3{
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
        String query1 = "SELECT * FROM student";
        ResultSet res = st.executeQuery(query1);
        System.out.println("ID\tName\tBranch");
        System.out.println("--------------------------");
        while(res.next()){
            System.out.println(res.getInt("ID")+"\t"+res.getString("Name")+"\t"+res.getString("Branch"));
        }
        //close the connection
        con.close();
    }
    }