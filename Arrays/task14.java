import java .util.Scanner;
public class task14
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter a num");
    a[0]=sc.nextInt();
    int max=a[0],min=a[0],maxlocation=0,minlocation=0;
    for( int c=1;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
      if(a[c]>max){
        max=a[c];
      maxlocation=c;
      }
      else if(a[c]<min){
        min=a[c];
        minlocation=c;
    }
    }
    System.out.println("max is"+ max);
    System.out.println("max location is"+ maxlocation);
  System.out.println("min is"+ min + "min location is"+ minlocation);
  }
}
  