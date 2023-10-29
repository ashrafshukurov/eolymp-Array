package Practise;

import java.util.Scanner;

public class TwoMinumum {
    public static void main(String[] args) {
       find();
    }

    public  static void find(){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int min1=a[0];
        int min2=a[0];
        for (int i =0;i<a.length;i++) {
            if(a[i]<min1){

                min1=a[i];
            }
            else if(a[i]<min2 && a[i]>min1){
                min2=a[i];
            }

        }
        System.out.println(min1+" "+min2);

    }

}
