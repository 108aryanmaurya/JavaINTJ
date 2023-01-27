package DSA_lec_codes.OOPS.OOPS_2.Static;

import org.jetbrains.annotations.Contract;

class humans{
    int age=23;
    String name;
    int salary;
    static long population;

//     public humans(int age,String name,int salary){
//         this.age=age;
//         this.name=name;
//         this.salary=salary;
//         humans.population+=1;
//
//    }
    static void func3(){
//        System.out.println(this.age); not possible
        humans sec=new humans();

        System.out.println(sec.age);

    }

}
public class static1 {
    public static void main(String[] args) {

    }
}
