package ex;

public class Ex2 {
    public static void main(String[] args) {
       /* int[][] arr={{1,0,1,0,1,1},{0,0,1,0},{1,1,0}};
        *//*
        1 0 1 0 1 1
        0 0 1 0
        1 1 0
         *//*
        int count=0;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                  count++;
                }
            }
        }
        System.out.println(count);
*/
/*
        byte count=0;
        byte[][] bites={{1,0,1,1},{1,1,1,0,0,0},{0,1,0,1,1}};
        for (byte[] topics:bites) {
            System.out.println(topics);
            for(byte value:topics){
                if(value==1){
                    count++;
                }
            }

        }*/
        byte[][] bites={{1,0,1,1},{1,1,1,0,0,0},{0,1,0,1,1}};
        byte s=0;
        for(int i=0;i<bites.length;i++){

            byte[] mark=bites[i];
            System.out.println(mark[i]);
            System.out.println(mark.length);
            for(int j=0;j<mark.length;j++){
                System.out.print(mark[j]);

                if(mark[j]==1){

                    s++;
                }
            }
            System.out.println("***************");
        }
    }

}
