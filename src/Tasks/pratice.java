package Tasks;



import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();

        }
    int temp=0;
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }


            }
            for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
        }
}


}
