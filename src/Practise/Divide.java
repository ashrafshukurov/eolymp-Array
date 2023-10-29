package Practise;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*
        1 0 2 3 0 0
        1 2 3 0 0 0
         */
       int[] a=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==0){
                System.out.print(a[i]+" ");
            }
        }




    }
}
