import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;
public class RosterProject
{
     static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99@yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Jeremy,Brown,jbro332@wgu.edu,27,88,92,84"};
                
                public static ArrayList<Student> roster = new ArrayList<Student>();
    
    
        public void main(String args[])
        {
      
           
            new RosterProject();
        }
      
            public void RosterProject()
            {
                for (int i = 0; i < students.length; i++)
                {
                    String s = students[i];
                    String [] parts = s.split(",");
                    String studentID = parts[0];
                    String firstName = parts[1];
                    String lastName = parts[2];
                    String emailAddress = parts[3];
                    int age = Integer.parseInt(parts[4]);
                    int testGrade1 = Integer.parseInt(parts[5]);
                    int testGrade2 = Integer.parseInt(parts[6]);
                    int testGrade3 = Integer.parseInt(parts[7]);
            
                    Student x = new Student(studentID, firstName, lastName, emailAddress, age, testGrade1, testGrade2, testGrade3);
                    roster.add(x);
                }
            }
       
       
    
        public static class Student
        {
            public String studentID;
            public String firstName;
            public String lastName;
            public String emailAddress;
            public int age;
            public int testGrade1;
            public int testGrade2;
            public int testGrade3;
            
            public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int testGrade1, int testGrade2, int testGrade3) 
            {           studentID = this.studentID;
                        firstName = this.firstName;
                        lastName = this.lastName;
                        emailAddress = this.emailAddress;
                        age = this.age;
                        testGrade1 = this.testGrade1;
                        testGrade2 = this.testGrade2;
                        testGrade3 = this.testGrade3;
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
                String lastName = getLastName(this.lastName);;
                String emailAddress = getEmailAddress(this.emailAddress);
                int age = getAge(this.age);
                int testGrade1 = getTestGrade1(this.testGrade1);;
                int testGrade2 = getTestGrade2(this.testGrade2);;
                int testGrade3 = getTestGrade3(this.testGrade3);;
            
                System.out.println("Student ID: " + studentID + "\tFirst Name: " + firstName +"\tLast Name: "
                    + lastName + "\tEmail Address: " + emailAddress + "\tAge: " + age + "\tTest Grades: {" + testGrade1 
                     + ", " + testGrade2 + ", " + testGrade3 + "}");
            }
        }
 public static class Roster 
    {
        public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int testGrade1, int testGrade2, int testGrade3)
		{
		    populateRoster();
		  }
		  
		  public static void populateRoster()
		  {      
		      roster.add(new Student("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59));
              roster.add(new Student("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85));
              roster.add(new Student("3", "Jack", "Napoli", "The_lawyer99@yahoo.com", 19, 85, 84, 87));
              roster.add(new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82));
              roster.add(new Student("5", "Chris", "Baker", "cbake55@wgu.edu", 29, 81, 78, 91));
		    }  
			
        
        
        public static void remove(String studentID)
        {
            for (int i = 0; i < students.length; i++)
            {
                if (roster.get(i).getStudentID(studentID).equals(studentID))
                {
                    roster.remove(i);
                    return;
                }
            }
            System.out.println("The Student ID does not exist in the roster.");
        }
    
        public static void print_all()
        {
            for (int i = 0; i < roster.size(); i++)
                roster.get(i).print();
        }
    
        public static void print_average_grade(String studentID)
        {
            for(Student x : roster)
            {
                    if((studentID) == x.studentID)
                    {
                          float avg = (x.testGrade1 + x.testGrade2 + x.testGrade3) / 3;
                          System.out.println("StudentID # " + studentID + " has an average test grade of " + avg);
                          return;
                    }
            }
            System.out.println("The Student ID does not exist in the roster.");
        }    
    
        public static void print_invalid_emails()
        {
            for(Student x : roster)
            {
                    if(x.emailAddress.indexOf('@')==-1 || x.emailAddress.indexOf('.')==-1)
                    {
                              System.out.println("Invalid email address for Student ID: " + x.studentID
                                  + "\tEmail Address: " + x.emailAddress);
                    
                    }
            }
        }         
            
        }
    }
