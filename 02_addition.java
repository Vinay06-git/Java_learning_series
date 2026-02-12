import java.util.Scanner;
class addition{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a value: ");
      int a= sc.nextInt();
      System.out.print("Enter a value: ");
      int b=sc.nextInt();
      int sum = a+b;
      System.out.print(sum);
      sc.close();
   }
}
