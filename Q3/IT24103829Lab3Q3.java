import java.util.Scanner;

public class  IT24103829Lab3Q3{

      public static void main(String[] args) {
           
         Scanner input = new Scanner(System.in); 

         System.out.println("Enter the Amount : ");
         int amount =input.nextInt();

         int Notes5000 = amount/5000;
         int bal1 = amount-(Notes5000*5000);

         int Notes1000 = bal1/1000;
         int bal2 = bal1-(Notes1000*1000);

         int Notes500 =bal2/500;
         int bal3 =bal2-(Notes500*500);

         
         int Notes200 =bal3/200;
         int bal4 =bal3-(Notes200*200);
         
         int Notes100 =bal4/100;
         int bal5 =bal4-(Notes100*100);

         int Notes50=bal5/50;
         int bal6 =bal5-(Notes50*50);

         int Notes20=bal6/20;
         int bal7 =bal6-(Notes20*20);

         int Notes10=bal7/10;
         int bal8 =bal7-(Notes10*10);

         int Notes05=bal8/05;
         int bal9=bal8-(Notes05*05);

         int Notes02=bal9/02;
         int bal10=bal8-(Notes02*02);

         int Notes01=bal10/01;

         System.err.println("5000 Notes : " +Notes5000);
         System.err.println("1000 Notes : " +Notes1000);
         System.err.println("500 Notes : " +Notes500); 
         System.err.println("200 Notes : " +Notes200);
         System.err.println("100 Notes : " +Notes100);
         System.err.println("50 Notes : " +Notes50);
         System.err.println("20 Notes : " +Notes20);
         System.err.println("10 Notes : " +Notes10);
         System.err.println("05 Notes : " +Notes05);
         System.err.println("02 Notes : " +Notes02);
         System.err.println("01 Notes : " +Notes01);

      }
}