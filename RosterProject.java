import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;
public class RosterProject

  
{
    
   

    public void main(String args[])
    {
      
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
				"2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
				"3,Jack,Napoli,The_lawyer99@yahoo.com,19,85,84,87",
				"4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
				"5,Jeremy,Brown,jbro332@wgu.edu,27,88,92,84"};
        
        
    }
    
    public class Student
    {
            public String studentID;
            public String firstName;
            public String lastName;
            public String emailAddress;
            public int age;
            public int testGrade1;
            public int testGrade2;
            public int testGrade3;
            
            Student(String studentID, String firstName, String lastName, String emailAddress, int age, int testGrade1, int testGrade2, int testGrade3) {
                        studentID = studentID;
                        firstName = firstName;
                        lastName = lastName;
                        emailAddress = emailAddress;
                        age = age;
                        testGrade1 = testGrade1;
                        testGrade2 = testGrade2;
                        testGrade3 = testGrade3;
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
       
    public class Roster 
    {
    public ArrayList<Student> roster = new ArrayList<Student>();
    
    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int testGrade1, int testGrade2, int testGrade3)
    {
        String [] students = {studentId,firstName,lastName,emailAddress,age,testGrade1,testGrade2,testGrade3};
        
        
    }
    public void populateRoster()
    {
        roster.add(new Student("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59));
        roster.add(new Student("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85));
        roster.add(new Student("3", "Jack", "Napoli", "The_lawyer99@yahoo.com", 19, 85, 84, 87));
        roster.add(new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82));
        roster.add(new Student("5", "Jeremy", "Brown", "jbro332@wgu.edu", 27, 88, 92, 84));
        
        Object[] Student = roster.toArray();

    }
  
        public int findID(String studentID)
        
    { 
        for (int i = 0; i < roster.size(); i++)
        {
            if (roster.get(i).getStudentID(this.studentID) == (studentID))
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
                    if((studentID) == p.studentID)
                    {
                          float avg = (p.testGrade1 + p.testGrade2 + p.testGrade3) / 3;
                          System.out.println("StudentID # " + studentID + " has an average test grade of " + avg);
                          return;
                    }
              }
              System.out.println("The Student ID does not exist in the roster.");
             }    
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
                }           } }}
