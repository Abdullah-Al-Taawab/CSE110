import java .util.Scanner;
public class task04
{
public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
  int c;
  int sum=0;
  for(c=1;c<=5;c++){
    System.out.println("Enter a number");
    int n=sc.nextInt();
    sum=sum+n;
  }
  double avg=sum/5;
  System.out.println(avg);
}
}
    