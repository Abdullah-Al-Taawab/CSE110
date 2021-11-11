import java.util.Scanner;
public class task22
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your mark");
    int m=sc.nextInt();
    if(m<=100){
      if(m>=0){
    if(m>=90){
      System.out.println("A");
    }
    else if(m>=85){
      System.out.println("A-");
    }
       else if(m>=80){
         System.out.println("B+");
       }
       else if(m>=75){
         System.out.println("B");
       }
       else if(m>=70){
         System.out.println("B-");
       }
       else if(m>=65){
         System.out.println("c+");
       }
       else if(m>=60){
         System.out.println("c");
       }
       else if(m>=57){
         System.out.println("c-");
       }
       else if(m>=55){
         System.out.println("D+");
       }
       else if(m>=52){
         System.out.println("D");
       }
       else if(m>=50){
         System.out.println("D-");
       }else{
         System.out.println("F");
       }
    }
  }
}
}
  