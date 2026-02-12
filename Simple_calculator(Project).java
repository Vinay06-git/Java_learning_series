import java.util.*;
class Simple_calculator{
   public static void main(String[] args){
      int a=25, b=5;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a char: ");
      String ch= sc.nextLine();
      if(ch.equals("+")){
         int sum = a+b;
         System.out.printf("sum = %d",sum);
      }
      else if(ch.equals("-")){
         int diff = a-b;
         System.out.printf("diff = %d", diff);
      }
      else if(ch.equals("*")){
         int prod = a*b;
         System.out.printf("prod = %d", prod);
      }
      else if(ch.equals("%")){
         int mod = a%b;
         System.out.printf("mod = %d", mod);
      }
      else if(ch.equals("/")){
         int quo = a/b;
         System.out.printf("quo = %d", quo);
      }
      
      sc.close();
   }
}


