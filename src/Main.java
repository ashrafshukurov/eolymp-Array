import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


     User.compname="Pasha Pank";
     User u=new User();
        System.out.println(User.compname);
     u.foo1();
     u.name="Ashraf";
        System.out.println(u.name);
        System.out.println(User.compname);
        User u2=new User();
        u2.name="KAMAL";
        u2.compname="ATL";
        System.out.println(User.compname);
        System.out.println(u.name);

    }
}