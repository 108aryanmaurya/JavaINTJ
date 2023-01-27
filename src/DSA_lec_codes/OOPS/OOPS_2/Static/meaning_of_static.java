package DSA_lec_codes.OOPS.OOPS_2.Static;

public class meaning_of_static {
    public static void main(String[] args) {
//        func();
//        in above call i cannot access func() because it is not static ,
//        a static can only acces static methods or vars
//        a non satic can only be accessed in a static method by creating a instance of its class

//        way to acces func is
        meaning_of_static first=new meaning_of_static();
        first.func();

        meaning_of_static.func2();

    }
    static void func2(){
//        same as psvm i cannot access func here too
//        func();
//        but can acces through
        meaning_of_static first=new meaning_of_static();
        first.func();
    }
    void func(){
        System.out.println("hello");
        greet();
//        func amd greet they both need a object so they both come together
//        so that only by creation of func object in static method, both can run
    }
    void greet(){
        System.out.println(
                "good morning"
        );
    }
}
