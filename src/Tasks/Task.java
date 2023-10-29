package Tasks;

public class Task {
    public static void main(String[] args) {
       /* Person[] person=new Person[5];
        person[0]=new Person(32,"bayram");
        person[1]=new Person(23,"ashraf");

        for(int i=0;i<person.length;i++){
            person[i]=new Person(i,"bayram");
            System.out.println(person[i]);
        }*/

       int count=0;
       for(int i=0;i<=99;i++){
           if(i%2!=0){
               count++;
           }

       }
       int[] arr=new int[count];
        System.out.println(count);
       int j=0;
        System.out.println("ARRAY1");
       for(int i=0;i<=99;i++){
           if(i%2!=0){
               arr[j]=i;
               System.out.print(i+" ");
               j++;
           }
       }
        System.out.println("\n");
        System.out.println("ARRAY2");
       j=0;
       int[] arr2=new int[count];
        System.out.println("length of Array:"+arr2.length);
       /* for(int i=99;i>=0;i--){
            if(i%2!=0){
                arr2[j]=i;
                System.out.print(i+" ");
                j++;
            }
        }*/
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }





    }
}

