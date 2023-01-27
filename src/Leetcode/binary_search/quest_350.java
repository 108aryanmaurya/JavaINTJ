package Leetcode.binary_search;

import java.util.Arrays;

public class quest_350 {
    public static void main(String[] args) {
        int[] n1={5,7,3,4,4,5,6,6};
        int[] n2={7,3,4};
//int[] s1=n2;
//        System.out.println(Arrays.toString(s1));

int [] ar=intersect(n1,n2);
//        System.out.println(Arrays.toString(intersect(n1,n2)));
        System.out.println(Arrays.toString(ar));
    }
   static int[] intersect(int[] n1, int[] n2) {
        int k=0;
        int[] arr=new int[n1.length+n2.length];
        // if(n1.length>n2.length)
        // {

        for(int i=0;i<n2.length;i++)
        {
            int  t=n2[i];
            Arrays.sort(n1);
            int s=0;
            int e=n1.length-1;
            while(s<=e)
            {
                int m=s+(e-s)/2;
                if(n1[m]==t)
                {
                    arr[k]=n1[m];
                    k++;

                    n1[m]=-1;
                    break;
                }
                if(n1[m]<t)
                {
                    s=m+1;
                }
                if(n1[m]>t)
                {
                    e=m-1;
                }
            }
        }
        int[] arr1=new int[k];
        for(int j=0;j<k;j++)
        {
            arr1[j]=arr[j];

        }

        return arr1;
    }
}
