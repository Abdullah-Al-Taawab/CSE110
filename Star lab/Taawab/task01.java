import java.util.Scanner;
public class task01
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int n=sc.nextInt();
    for(int c=1;c<=n;c++){
      System.out.print("*");
    }
  }
}