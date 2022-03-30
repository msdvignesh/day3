package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FriendDAOImpl implements FriendDAO {
	
	ArrayList<Friend> friendList;
	
	Connection conn;

	FriendDAOImpl() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery("CREATE TABLE FRIEND (\r\n"
					+ "FRIEND_ID INTEGER,\r\n"
					+ "FRIEND_NAME VARCHAR(20),\r\n"
					+ "FRIEND_RELATIONSHIP VARCHAR(20));");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
//			}

		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}

	@Override
	public void create(Friend friend) {
		
		
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int friend_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Friend select(int friend_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Friend> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
