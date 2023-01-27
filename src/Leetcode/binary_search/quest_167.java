package Leetcode.binary_search;

public class quest_167 {
    public static void main(String[] args) {
        int []arr={2,4,6,7,9,12,34,45,66,67,87};
        int t=46;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<t)
            {
        int[] a=new int[2];
                int nt=t-arr[i];
                int s=i;
                int e=arr.length-1;
                while(s<=e)
                {
                    int m=s+(e-s)/2;
                    if(arr[m]==nt)
                    {
//                        a[0]=i;
//                        a[1]=m;
//                        break;
                         System.out.println(m);


                    }
                    if (arr[m]<nt)
                    {
                        s=m+1;
                    }
                    if (arr[m]>nt)
                    {
                        e=m-1;
                    }
                }

//        System.out.println(a[0]+" "+a[1]);
            }
        }
//        return a;
    }
}
