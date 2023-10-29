package Practise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),k,s1=0,s2=0;
       while(n-->0){
           k=sc.nextInt();
           int[] a=new int[k];
           for(int i=0;i<a.length;i++){
              a[i]=sc.nextInt();
           }
           for(int i=0;i<a.length;i++){
               if(i%2==0){
                   s1+=a[i];
               }
               else if(i%2!=0){
                   s2+=a[i];
               }
           }

           if((s1*s2)%2==0){
               System.out.println("NO");
           }
           else{
               System.out.println("YES");
           }
       }


    }
}
