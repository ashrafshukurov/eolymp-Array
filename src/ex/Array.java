package ex;

public class Array {
    public static void main(String[] args) {
    /*    byte[] userages=new byte[9];
        userages[3]=19;
        userages[5]=26;

        for(int i=1;i<9;i+=2){

                System.out.println(i+" "+userages[i]);
        }*/

    /* String[] Month={"January","February","December"};
     for(String ay:Month){
         System.out.println(ay);
     }*/

/*
        byte[] a={11,4,67,23,22,67,89,1};

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.print(sum);

        for (byte x:a) {
            sum+=x;

        }
        System.out.println(sum);
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }*/

        //cox olculu Array multi dimension Array;
                        //0                           1                          2
     //String[][]={{"3 inek","Anchor","Tuchinka"},{"Hicaz","Halal",.....},{"Corekci","Razin"}};
     String[][] products=  {{
             "3 Inek", "Anchor", "Tuchinka"
     },
        {
            "Hicaz", "Halal nemet", "Turqay", "Sevmli Dad", "1000 bereket"
        },
        {
            "Corekci", "Razin"
        }
     };
        /*String[] product=products[0];
        for(String item:product){
            System.out.println(item);
        }*/


       /* for (String[] items:products){
            for (String value:items) {
                System.out.println(value);
            }
            System.out.println("******************");
        }*/


        /*String[][] users=new String[2][];

        String[] female=new String[2];

        female[0]="Konul";
        female[1]="Konul";

        String[] male=new String[3];

        male[0]="Nicat";
        male[1]="lkwejlwk";
        male[2]="lklds";
        users[0]=female;
        users[1]=male;*/

        byte count=0;
        byte[][] bites={{1,0,1,1},{1,1,1,0,0,0},{0,1,0,1,1}};
        for (byte[] topics:bites) {
            for(byte value:topics){
                if(value==1){
                    count++;
                }
            }

        }
        System.out.println("Total count"+count);
        byte s=0;
        for(int i=0;i<bites.length;i++){
            byte[] mark=bites[i];
            for(int j=0;j<mark.length;j++){
                if(mark[j]==1){
                    s++;
                }
            }
        }




    }

}
