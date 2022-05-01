import java.util.*;

// FIND ALL OF THE FINISH ME comments
// and add the necessary code

// define the class Student
public class Student
{
 // define a private String variable
 // called name 
 private String name;
 
 // define a private String variable
 // called attendanceCode 
 public String attendanceCode;
 
 // define the constructor for the Student class
 public Student(String name, String attendanceCode)
 {
   // FINISH ME
   // Assign the incoming values 
   // to your instance variables.
   this.name = name;
   
   this.attendanceCode = attendanceCode;                  
 } 

 
 public String getName()
 {
   // FINISH ME
   return name;
 }

 
 public String getAttendanceCode()
 {
   // FINISH ME
   return attendanceCode;

 }

 
 // This is a setter method or
 // mutator method
 public void setAttendanceCode(String code)
 {
     // FINISH ME
     // Assign the incoming code to
     // this student's 
     // attendanceCode
     code = attendanceCode;
 }
 
 
 public String toString()
 {
   // FINISH ME
   // return the name, a space, and the 
   // attendance code of this student
      
   return name + " " + attendanceCode; // replace me
 }
}
