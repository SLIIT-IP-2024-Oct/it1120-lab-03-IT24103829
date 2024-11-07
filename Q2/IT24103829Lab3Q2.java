import java.util.Scanner;

public class  IT24103829Lab3Q2{

      public static void main(String[] args) {
           
         Scanner input = new Scanner(System.in); 

         System.out.println("Enter the monthly salary : ");
         double monthlysalary =input.nextDouble();

         System.out.println("Enter the number of OT hours : ");
         double OThours =input.nextDouble();
     
         System.out.println("Enter the OT hourly rate : ");
         double  OThourlyRate  =input.nextDouble();

         double OTamount = OThours * OThourlyRate;
         double totalSalary = monthlysalary + OTamount;

         System.out.println("The total Salary including OT is : " + totalSalary);
  }
}