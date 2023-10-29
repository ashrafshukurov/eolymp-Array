package Practise;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        find();
    }

    public static void find() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min, max;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = min;
            } else if (a[i] == min) {
                a[i] = max;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }


    }
}








