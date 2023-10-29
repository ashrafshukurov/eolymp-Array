package Practise;

import java.util.Scanner;

public class Elementtapmaq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sayi istenilen eded");
        int x=sc.nextInt();
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);






        }
    }


