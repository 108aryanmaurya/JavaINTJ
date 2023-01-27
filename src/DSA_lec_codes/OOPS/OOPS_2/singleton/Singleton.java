package DSA_lec_codes.OOPS.OOPS_2.singleton;

public class Singleton {
//    singleton  class means , a class of which only a single object can be created
//    in order to make to a single ton class, the user should be able to call constructor only once
    String a="sfsd";
     private Singleton(){
       this.a="aryan";
     }
     Singleton instance;
     public static Singleton getinstance(){
         Singleton o=new Singleton();
         if (o.instance==null)
         {
             o.instance=new Singleton();
         }
         return o.instance;
     }

}
