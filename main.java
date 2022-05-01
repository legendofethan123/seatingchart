//Lab Chapter 18 -  Lab 5    2021

// Uses files Main.java, SeatingChart.java, and Student.java

// Lab 18.5 - Seating Chart

// Written by Ethan Gonzalez

// There are 3 files needed for this lab.
// Main.java
// SeatingChart.java
// Student.java


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main // SeatingChartRunner
{
 public static void main( String args[] ) throws IOException
 {
  System.out.println("Lab 18.5 Seating Chart");
  System.out.println();
  
  // PUT your name on this lab!
  System.out.println("Written by Ethan Gonzalez");
  System.out.println();
  System.out.println();
  
  // We will create (instantiate) a SeatingChart object with
  // 4 rows and 3 columns.
  SeatingChart seatingChart = new SeatingChart(4, 3);
  System.out.println( );

  // Put in Student objects
  Student s = new Student("Tom", "A");
  if (seatingChart.add(s, 0, 0))
  {
     System.out.println("Added " + s.getName() );
  }
  
  s = new Student("Sue", "P");
  if (seatingChart.add(s, 0, 1))
  {
     System.out.println("Added " + s.getName() );
  }
  
  s = new Student("Sam", "P");
  if (seatingChart.add(s, 1, 0))
  {
     System.out.println("Added " + s.getName() );
  }

  s = new Student("Jill", "P");
  if (seatingChart.add(s, 1, 1))
  {
     System.out.println("Added " + s.getName() );
  }

  s = new Student("Julian", "P");
  if (seatingChart.add(s, 2, 2))
  {
     System.out.println("Added " + s.getName() );
  }

  s = new Student("Diego", "P");
  if (seatingChart.add(s, 1, 1))
  {
    System.out.println("Added Diego");
  }
  else
  {
   System.out.println("Seat is taken.");
  }

  if (seatingChart.add(s, 2, 1))
  {
    System.out.println("Added Diego");
  }
  else
  {
    System.out.println("Seat is taken.");
  }

  System.out.println();
  
  // Prints the seating chart.
  seatingChart.printSeatingChart();
  System.out.println();
  
  // gets the number of students absent
  // The code is "A"
  int numAbsent = seatingChart.getNumberOfStudentsWithCode("A");
  
  // Now we will print it
  System.out.println("Number Absent: " + numAbsent);
  System.out.println();
  
  // gets the number of students present
  // The code is "P"
  int numPresent = seatingChart.getNumberOfStudentsWithCode("P");

  // Now we will print it
  System.out.println("Number Present: " + numPresent);
  System.out.println();

  
  
 } // end of main method

} // end of class Main
