package Tasks;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        a[0]=0;
        a[1]=1;
        System.out.print(a[0]+" "+a[1]+" ");
        int sum=0;
        for (int i=2;i<a.length;i++){
            a[i]=a[i-2]+a[i-1];//0 1 1 2 3 5 8 13
            System.out.print(a[i]+" ");
            sum+=a[i];
        }
        System.out.println();
        System.out.println("Last Number: "+a[n-1]);

        sum+=1;
        //Sum
        System.out.println("Sum: "+sum);
        //
        double avarage=(double)sum/n;
        System.out.println("Avarage: "+avarage);
        int min=a[0];
        System.out.println("Min: "+min);
        int max=a[0];
        for(int i=2;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max: "+max);






    }


}
