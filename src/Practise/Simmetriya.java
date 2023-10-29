package Practise;

import java.util.Scanner;

public class Simmetriya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int n=s.length(),k=0;
       if(n%2==0){
           for(int i=0;i<n/2;i++){
               if(s.charAt(i)==s.charAt(n-i-1)){
                   k++;
               }
           }
       }

       if(n%2!=0){k=1;
           for (int i = 0; i < n/2; i++) {

               if(s.charAt(i)==s.charAt(n-i-1)){
                   k++;
               }

           }
       }
        System.out.println(k);

    }
}
