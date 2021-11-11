import java.util.Scanner;
public class task30
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of publish article");
    int a=sc.nextInt();
    int fees;
    fees=a*500;
    System.out.println(fees);
  }
}