import java.util.Scanner;
public class task25
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your designation");
     String post=sc.nextLine();
    System.out.println("How much payment you get");
    int pay=sc.nextInt();
     System.out.println("Enter your age");
    int age=sc.nextInt();     
                        int tax;
                        if(age<18){
                          System.out.println("No tax");
                        }
                        if(post.equals ("president")){
                          System.out.println("No tax");
                        }
                        if(pay<10000){
                          System.out.println("No tax");
                        }
                        if(pay>20000){
                          tax=(10*pay)/100;
                          System.out.println(tax);
                        }else{
                          tax=(5*pay)/100;
                        }}}
                        