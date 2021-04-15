package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import connection.DBConnection;
import persistence.Item;
import utils.SqlUtils;

public class ItemDao {
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement preStatement;
	private static ResultSet rs;
	
	static {
		conn = DBConnection.getConnection();
	}
	
	public List<Item> getItems(int igrId, double saleFrom, double saleTo){
		List<Item> result = new ArrayList<>();
		String sql = "SELECT MaMH, TenMH, GiaBan, GiaMua" + 
				" FROM MatHang" + 
				" WHERE MaLoai = " + igrId +
				" AND Giaban BETWEEN " + saleFrom + " AND " + saleTo;
		String sql1 = "SELECT MaMH, TenMH, GiaBan, GiaMua" + 
				" FROM MatHang" + 
				" WHERE MaLoai = ?"+
				" AND Giaban BETWEEN ? AND ?";
		
		try {
			preStatement = conn.prepareStatement(sql1);
			preStatement.setInt(1, igrId);
			preStatement.setDouble(2, saleFrom);
			preStatement.setDouble(3, saleTo);
			rs = preStatement.executeQuery();
			while(rs.next()) {
				result.add(new Item(rs.getInt("MaMH")
									, rs.getString("TenMH")
									, rs.getDouble("GiaBan")
									, rs.getDouble("GiaMua")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, preStatement);
		}
		return result;
	}
	
	public List<Item> getItems(String igrName){
		List<Item> result = new ArrayList<>();
 		String sql1 = "SELECT MaMH, TenMH, GiaBan, GiaMua\n" + 
				" FROM MatHang\n" + 
				" WHERE MaLoai =\n"+
				" (SELECT MaLoai FROM LoaiHang WHERE TenLoai LIKE ?)";
		
		try {
			preStatement = conn.prepareStatement(sql1);
			preStatement.setString(1, igrName);
			
			rs = preStatement.executeQuery();
			while(rs.next()) {
				result.add(new Item(rs.getInt("MaMH")
									, rs.getString("TenMH")
									, rs.getDouble("GiaBan")
									, rs.getDouble("GiaMua")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, preStatement);
		}
		return result;
	}

}
