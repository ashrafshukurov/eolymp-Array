package Practise;

import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    /*
    1 2 3 4
    4 1 2 3
     */
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print(a[n-1]+" ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");

        }
    }







}
