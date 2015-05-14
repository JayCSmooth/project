import java.util.Arrays;
import java.util.ArrayList;

public class RosterProject

  
{
    public static ArrayList<Student> roster = new ArrayList<Student>();
   
    public static void main(String args[])
    {
        populateRoster();
    }
    
    public static void populateRoster()
    {
        roster.add(new Student(1, "John", "Smith", "John1989@gmail.com", 20, new float[] {88, 79, 59}));
        roster.add(new Student(2, "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, new float[] {91, 72, 85}));
        roster.add(new Student(3, "Jack", "Napoli", "The_lawyer99@yahoo.com", 19, new float[] {85, 84, 87}));
        roster.add(new Student(4, "Erin", "Black", "Erin.black@comcast.net", 22, new float[] {91, 98, 82}));
        roster.add(new Student(5, "Jeremy", "Brown", "jbro332@wgu.edu", 27, new float[] {88, 92, 83}));
    }
    
    private static class Student
	{
		    public int studentID;
		    public String firstName;
		    public String lastName;
		    public String email;
		    public int age;
		    public int testGrade1;
		    public int testGrade2;
		    public int testGrade3;
  }
    
    public String getStudentID(String studentID){return studentID;}
		public String getFirstName(String firstName){return firstName;}
		public String getLastName(String lastName){return lastName;}
		public String getEmailAddress(String emailAddress){return emailAddress;}
		public int getAge(int age){return age;}
		public int getTestGrade1(int testGrade1){return testGrade1;}
		public int getTestGrade2(int testGrade2){return testGrade2;}
		public int getTestGrade3(int testGrade3){return testGrade3;}
		
		public void setStudentID(String studentID){project.studentID = studentID;}
		public void setFirstName(String firstName){project.firstName = firstName;}
		public void setLastName(String lastName){project.lastName = lastName;}
		public void setEmailAddress(String emailAddress){project.emailAddress = emailAddress;}
		public void setAge(int age){project.age = age;}
		public void setTestGrade1(int testGrade1){project.testGrade1 = testGrade1;}
		public void setTestGrade2(int testGrade2){project.testGrade2 = testGrade2;}
		public void setTestGrade3(int testGrade3){project.testGrade3 = testGrade3;}
		
		public void print()
		{
			String studentID = getStudentID(project.studentID);
			String firstName = getFirstName(project.firstName);
			String lastName = getLastName(project.lastName);;
			int age = getAge(project.age);
			String emailAddress = getEmailAddress(project.emailAddress);
			int testGrade1 = getTestGrade1(project.testGrade1);;
			int testGrade2 = getTestGrade2(project.testGrade2);;
			int testGrade3 = getTestGrade3(project.testGrade3);;
			
			System.out.println("Student ID: " + studentID + "\tFirst Name: " + firstName +"\tLast Name: "
					+ lastName + "\tAge: " + age + "\tEmail Address: " + emailAddress + "\tTest Grades: {" + testGrade1 
					 + ", " + testGrade2 + ", " + testGrade3 + "}");
		}
		
		public static int findID(String studentID)
    {
        for (int i = 0; i < roster.size(); i++)
        {
            if (roster.get(i).getStudentID() == Integer.parseInt(studentID))
                return i;
        }
        return -1;
    }
		
		public static void remove(String studentID)
    {
        if (findID(studentID) >= 0)
            roster.remove(findID(studentID));
        else
            System.out.println("The Student ID does not exist in the roster.");
    }
    
    public static void print_all()
    {
        for (int i = 0; i < roster.size(); i++)
            roster.get(i).print();
    }
    
    public static void print_average_grade(String studentID)
		{
        for( Student p : roster)
			  {
				    if(Integer.parseInt(studentID)==p.studentID)
				    {
					      double avg = (p.testGrade1 + p.testGrade2 + p.testGrade3) / 3;
					      System.out.println("StudentID # " + studentID + " has an average test grade of " + avg);
					      return;
				    }
			  }
			  System.out.println("The Student ID does not exist in the roster.");
			  
			  public static void print_invalid_emails()
		    {
			 
			      for(Student p : roster)
			      {
				        if(p.emailAddress.indexOf('@')==-1 || p.emailAddress.indexOf('.')==-1)
				        {
					          System.out.println("Invalid email address for Student ID: " + p.studentID
							      + "\tEmail Address: " + p.emailAddress);
					
				        }
			       }
		      }
