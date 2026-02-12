import java.util.Scanner;
class oddoreven{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a value: ");
      int value= sc.nextInt();
      if(value%2==0){
         System.out.print("Even");
      }
      else{
         System.out.print("Odd");
      }
      sc.close();
   }
}