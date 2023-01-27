package DSA_lec_codes.OOPS.OOPS_3_principles0fOOPS.inheritance;

public class box {
    int l=3;
    int h=4;
    int w=6;
int ww=123;
    public box() {
        this.l=-10;
        this.w=-56;
        this.h=-23;
    }

    public box(int h,int l,int w) {
        this.h = h;
        this.l = l;
        this.w = w;

    }
    box(box old){
        this.h= old.h;
        this.l= old.l;
        this.w= old.w;

    }

    public  void func(){
        System.out.println("i m running");
    }
}

 class boxweight extends box{
    int ww=-1;

    public boxweight(){
        this.ww=498;
     }
     public boxweight(box next) {
         super(next);
         System.out.println(super.h);
         System.out.println(super.l);

     }
     public boxweight(box_cost next2) {
         super(next2);
         System.out.println(super.h);
         System.out.println(super.l);

     }
     boxweight(int l, int h, int w, int ww ){
        super(h,l,w);
        super.ww=ww;
        //System.out.println(super
          //      .ww);
        //System.out.println(this.ww);
        super.l=l;


    }

}