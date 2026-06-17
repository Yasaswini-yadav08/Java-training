package JDBC.Basics;

import java.sql.*;

public class JD {
    private static final String url="jdbc:mysql://localhost:3306/SMS2";
    private static final String user="root";
    private static final String password="Chinni@8104";

    public static void main(String[] args)throws ClassNotFoundException, SQLException  {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st = con.createStatement();
        /*String query = "select * from Students";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            int marks = rs.getInt("marks");
            System.out.println(id);
            System.out.println(name);
            System.out.println(email);
            System.out.println(marks);
        }*/
//        String query = String.format("insert into Students(id,name,email,marks) values(%d, '%s' , '%s' , %d)",3,"Vishnu","vishnu@gmail.com",98);
//        int myRes = st.executeUpdate(query);
//        if(myRes > 0)
//        {
//            System.out.println("Sucess");
//        }
//        else {
//            System.out.println("fail");
//        }
        String query = String.format("update Students SET marks=%d where id=%d",80,2);
        int res = st.executeUpdate(query);
        if(res > 0)
        {
            System.out.println("Sucess");
        }
        else {
            System.out.println("Fail");
        }
        /*String q=String.format("delete from students where id=%d",3);
        int myResult=st.executeUpdate(q);
        if(myResult>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }*/
        st.close();
        con.close();
    }
}