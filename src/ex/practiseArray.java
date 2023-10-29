package ex;

import java.util.Scanner;

public class practiseArray {
    public static void main(String[] args) {
        //primitive non-primitive
        Scanner sc=new Scanner(System.in);
        int[] a;
        a=new int[5];//reference 0 1 2 3 4
     /*   for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
*/

        a[0]=10;
        a[1]=20;
        a[2]=3;
        a[3]=34;
        a[4]=89;
        String[] arrayname={"bayram","serxan","kenan"};


//        int b[]=new int[7];
      /*  System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }*/

        for (String s:arrayname) {
            System.out.println(s);

        }


    }
}
