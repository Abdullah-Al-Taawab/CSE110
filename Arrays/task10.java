import java.util.Scanner;
public class task10
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for(int c=0;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
      for(int i=0;i<=c;i++){
        System.out.print(a[i]);
      }
      System.out.println();
    }
  }
}
   