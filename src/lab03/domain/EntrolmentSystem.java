package lab03.domain;
import java.util.ArrayList;

/**
 * Created 3/8/18.
 */
public class EntrolmentSystem {

    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Enrolment> enrolments;

    	public EntrolmentSystem() {
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        enrolments = new ArrayList<Enrolment>();
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public String displayCourses() {
        StringBuilder sb = new StringBuilder();
        sb.append("Courses are:\n");
        for (Course course : courses) {
            sb.append(course.toString()).append("\n");
        }
        String result = new String(sb);
        System.out.println(result);
        return result;
    }

    public void displayCourseOfferings(String year, String term) {
        // to be completed
    }

    public ArrayList<CourseOffering> listCourseOfferings(String year, String term) {
        ArrayList<CourseOffering> offerings = new ArrayList<>();
        // to be completed

        return offerings;
    }

    public Enrolment enrolStudent(Student student, CourseOffering co) {
    	// to be completed
    	return null;
    }
    
}
