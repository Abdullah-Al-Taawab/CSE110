import java.util.Scanner;
public class task34
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the time in mint");
    int t=sc.nextInt();
    System.out.println("Enter the slot");
    String slot=sc.next();
     System.out.println("Enter the type");
    String type=sc.next();
    int sum;
    if(slot.equals("peak"))
         {
      if(type.equals("f&f"))
           {
        if(t<=5){
          sum=(t*4);
          System.out.println(sum);
        }else{
           sum=(t-5)*2+(t*4);
           System.out.println(sum);
        }if
          (t<=5){
          sum=t*7;
          System.out.println(sum);
        }else{
          sum=(((t-5)*6)+(t*7));
        System.out.print(sum);
      }
      }
      }
         else if(type.equals("f&f")){
           if(t<=5){
             sum=(t*3);
             System.out.println(sum);
           }else {
             sum=(((t-5)*1)+(t*3));
             System.out.println(sum);
           }
         }else if 
                   (t<=5){
           sum=(t*8);
           System.out.println(sum);
         }
                 else {
                   sum=(((t-5)*5)+(t*8));
                   System.out.println(sum);
                 }
  }
}
           