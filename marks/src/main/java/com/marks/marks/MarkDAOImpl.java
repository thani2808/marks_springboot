package com.marks.marks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MarkDAOImpl implements MarkDAO{

	@Override
	public Mark get(int id) throws SQLException {
		Connection connection = DatabaseMark.getConnection();
		Mark mark = null;
		
		String sql = "SELECT mark_id, student_id, tamil, english, maths, science, social_science, term_id FROM marks WHERE mark_id = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next ()) {
			int omark_id = rs.getInt("mark_id");
			int student_id = rs.getInt("student_id");
			int tamil = rs.getInt("tamil");
			int english = rs.getInt("english");
			int maths = rs.getInt("maths");
			int science = rs.getInt("science");
			int social_science = rs.getInt("social_science");
			int term_id = rs.getInt("term_id");
			
			mark = new Mark(omark_id, student_id, tamil, english, maths, science, social_science, term_id);
		}
		rs.close();
		ps.close();
		DatabaseMark.closeConnection(connection);
		
		return mark;
	}

	@Override
	public List<Mark> getall() throws SQLException {
		Connection connection = DatabaseMark.getConnection();
		int mark_id = 1;
		Mark mark = null;
		List<Mark> listMark = new ArrayList<Mark>();
		
		String sql = "SELECT mark_id, student_id, tamil, english, maths, science, social_science, term_id FROM marks WHERE mark_id = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, 1);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next ()) {
			
			int omark_id = rs.getInt("mark_id");
			int student_id = rs.getInt("student_id");
			int tamil = rs.getInt("tamil");
			int english = rs.getInt("english");
			int maths = rs.getInt("maths");
			int science = rs.getInt("science");
			int social_science = rs.getInt("social_science");
			int term_id = rs.getInt("term_id");
			
			mark = new Mark(omark_id, student_id, tamil, english, maths, science, social_science, term_id);
			
			listMark.add(mark);
			
		}
		rs.close();
		ps.close();
		DatabaseMark.closeConnection(connection);
		
		return listMark;
	}

	@Override
	public int save(Mark mark) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Mark mark) throws SQLException {
		Connection connection = DatabaseMark.getConnection();
		
		String sql = "insert into marks (mark_id, student_id, tamil, english, maths, science, social_science, term_id) values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, mark.getMark_id());
		ps.setInt(2, mark.getStudent_id());
		ps.setInt(3, mark.getTamil());
		ps.setInt(4, mark.getEnglish());
		ps.setInt(5, mark.getMaths());
		ps.setInt(6, mark.getScience());
		ps.setInt(7, mark.getSocial_science());
		ps.setInt(8, mark.getTerm_id());

		int result = ps.executeUpdate();
		
		ps.close();
		DatabaseMark.closeConnection(connection);
		
		return result;
	}

	@Override
	public int update(Mark mark) throws SQLException {
		Connection connection = DatabaseMark.getConnection();
		
		String sql = "update marks set student_id = ?, tamil = ?, english = ?, maths = ?, science = ?, social_science = ?, term_id = ? where mark_id = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, mark.getStudent_id());
		ps.setInt(2, mark.getTamil());
		ps.setInt(3, mark.getEnglish());
		ps.setInt(4, mark.getMaths());
		ps.setInt(5, mark.getScience());
		ps.setInt(6, mark.getSocial_science());
		ps.setInt(7, mark.getTerm_id());
		ps.setInt(8, mark.getMark_id());
		
		int result = ps.executeUpdate();
		
		ps.close();
		DatabaseMark.closeConnection(connection);
		
		return result;
	}

	@Override
	public int delete(Mark mark) throws SQLException {
		Connection connection = DatabaseMark.getConnection();
		
		String sql = "delete from marks where mark_id = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, mark.getMark_id());
		
		int result = ps.executeUpdate();
		
		ps.close();
		DatabaseMark.closeConnection(connection);
		
		return result;
	}

}
