import java.util.Scanner;
public class task01
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    int sum=0;
    for(int c=0;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
      sum=sum+a[c];
    }
    System.out.println(sum);
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]);
    }
  }
}