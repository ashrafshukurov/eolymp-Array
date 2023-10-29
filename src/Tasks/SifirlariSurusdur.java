package Tasks;

import java.util.Scanner;

public class SifirlariSurusdur {
    public static void main(String[] args) {
        int[] input={3,0,5,0,0,-4};
        int l=input.length;
        int n=0;
        int[] output = new int[l];
        for (int i=0; i<input.length; i++)
        {
            if (input[i]==0) {
                output[l-1] = input[i];
                l--;
            }
            else { output[n]=input[i];

            n++;
            }

        }
        for (int i=0;i<n;i++){

        }

   /*     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        int[] arr2 = new int[array.length];
        int j = 0;
        for (int k : array) {
            if (k != 0) {
                arr2[j] = k;
                j++;
            }
        }
        for (int items : arr2) {
            System.out.print(items + " ");

        }*/
    }
}