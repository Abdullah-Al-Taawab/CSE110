import java .util.Scanner;
public class task13
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter a num");
    a[0]=sc.nextInt();
    int max=a[0],location=0;
    for( int c=1;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
      if(a[c]>max){
        max=a[c];
      location=c;
      }
    }
    System.out.println(max);
    System.out.println("location is"+ location);
  }
}