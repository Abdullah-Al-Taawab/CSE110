import java.util.Scanner;
public class task08
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
    for(int i=a.length-1;i>=0;i--){
      if(a[i]%2==0){
        System.out.print(a[i]);
      }
    }
  }
}