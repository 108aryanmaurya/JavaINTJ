package DSA_lec_codes.OOPS.OOPS_3_principles0fOOPS.Polymorphism.CompileTime_Overloading;

public class triangle extends Shapes{
    int base=0;
    int height =0;
    triangle(){
        System.out.println("i ma a triangle - 0 parameter");
    }
    triangle(int base,int height){
        this.base=base;
        this.height=height;
        System.out.println("i am a triangle with base "+base+" and height "+height);
    }

    triangle(triangle first){
        this.base=first.base;
        this.height=first.height;
        System.out.println(base+" "+height);
    }
    triangle(circle first){
        this.base=first.rad;
        this.height=first.dia;
        System.out.println(base+" "+height);
    }
    triangle(String s){
        System.out.println("my name is "+s);
    }
}
