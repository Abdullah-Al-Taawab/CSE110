import java.util.Scanner;
public class task15
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(n%2==0 ||n%5==0){
      System.out.println(n);
    }
  }}