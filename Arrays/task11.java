import java.util.Scanner;
public class task11
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int c=0;c<a.length;c++){
      System.out.println("Enter a num");
      int x=sc.nextInt();
      for(int i=0;i<a.length;i++){
        if(a[i]==x){
          System.out.println("Enter different num");
          x=sc.nextInt();
        }
      }
      a[c]=x;
    }
  }
}