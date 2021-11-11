import java.util.Scanner;
  public class task18
{
  public static void main(String[]args)
  {
    Scanner scan = new Scanner(System.in);
    int [] x = new int[15];
    int [] y = new int[10];
    
    
    for(int i=0;i<x.length;i++)
    {
      x[i] = scan.nextInt();
    }
    for(int i=0;i<x.length;i++)
    {
      for( int j=0;j<y.length;j++)
      {
          if(x[i]==j)
          {
          y[j]++;
          }
      }
    }
    
   for(int i=0;i<y.length;i++)
   {
     System.out.println(i+" is entered "+y[i]+" times");
   }
    
  }
  }