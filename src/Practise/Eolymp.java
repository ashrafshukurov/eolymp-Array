package Practise;

import java.util.Scanner;

public class Eolymp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Double[] arr=new Double[n];
        double max;
        for(int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();

        }
        max=Math.abs((double)arr[0]);
        for (int i = 0; i < arr.length; i++) {
           if(Math.abs((double)arr[i])>max){
               max=arr[i];
           }

        }
        System.out.printf("%.2f",max);
    }
}
