package lab03.test;


import lab03.domain.Course;
import lab03.domain.EntrolmentSystem;

public class EnrolSystemMain {

	    public static void main(String[] args) {
	        EntrolmentSystem enrolSys = new EntrolmentSystem();

	        // Create a course
	        Course comp1511 = new Course("COMP1511");
	        Course comp1531 = new Course("COMP1531");
	        comp1531.addPrereq(comp1511);
	        Course comp2521 = new Course("COMP2521");
	        comp2521.addPrereq(comp1531);
	        comp2521.addPrereq(comp1511);        
	        
	        // Add your code to create additional test data
	        // You will need to:
	        // (i)  create course-offerings for each course and sessions to the course-offering
	        // (ii) add a student
	        // (iii)create an enrolment for the student in COMP1511. The enrolment should succeed as COMP1511 has no pre-requisites
	        // (iv) create an enrolment for the student in COMP1531. This enrolment should succeed as COMP1531 has one pre-requisite COMP1511
	        //      which the student has completed
	        // (v)  create an enrolment for COMP2521. This should fail as pre-requisites are not met.
	     
	        // Add courses to the enolment system
	        
	        enrolSys.addCourse(comp1531);
	        enrolSys.addCourse(comp2521);
	        enrolSys.addCourse(comp1511);
	        
	        // Display courses in system
	        enrolSys.displayCourses();

	        // Display course offerings for a particular semester
	        enrolSys.displayCourseOfferings("2018", "s2");
	    }
}
