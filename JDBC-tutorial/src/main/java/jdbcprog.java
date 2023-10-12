import java.sql.*;

public class jdbcprog {

	public static void main(String[] args) {

		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Kuku@123");
			System.out.print("connection done");
			
//			PreparedStatement ps =conn.prepareStatement("insert into students (name, age, email)values ('raja ram', 20, 'ramm@example.com')");
			
			PreparedStatement ps =conn.prepareStatement("SELECT * FROM student_db.students");
			
//			PreparedStatement ps =conn.prepareStatement("delete FROM students where id='4'");

//			ps.execute();
			System.out.println("");
//			System.out.println("data inserted");
			
			ResultSet rs=ps.executeQuery();  
			while(rs.next()) {  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception");
		}
	}
}
