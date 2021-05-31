package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.LichHoc;

public class LichHocDaoImpl implements LichHocDao {

	@Override
	public void add(LichHoc lichHoc) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "Insert into lichhoc(tenmonhoc,nhommonhoc,thu,kip,phong,tuan,kihoc,idsinhvien) value(?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, lichHoc.getTenMonHoc());
			preparedStatement.setString(2, lichHoc.getNhomMonHoc());
			preparedStatement.setString(3, lichHoc.getThu());
			preparedStatement.setInt(4, lichHoc.getKip());
			preparedStatement.setString(5, lichHoc.getPhong());
			preparedStatement.setString(6, lichHoc.getTuan());
			preparedStatement.setString(7, "hè");
			preparedStatement.setString(8, lichHoc.getIdSinhVien());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void add1(LichHoc lichHoc) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "Insert into lichhoc(tenmonhoc,nhommonhoc,thu,kip,phong,tuan,kihoc,idsinhvien) value(?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, lichHoc.getTenMonHoc());
			preparedStatement.setString(2, lichHoc.getNhomMonHoc());
			preparedStatement.setString(3, lichHoc.getThu());
			preparedStatement.setInt(4, lichHoc.getKip());
			preparedStatement.setString(5, lichHoc.getPhong());
			preparedStatement.setString(6, lichHoc.getTuan());
			preparedStatement.setString(7, lichHoc.getKiHoc());
			preparedStatement.setString(8, lichHoc.getIdSinhVien());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
