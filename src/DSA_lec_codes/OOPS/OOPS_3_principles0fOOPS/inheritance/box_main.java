package DSA_lec_codes.OOPS.OOPS_3_principles0fOOPS.inheritance;

public class box_main {
    public static void main(String[] args) {
//        box box1=new box();
//            System.out.println((box1.h));
//        box box2=new box(box1);
//        System.out.println(box2.l);

        boxweight box3=new boxweight(12,34,5,6);
        System.out.println(box3.h);
        System.out.println(box3.l);
        System.out.println(box3.ww);
        System.out.println(box3.w);

//        box box4=new boxweight(2,3,4,4);
//
//        System.out.println(box4.h);
//        System.out.println(box4.l);
//        System.out.println(box4.w);
//        System.out.println(box4.ww); not able to acces because ref type is box and box has no idea of weight

//       boxweight box5=new box(); this will show error because in boxweight l w h are not initialised and boxweight is ref type
//        System.out.println(box5.h);
//
//        boxweight next=new boxweight(box3);
//      box next2=new boxweight(box3);

        box_cost bc=new box_cost(345);
        System.out.println(bc.cost);
        System.out.println(bc.h);
        System.out.println(bc.w);
        System.out.println(bc.l);
        System.out.println(bc.ww);


        box_cost bc2=new box_cost(9,7,6,5);
        System.out.println(bc.cost);
        System.out.println(bc.h);
        System.out.println(bc.w);
        bc.l=242;
        System.out.println(bc.l);

        System.out.println(bc.ww);
        boxweight nebc=new box_cost(2);

    }
}
