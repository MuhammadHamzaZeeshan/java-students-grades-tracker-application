package stdgradestrackerapp;
import java.util.ArrayList;
import java.util.Scanner;



public class Course {
	protected String courseName;
	private ArrayList<Student> students = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	// Constructor to initialize course name:
	public Course() {
		System.out.print("Enter the name of course: ");
		this.courseName = sc.nextLine();
	}
	
	
	// Method to add a student:
	public void addStudent(Student student) {
		students.add(student);
		
	    }
	    
	
	// Method to remove the specified student from the list:
	public void removeStudent(Student student) {
		students.remove(student);
	    }
	
	// Returns a list of students enrolled in the course:
	public void getEnrolledStudents(){
		for(Student student : students) {
			System.out.println(student);
		}
	}
	
	// Returns information about course:
	public void getCourseInfo(){
		System.out.print("Course Name: " + courseName + "\n");
		getEnrolledStudents();
	}

}
