package DSA_lec_codes.OOPS.OOPS_3_principles0fOOPS.Polymorphism.CompileTime_Overloading;

public class circle extends Shapes{
 int rad=12;
 int dia=rad*2;
 circle(int rad){
     this.rad=rad;
 }
//method overloading or compile time polymorphism
    public static void main(String[] args) {
     circle first=new circle(12);
        triangle first1=new triangle(23,34);
        triangle sec=new triangle("richard parker");

        triangle third=new triangle(first);
        System.out.println(third.base +" "+ third.height);
        triangle four=new triangle(first);
        System.out.println(four.base +" "+ four.height);

    }
}
