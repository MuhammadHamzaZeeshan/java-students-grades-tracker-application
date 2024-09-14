package stdgradestrackerapp;
import java.util.Scanner;

public class StdGradeTrackerApp {

	public static void main(String[] args) {
		
//		Student s1 = new Student();      // Enrolled a new student(i.e Hamza)
//		s1.addGrade();                   // Add grades of Hamza(i.e Maths, Eng, Urdu)
//		System.out.println("Average Grade: "+s1.getAverageGrade()); // Gets average of the grades
//		//s1.getGrade();                 // Gets grade of a specified course
//		s1.getStudentInfo();             // Gets Hamza's Information
//		
//		
//		Student s2 = new Student();      // Enrolled a new student(i.e Asad)
//		s2.addGrade();                   // Add grades of Asad(i.e Pst, Isl)
//		System.out.println("Average Grade: "+s2.getAverageGrade());    // Gets average of the grades            
//		s2.getStudentInfo();  
		
		
		
		// Ask how many users you want to add:
				System.out.print("Enter number of Students: ");
				Scanner sc = new Scanner(System.in);
				int numOfStudents = sc.nextInt();
				
				Student[] students = new Student[numOfStudents];
				
				
				// Create n number of students:
				for(int n = 0; n < numOfStudents; n++) {
					students[n] = new Student();
					students[n].addGrade();
					System.out.println("Average Grade: "+students[n].getAverageGrade());
					students[n].getStudentInfo();
					
				}
		

//		Course c1 = new Course();        // Create a new course(i.e Maths)
//		c1.addStudent(s1);               // Add a student to that course(means Hamza study maths)
//		c1.addStudent(s2);               // Add another student(means Asad study maths)
//		c1.removeStudent(s2);            // Remove a student from course
//		
//		c1.getCourseInfo();              // Get course information
		

	}

}
