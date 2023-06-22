package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Userinfo;

public class UserinfoDAO {

	private static final String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/mybookdb";
	private static final String USER = "root";
	private static final String PASSWD = "root123";

	private static Connection getConnection() {

		try{
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		}catch(Exception e){
			throw new IllegalStateException(e);
		}
	}

	public Userinfo selectByUser(String userid) {
		Connection con = null;
		Statement smt = null;

		Userinfo user = new Userinfo();

		try {

			String sql = "SELECT * FROM userinfo WHERE isbn = '" + userid + "'";
			con = UserinfoDAO.getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setNickname(rs.getString("nickname"));
				user.setAddress(rs.getString("address"));
				user.setName(rs.getString("name"));
				user.setExhibit(rs.getString("exhibit_flag"));
				user.setAuthority(rs.getString("authority_flag"));
			}
			return user;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

	public Userinfo selectByUser(String userid, String password) {
		Connection con = null;
		Statement smt = null;

		Userinfo user = new Userinfo();

		try {

			String sql = "SELECT * FROM userinfo WHERE user='" + userid + "' AND password='" + password + "'";
			con = UserinfoDAO.getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setNickname(rs.getString("nickname"));
				user.setAddress(rs.getString("address"));
				user.setName(rs.getString("name"));
				user.setExhibit(rs.getString("exhibit_flag"));
				user.setAuthority(rs.getString("authority_flag"));
			}
			return user;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}
}
