package Practise;

import java.util.Scanner;

public class Chess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        int starter=0;
        float half=(float)square/(float) 2;
        int starter_half =(int)Math.ceil((float)half);

        for(int i=0;i<num;i++) {

            for (int j=0;j<num;j++) {
                if (i % 2 == 0) {
                    if (j%2==0) {
                        starter++;
                        System.out.print(starter+" ");

                    }
                    else {
                        starter_half++;
                        System.out.print(starter_half+" ");
                    }
                }
                else{
                    if(j%2==0){
                        starter_half++;
                        System.out.print(starter_half+" ");
                    }
                    else{
                        starter++;
                        System.out.print(starter+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
