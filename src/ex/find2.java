package ex;

import java.util.Scanner;

public class find2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int[] arr2=new int[x];
        for (int i = 0; i <arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int count=0;
        if(n>x){
            for(int i=0;i<n;i++){
                if(arr[i]==arr2[i]){
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}

