import java.util.Scanner;
public class task16
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(n%2==0){
      if(n%5!=0){
      System.out.println(n);
    }
    }else
      if (n%2!=0){
      if(n%5==0){
      System.out.println(n);
    }
  }}
}