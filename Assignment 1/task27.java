import java.util.Scanner;
public class task27
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of seconds");
    int sec=sc.nextInt();
    int hour,mint,second;
    hour=sec/3600;
    mint=(sec % 3600)%60;
    second=(sec % 3600)%60;
    System.out.println("hour is"+ hour);
    System.out.println("mint is"+ mint);
    System.out.println("sec is " + sec);
  }
}