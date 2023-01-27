package Codechef_contests.Jan_long_challenge;

import java.util.Arrays;

public class Symmetric_swap {
    public static void main(String[] args) {
        int l=3;
        int[] a={1 ,5 ,3};
        int[] b={2,3 ,1};
        int m=l-1;
        int n=0;
        for (int i = 0; i < l; i++) {
            if(a[i]<a[m])
            {
                m=i;

            }
            if(a[i]>a[n])
            {

                n=i;
            }
        }
        System.out.println(m);
        System.out.println(n);
        for (int i = 0; i < 23; i++) {
            if (b[n]<a[n])
            {
                int temp=b[n];
                b[n]=a[n];
                a[n]=temp;
            }
            if (b[m]>a[m])
            {
                int temp=b[m];
                b[m]=a[m];
                a[m]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
