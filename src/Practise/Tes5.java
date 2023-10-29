package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class Tes5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
        }
        int count=1;
        for(int i=0;i<n;i++){//1  1 2  1 2 3   1 2 3 4
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.print(" ");
            count=1;
        }

    }
}
