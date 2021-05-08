/*
Write a class named Employee that has the following fields:
• name. The name field references a String object that holds the employee's name.
• idNumber. The idNumber is an int variable that holds the employee's ID) number.
• department. The department field references a String object that holds the name of the department where the employee works.
• position. The position field references a String object that holds the employee's job title. 

The class should have the following constructors:
• A constructor that accepts the following values as arguments and assigns them to the appropriate fields:
 employee's name, employee's ID) number, department, and position.
• A constructor that accepts the following values as arguments and assigns them to the appropriate fields: employee's name and
 ID number. The department and position fields should be assigned an empty string (""). 
• A no-arg constructor that assigns empty strings ("") to the name, department, and position fields, and
 0 to the idNumber field.
Write appropriate mutator methods that store values in these fields and accessor methods that return the values in these fields. 
Once you have written the class, write a separate program that creates three Employee objects to hold the following data:
  
      Name:         ID:     Department:   Position:
      Susan Meyers  47899   Accounting   Vice President
      Mark Jones    39119   IT            Programmer
      Joy Rogers    81774   Manufacturing Engineer
      
The program should store this data in the three objects and then display the data for each employee on the screen

____________________________________________________________________________________________________________________________________*/

import java.util.Scanner;

public class Employee
{
   String name; 
   String department;
   String position;
   int EmpID;
   
   public Employee()
   {
      name="";
      department="";
      position="";
      EmpID=0;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getDepartment()
   {
      return department;
   }

   public String getPosition()
   {
      return position;
   }

   public int getID()
   {
      return EmpID;
   }

 
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setDepartment(String d)
   {
      department = d;
   }
   
   public void setPosition(String p)
   {
      position = p;
   }
   
   public void setID(int id)
   {
      EmpID = id;
   }

      
   
}


___________________________________________________________________________________________________________
public class Employees
{
   public static void main (String [] args)
   {
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      Employee e3 = new Employee();
      
      e1.setName("Susan Meyers");
      e2.setName("Mark Jones");
      e3.setName("Joy Rogers");
      
      e1.setDepartment("Accounting");
      e2.setDepartment("IT");
      e3.setDepartment("Manufacturing");
      
      e1.setPosition("Vice President");
      e2.setPosition("Programmer");
      e3.setPosition("Engineer");
      
      e1.setID(47899);
      e2.setID(39119);
      e3.setID(81774);
      
      System.out.println("Employee 1: " + e1.getName() + ", " + e1.getDepartment() + ", " + e1.getPosition() + ", " + e1.getID());
      System.out.println("Employee 2: " + e2.getName() + ", " + e2.getDepartment() + ", " + e2.getPosition() + ", " + e2.getID());
      System.out.println("Employee 3: " + e3.getName() + ", " + e3.getDepartment() + ", " + e3.getPosition() + ", " + e3.getID());
   }
}
     
