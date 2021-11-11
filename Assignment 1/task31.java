import java.util.Scanner;
public class task31
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter num of courses");
    int n=sc.nextInt();
    System.out.println("Enter credits");
    int credits=sc.nextInt();
    System.out.println("Enter credit cost");
    int cost=sc.nextInt();
    int p;
    p=n*credits*cost;
    System.out.println(p);
  }}