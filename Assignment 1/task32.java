import java.util.Scanner;
public class task32
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of Q");
    int Q=sc.nextInt();
    int p;
    if(Q<=50){
      p=600+(15*(Q*Q));
      System.out.println(p);
    }else{
      p=1000/(3+((Q*Q)/1900));
              System.out.println(p);
              }
}}
              
      
      