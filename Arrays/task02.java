import java.util.Scanner;
public class task02
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int sum=0;
    for(int c=0;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
    }
    System.out.println("Enter a num");
    int n=sc.nextInt();
    System.out.println(a[n]);
    }
  }
