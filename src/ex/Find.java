package ex;

public class Find {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
       /* int n=arr.length+1;
        int s=n*(n+1)/2;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(s-sum);
*/                    //5
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=1){
                System.out.println(arr[i]-1);
            }
        }
    }
}
