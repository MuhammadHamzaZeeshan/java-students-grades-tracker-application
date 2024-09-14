package stdgradestrackerapp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
	protected String studentName;
	protected int studentID;
	protected ArrayList<String> listOfCourses = new ArrayList<String>();
	private Map<String, Integer> listOfGrades = new HashMap<>();
	private static int lastAssignedID = 10000;
	
	
	// Making it global to class
	Scanner sc = new Scanner(System.in);
	
	
	// Constructor for initializing student name and id:
	public Student() {
		System.out.print("Enter name of the student: ");
		this.studentName = sc.nextLine();
		
		 lastAssignedID++;
	     this.studentID = lastAssignedID;  
	}
	
	
	// Method to add a course:
	public void addCourse(){
		System.out.print("Enter name of the course or q to exit: ");
		String input = sc.nextLine();
		while(!input.equals("q")) {
			listOfCourses.add(input);
			
			input = sc.nextLine();
		}
		
		
	}
	
	
	// Method to add grades:
	public void addGrade() {
		String courseName = "";
		while(!courseName.equals("q")) {
			System.out.print("Enter name of the course or q to exit: ");
			courseName = sc.nextLine();
			if (courseName.equals("q")) {
	            break;
	        }
			System.out.print("Enter the grades: ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			listOfGrades.put(courseName, grade);
			
		}
	    
	  }
	
	
	// Method to calculate and return average grades:
	public double getAverageGrade() {
		double avg = 0;
		for (Integer value : listOfGrades.values()) {
			if (value != null) {
				avg += value;
		    }
		}
		avg = avg/listOfGrades.size();
		return avg;
		
	}
	
	
	// Returns the grade for a specified course:
	public String getGrade(){
		System.out.print("Enter the name of the course: ");
		String courseName = sc.nextLine();

		// Retrieving the value associated with the key
		Integer value = listOfGrades.get(courseName);

		if (value != null) {
		    return ("Grades for " + courseName + ": " + value);
		} else {
		    return ("Course not found. ");
		}
	}
	
	
	// Returns courses enrolled:
	public Set<Map.Entry<String, Integer>> getCoursesEnrolled() {
	    return listOfGrades.entrySet();
	    }
	
	
	 // Returns student information:
    public void getStudentInfo() {
        System.out.println("Student Name: " + studentName + "\n" +
                "Student ID: " + studentID);
        System.out.println(getCoursesEnrolled());
    }
    
	
	// Override toString method to provide meaningful representation
    @Override
    public String toString() {
    	return("Student Name " + " " + "Student ID " + "\n"
         + studentName + "\t\t" + studentID);
    }
	
	
	
	

}
