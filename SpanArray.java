import java.util.*;
import java.io.*;
public class SpanArray
{
    public static void main(String []args)throws Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int max=maxofarr(arr,0);
        int min=miniofarr(arr,0);
        int span=max-min;
        System.out.println(span);
    }
    public static int maxofarr(int []arr,int  i)
    {
        if(i==arr.length-1){
            return arr[i];
        }
        int maxisa=maxofarr(arr,i+1);
        if(maxisa>arr[i]){
            return maxisa;
        }
        else{
            return arr[i];
        }
    }
    public static int miniofarr(int []arr,int i)
    {
     if(i==arr.length-1){
         return arr[i];
     }
     int minisa=miniofarr(arr,i+1);
     if(minisa<arr[i]){
         return minisa;
     }
     else{
         return arr[i];
     }
    }
}
