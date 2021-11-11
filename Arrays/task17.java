import java.util.Scanner;
public class task17
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter a num");
   int n=sc.nextInt();
   int temp;
   int a[]=new int[n];
   for(int c=0;c<a.length;c++){
     System.out.println("Enter a number");
     a[c]=sc.nextInt();
   }
   for(int c=0;c<a.length;c++){
     for(int i=0;i<a.length;i++){
       if(a[c]<a[i]){
         temp=a[c];
         a[c]=a[i];
         a[i]=temp;
       }
     }
   }
   if(a.length%2==0){
     int p=(a.length-1)/2;
     int ans1=p;
     int ans2=++p;
     int median=(a[ans1]+a[ans2])/2;
     System.out.println(median);
   }
   else{
     int p=(a.length-1)/2;
     System.out.println(a[p]);
   }
 }
}
         