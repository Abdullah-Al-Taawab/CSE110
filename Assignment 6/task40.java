import java.util.Scanner;
public class task40
{
     public static void main(String [] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a num");
       int m=sc.nextInt();
       int t500=0,t100=0,t50=0,t20=0,t10=0,t5=0,t2=0,t1=0;
       for(;m>0;m++){
         if(m>=500){
           t500++;
           m=(m-500);
         }
         else if(m>=100){
           t100++;
           m=(m-100);
         }
         else if(m>=50){
           t50++;
           m=(m-50);
         }
         else if(m>=10){
           t10++;
           m=(m-10);
         }
         else if(m>=5){
           t5++;
           m=(m-5);
         }
         else if(m>=2){
           t2++;
           m=(m-2);
         }else if(m>=1){
           t1++;
           m=(m-1);
         }
       }
       System.out.println("500 taka"+ t500+ "note");
         System.out.println("500 taka"+ t100+ "note");
         System.out.println("500 taka"+ t50+ "note");
         System.out.println("500 taka"+t10+ "note");
         System.out.println("500 taka"+ t5+ "note");
       System.out.println("500 taka"+ t2+ "note");
       System.out.println("500 taka"+ t1+ "note");
     }
}
