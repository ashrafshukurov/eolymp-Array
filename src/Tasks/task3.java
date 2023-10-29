package Tasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
     /*
     0,1,1,2,3,5,8,13   
      */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];


        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<arr.length;i++) {
            arr[i] = arr[i - 2] + arr[i - 1];//0 1 1 2 3 5
            System.out.print(arr[i] + " ");
        }
        /*
        fibonnacide bunlarin cemi
        orta avarage
        ve sonuncu elementi tapmaq
        min max tapmaq
         */

        
        
        
        
    }
}
