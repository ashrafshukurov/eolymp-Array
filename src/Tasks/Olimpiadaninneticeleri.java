package Tasks;

import java.util.Scanner;

public class Olimpiadaninneticeleri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int temp=0;
        int[] arr=new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


}
