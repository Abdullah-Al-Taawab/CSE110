import java.util.Scanner;
public class task35
{
  public static void main(String []args)
  {
    long s=1,p=2;
      long pro=0;
    System.out.println(s);
    System.out.println(p);
    for(int c=2;c<=998;c++){
      pro=(s*p);
      System.out.print(pro+",");
      s=p;
      p=pro;
    }
  }
}