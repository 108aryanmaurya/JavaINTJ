package DSA_lec_codes.OOPS.OOPS_2.Static;

public class Static_inisialisation {
    static int m=9;
    static int b;
     static {
         System.out.println("i will run only once after the creation first oject , at later object i will not run");
     b=3*m;
     }

    public static void main(String[] args) {
//         Static_inisialisation obj=new Static_inisialisation();
        System.out.println(m+" "+b);
      b+=10;
        System.out.println(m+" "+b);
    }

}
