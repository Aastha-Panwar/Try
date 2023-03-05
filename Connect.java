import java.sql.*;
public class Connect
{
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3307//database_name";
        String uname="root";
        String pw="";

        //when we insert using variables, but this is not best ways to insert so we use PreparedStatement
        String userid="1";
        String username="Aastha";

        String query = "insert into stud values(" + userid + ",'" + username + "')"; //to insert value not from mysql

        // when use prepared statement
        String query = "insert into stud values(?, ?)";



       // String query = "select username from stud where user id=3";
        String query = "select * from stud";  // print all the data in table form
        String query = "insert into stud values(4, "Panwar")"; //to insert value not from mysql

        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(url, uname,);
        // Statement st = con.createStatement();  //normal statement

        //PreparedStatement

        PreparedStatement st = con.prepareStatement(query);  //used when we know the query but don't know the values
        st.setInt(1, userid);
        st.setString(2, username);
        int count = st.executeQuery();
        System.out.println(count + "row/s affected");


        ResultSer rs = st.executeQuery(query);  //DDL, DML, DQL

        ResultSer rs = st.executeUpdate(query);   //used for insert, update and delete the data(return int value;no. of row affected)
        System.out.println(count + "row/s affected");


        //rs.next();
        //String name = rs.getString("username");

        rs.next();
        String name = rs.getInt(1) + ":" + rs.getString(2);
        System.out.println(userData);

        rs.next();
        String name = rs.getInt(1) + ":" + rs.getString(2);
        System.out.println(userData);

        //instead of writing above code to fetch all table again and again we use it in a while loop

        while(rs.next())
        {
            String name = rs.getInt(1) + ":" + rs.getString(2);
            System.out.println(userData);
        }


        //System.out.println(name);

        st.close();
        con.close();
    }
}