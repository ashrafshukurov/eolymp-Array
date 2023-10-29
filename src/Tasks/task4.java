package Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number\n");

        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)+" ");
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1]>arr[i]){
                System.out.println("Uygundur");

            }
           if(arr[i+1]<arr[i]){
                System.out.println("it is break");
               break;
            }


        }


    }
}
