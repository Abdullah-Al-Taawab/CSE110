import java.util.Scanner;
public class task29
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x");
    int x=sc.nextInt();
    System.out.println("Enter the value of y");
    int y=sc.nextInt();
    System.out.println("Enter the value of z");
    int z=sc.nextInt();
    int s;
    double area;
    s=(x+y+z)/2;
    area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println(area);
  }
}