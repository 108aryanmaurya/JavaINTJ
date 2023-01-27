package DSA_lec_codes.OOPS.OOPS_2.singleton;

public class main {
    public static void main(String[] args) {
//        Singleton obj=new Singleton(); not possible because constructor in singleton is private declared,
//        which means it can be only used in only in its own class
        Singleton obj1=Singleton.getinstance();
//        now an object of singleton is created and only one object of it can be created

        System.out.println(obj1.a);
       Singleton obj2=Singleton.getinstance();
       obj2.a="myn]ame";
        System.out.println(obj2.a);
//        Singleton obj3=new Singleton();

    }
}
