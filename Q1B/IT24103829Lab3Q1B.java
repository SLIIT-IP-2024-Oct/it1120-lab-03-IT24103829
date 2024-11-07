import java.util.Scanner;

public class  IT24103829Lab3Q1B{

      public static void main(String[] args) {
           
         Scanner input = new Scanner(System.in); 

           System.out.println("Enter the price of 1kg of rice : ");
         double price =input.nextDouble();
                
         System.out.println("Enter the kilograms you want : ");
         double kg =input.nextDouble();

          double amount = price*kg;

          double discount = amount*0.1;
           
          double totalamount = amount - discount;

          System.out.println("The total amount with 10% discount : " + totalamount );
   }
}