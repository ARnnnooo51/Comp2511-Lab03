package lab03.domain;
import java.util.ArrayList;

/**
 * Maintains all the courses offered in the university
 * Created 4/8/2018
 */
public class Course {

    private String courseCode;
    private ArrayList<Course> prereqs;

    // Complete the implementation of this class - to add the missing fields and methods
    // The implementation of this class must conform to your class diagram

    public Course(String courseCode) {
        this.courseCode = courseCode;
        this.prereqs = new ArrayList<Course>();
    }

    
    public void addPrereq(Course course) {
        prereqs.add(course);
    }

    @Override
    public String toString() {
        return courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

}
