import java.util.Scanner;
public class task26
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter hours");
    int h=sc.nextInt();
    int salary;
    if(h<=40){
      salary=(h*200);
      System.out.println(salary);
    }else{
      salary=8000+(3*(h-40));
      System.out.println(salary);
    }
  }
}