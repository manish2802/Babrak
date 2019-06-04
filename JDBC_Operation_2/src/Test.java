import com.asthvinayak.dao.StudentDAO;
import com.asthvinayak.model.Student;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {

		
		StudentDAO sd= StudentDAO.getInstance();

	   sd.insertInfo(new Student("1009","VVV","NNNAf","55555")); 
	   /* sd.insertInfo(new Student("1007","VVV","NNNAf","666666"));
	    sd.insertInfo(new Student("1008","VVV","NNNAf","55555"));*/
		
		 //List<Student> ll=	 sd.getAllStudentInfo();
		 //System.out.println(ll);
		
		//Student ss=sd.getStudentInfo("101");
		//System.out.println(ss);

	}

    }
