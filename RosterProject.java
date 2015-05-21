import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;

public class RosterProjectRedux 
{
	public static void main(String[] args)
	{
	
		String [] students = {"1;John;Smith;John1989@gmail.com;20;88;79;59",
				"2;Suzan;Erickson;Erickson_1990@gmailcom;19;91;72;85",
				"3;Jack;Napoli;The_lawyer99@yahoo.com;19;85;84;87",
				"4;Erin;Black;Erin.black@comcast.net;22;91;98;82",
				"5;Jeremy;Brown;jbro332@my.wgu.edu;27;88;92;84"};
	 
		
		Roster roster = new Roster();
		
	
		
		for(int i =0; i < students.length;i++)
		{
			String s = students[i];
			String[] parts = s.split(";");
			int partAge = Integer.parseInt(parts[4]);
			int partTestGrade1 = Integer.parseInt(parts[5]);
			int partTestGrade2 = Integer.parseInt(parts[6]);
			int partTestGrade3 = Integer.parseInt(parts[7]);	
			roster.add(parts[0], parts[1], parts[2], parts[3], partAge, partTestGrade1, partTestGrade2, partTestGrade3);
		}
		
		//testing class Roster methods
		roster.print_all();
		roster.print_invalid_emails();
		for(int i = 0;i < roster.roster.size();i++)
		{
			roster.print_average_grade(Integer.toString(i+1));
		}
		roster.remove("3");		
		roster.remove("3");	

		
		
	}

	public static class Student
	{
		private String studentID;
		private String firstName;
		private String lastName;
		private String emailAddress;
		private int age;
		private int testGrade1;
		private int testGrade2;
		private int testGrade3;
		
		
		public Student(String parts[])
		{
			setStudentID(parts[0]);
			setFirstName(parts[1]);
			setLastName(parts[2]);
			setEmailAddress(parts[3]);
			setAge(Integer.parseInt(parts[4]));
			setTestGrade1(Integer.parseInt(parts[5]));
			setTestGrade2(Integer.parseInt(parts[6]));
			setTestGrade3(Integer.parseInt(parts[7]));
		}

		
		public String getStudentID(String studentID){return studentID;}
		public String getFirstName(String firstName){return firstName;}
		public String getLastName(String lastName){return lastName;}
		public String getEmailAddress(String emailAddress){return emailAddress;}
		public int getAge(int age){return age;}
		public int getTestGrade1(int testGrade1){return testGrade1;}
		public int getTestGrade2(int testGrade2){return testGrade2;}
		public int getTestGrade3(int testGrade3){return testGrade3;}
		
		public void setStudentID(String studentID){this.studentID = studentID;}
		public void setFirstName(String firstName){this.firstName = firstName;}
		public void setLastName(String lastName){this.lastName = lastName;}
		public void setEmailAddress(String emailAddress){this.emailAddress = emailAddress;}
		public void setAge(int age){this.age = age;}
		public void setTestGrade1(int testGrade1){this.testGrade1 = testGrade1;}
		public void setTestGrade2(int testGrade2){this.testGrade2 = testGrade2;}
		public void setTestGrade3(int testGrade3){this.testGrade3 = testGrade3;}
		
		
		public void print()
		{
			String studentID = getStudentID(this.studentID);
			String firstName = getFirstName(this.firstName);
			String lastName = getLastName(this.lastName);
			String emailAddress = getEmailAddress(this.emailAddress);
			int age = getAge(this.age);
			int testGrade1 = getTestGrade1(this.testGrade1);
			int testGrade2 = getTestGrade2(this.testGrade2);
			int testGrade3 = getTestGrade3(this.testGrade3);
			
			System.out.println("Student ID: " + studentID + "\tFirst Name: " + firstName + "\tLast Name: "
					+ lastName + "\tEmail Address: " + emailAddress + "\tAge: " + age + "\tTest Grades: {" + testGrade1 
					 + ", " + testGrade2 + ", " + testGrade3 + "}");
		}
	}
	
	
	public static class Roster
	{
	
		public static ArrayList<Student> roster = new ArrayList<Student>();
		
		
		public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int testGrade1, int testGrade2, int testGrade3)
		{
			String partAge = Integer.toString(age);
			String partTestGrade1 = Integer.toString(testGrade1);
			String partTestGrade2 = Integer.toString(testGrade2);
			String partTestGrade3 = Integer.toString(testGrade3);
			String[] parts = {studentID,firstName,lastName,emailAddress,partAge,partTestGrade1,partTestGrade2,partTestGrade3};
			Student s = new Student(parts);
			roster.add(s);
			

		}
		
		public static void remove(String studentID)
		{
			for (int i = 0; i < roster.size(); i++)
            {
                if (roster.get(i).getStudentID(studentID).equals(studentID))
                {
                    roster.remove(i);
                    return;
                }
            }
            System.out.println("The Student ID does not exist in the roster.");
		}
		
		public  static void print_all() 
		{
			 for (int i = 0; i < roster.size(); i++)
                roster.get(i).print();
		}
		
		public static void print_average_grade(String studentID)
		{
			for( Student r : roster)
			{
				if(Integer.parseInt(studentID)==Integer.parseInt(r.studentID))
				{
					float avg = (r.testGrade1 + r.testGrade2 + r.testGrade3) / 3;
					System.out.println("StudentID # " + studentID + " has an average test grade of " + avg + ".");
					return;
				}
			}
			System.out.println("The Student ID does not exist in the roster.");	
		}
		
		public void print_invalid_emails()
		{
		
			for(Student r : roster)
			{
				if(r.emailAddress.indexOf('@') == -1 || r.emailAddress.indexOf('.') == -1)
				{
					System.out.println("Invalid email address for Student ID # " + r.studentID
							+ "." + "\tEmail Address: " + r.emailAddress);
					
				}
			}
		}
	}
	
}
