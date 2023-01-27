package DSA_lec_codes.OOPS.OOPS_3_principles0fOOPS.inheritance;

public class box_cost extends boxweight  {
    int cost =15;

    public box_cost(int cost) {

        super();

        this.cost = cost;

    }
    public box_cost(int l,int w,int h,int ww)
    {
        super(l,w,h,ww);

        this.l=l;
        this.w=w;
        this.h=h;
        this.ww=ww;
    }
    public box_cost(boxweight old)
    {
        super(old);
    }
}
