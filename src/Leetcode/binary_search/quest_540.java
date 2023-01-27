package Leetcode.binary_search;

public class quest_540 {

        public static void main(String args[]){
            int[] a={1,1,3,3,7,4,4};

            int s=0;
            int e=a.length-1;
            while(s<e)
            {

                int mid=s+(e-s)/2;

                if((mid%2==1&&a[mid]==a[mid-1])||(mid%2==0&&a[mid]==a[mid+1]))
                {
                    s=mid+1;
                }
                else{
                    e=mid;
                }
            }
//            return a[s];
            System.out.println(a[s]);


    }
}
