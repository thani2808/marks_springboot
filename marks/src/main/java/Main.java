import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.marks.marks.DatabaseMark;
import com.marks.marks.Mark;
import com.marks.marks.MarkDAO;
import com.marks.marks.MarkDAOImpl;


public class Main {
	public static void main(String[] args) throws SQLException {
		/*Mark mark = new Mark(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(mark);
		*/
		
		//Connection check
		/*Connection connection = DatabaseMark.getConnection();
		if (connection !=null) {
			System.out.println("Database connected");
		}*/
		
		//Get data in database
		/*MarkDAO markDAO = new MarkDAOImpl();
		Mark mark = markDAO.get(2);
		System.out.println(mark);
		*/
		
		//fetch all records in the database
		/*MarkDAO markDAO = new MarkDAOImpl();
		List<Mark> fetchmark = markDAO.getall();
		for (int i=0;i < fetchmark.size();i++) {
			System.out.println(fetchmark.get(i).getStudent_id());
			List<Mark> resultlist = fetchmark;
			System.out.println(resultlist);
		}
		*/
		
		//insert the record in database
		/*MarkDAO markDAO = new MarkDAOImpl();
		Mark mark = new Mark(3, 3, 10,20,30,40,50,3);
		int result = markDAO.insert(mark);
		System.out.println(result);
		}*/
		
		//update the record in database
		/*MarkDAO markDAO = new MarkDAOImpl();
		Mark mark = new Mark(1,5,500,600,700,800,900,3);
		int result = markDAO.update(mark);
		System.out.println(result);
		*/
		
		//delete the record in database
		MarkDAO markDAO = new MarkDAOImpl();
		Mark mark = markDAO.get(2);
		System.out.println(mark);
		int result = markDAO.delete(mark);
		System.out.println(result);
	
	}
		
			
}
