
public class task37
{
     public static void main(String [] args)
     {
       int n;
       for( n=1;n<=1600;n++){
         int c=1;
         int sum=0;
          for(c=1;c<n;c++){
           if(n%c==0){
             sum=(sum+c);
           }
          }
       if(sum==n){
             System.out.println(n);
           }
         }
       }
}
     