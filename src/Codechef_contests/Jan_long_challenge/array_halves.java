package Codechef_contests.Jan_long_challenge;

import java.util.Arrays;

public class array_halves {
    public static void main(String[] args) {
int l=3;
//{4,5,4,2,6,8};{1,2,3,4,5,6};{6,5,4,3,2,1};
        int [] a={6,5,4,3,2,1};
        int k=0;
        int s=0;
//        int []a1=new int[l];
//            a1[i]=a[i];
//        Arrays.sort(a1);
//        System.out.println(m);
        int g=0;

        for (int i = 0; i < l; i++) {

        int m=a[0];
        int b=a[l];

        for (int o = 0; o < l; o++) {
            if(a[o]>m)
            {
                m=a[o];
                s=o;
            }
        }

            for (int n = 0; n < l; n++) {
                if(a[n+l]<b)
                {
                    b=a[n+l];
                    g=n+l;
                }
            }
            System.out.println(m +" "+s);
            System.out.println(b +" "+g);
//            for (int j = 0; j < l; j++) {

            if(a[s]>a[g]){
              k+=g-s;
//                System.out.println(k);
          int temp=a[g];
          a[g]=a[s];
          a[s]=temp;
//               break;
//            }


            }
            else {

            continue;
            }
//            System.out.println(k);
        }
            System.out.println(k);
        System.out.println(Arrays.toString(a));
    }
}
