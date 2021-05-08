/*Write a class named car that has the following fields:
• year Model. The year Model field is an int that holds the car's year model. 
• make. The make field references a String object that holds the make of the car. 
• speed. The speed field is an int that holds the car's current speed

In addition, the class should have the following constructor and other methods. • Constructor. The constructor should accept the car's
 year model and make as arguements. These values should be assigned to the object's year Model and make fields. 
The constructor should also assign 0 to the speed field.
• Accessor*. Appropriate accessor methods should get the values stored in an object's yearModel, make, and speed fields. 
• accelerate. The accelerate method should add 5 to the speed field each time it is called. 
• brake. The brake method should subtract 5 from the speed field each time it is called. 
Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. 
After each call to the accelerate method, get the current speed of the car and display it. Then call the brake method
 five times. After each call to the brake method, get the current speed of the car and display it.


_________________________________________________________________________________________________________________________*/

public class Car
{
   private int yearModel;
   private String make;
   private int speed=0;
   int accelerate = 0;
   int brake;
   int acc;
   int acceleration;
   
   public Car ()
   {
      yearModel=2018;
      make="Honda";
      speed=0;     
    }
   
   public int getModel()
   {
      return yearModel;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public int getSpeed()
   {
      return speed;
   }
     
   public int accelerate()
   {
      speed = speed + 5; 
      return speed;
   }
   
   public int brake()
   {
      speed = speed - 5; 
      return speed;    
   }
    
    
}


________________________________________________________________________________________________________________________
public class CarObject
{
   public static void main (String [] args)
   {
      Car c1 = new Car();
      
      c1.getModel();
      c1.getMake();
      c1.getSpeed();
      
      System.out.println("Car: " + c1.getModel());
      System.out.println(c1.accelerate());
      System.out.println(c1.accelerate());
      System.out.println(c1.accelerate());
      System.out.println(c1.accelerate());
      System.out.println(c1.accelerate());


      System.out.println(c1.brake());
      System.out.println(c1.brake());
      System.out.println(c1.brake());
      System.out.println(c1.brake());
   }
}

