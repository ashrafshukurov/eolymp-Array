package Practise;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(i%2==0){
                    System.out.print(i+" ");
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else if(i%2!=0){
                    System.out.print(i+" ");
                    temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }


            }

        }


    }
}