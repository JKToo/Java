/*Write a class named Retail ltem that holds data about an item in a retail Mine.
The class should have the following fields: • description. The description field references a String object that holds a brief 
description of the item. 
• unitsOnHand. The unitsOnHand field is an int variable that holds the number of units currently in inventory. 
• price. The price field is a double that holds the item's retail price. Write a constructor that accepts arguments for each field,
 appropriate mutator method', that store values in these fields, and accessor methods that return the values in these fields. 
 Once you have written the class, write a separate program that creates three Retailltem objects and 
 stores the following data in them: 
 
Item 1 Jacket , 12 (Units on Hand), 59.95 (Price)
Item 2 Designer Jeans, 40 (UOH), 34.95 (Price)
Item 3 Shirt, 20, 24.95

____________________________________________________________________________________________________________________________*/
public class RetailTest
{
   public static void main (String [] args)
   {
      RetailItem r1 = new RetailItem();
      RetailItem r2 = new RetailItem();
      RetailItem r3 = new RetailItem();
      
      r1.setDescription("Jacket");
      r2.setDescription("Designer Jeans");
      r3.setDescription("Shirt");
      
      r1.setUnitsOnHand(12);
      r2.setUnitsOnHand(40);
      r3.setUnitsOnHand(20);
      
      r1.setPrice(59.95);
      r2.setPrice(34.95);
      r3.setPrice(24.95);
      
      System.out.println(r1.getDescription() + ", " + r1.getUnits() + ", $" + r1.getPrice());
      System.out.println(r2.getDescription() + ", " + r2.getUnits() + ", $" + r2.getPrice());
      System.out.println(r3.getDescription() + ", " + r3.getUnits() + ", $" + r3.getPrice());


    }
}

________________________________________________________________________________________________________________________________
public class RetailItem
{
   String description;
   int unitsOnHand;
   double price;
   
   public RetailItem()
   {
      description = "";
      unitsOnHand = 0;
      price = 0;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public int getUnits()
   {
      return unitsOnHand;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public void setDescription(String d)
   {
      description = d;
   }
   
   public void setUnitsOnHand(int u)
   {
      unitsOnHand = u;
   }
   
   public void setPrice(double p)
   {
      price = p;
   }
}
