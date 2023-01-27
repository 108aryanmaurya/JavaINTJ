package DSA_lec_codes.OOPS.OOPS_2.Static;
public class static_innerclass {

int c=9;
    static class test{
        String name;
        public test(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        static_innerclass b=new static_innerclass();
        System.out.println(b.c);
//        b.test c=new test("sddsf"); wrong way

        static_innerclass.test a=new static_innerclass.test("aryan");
        System.out.println(a.name);


    }


}
