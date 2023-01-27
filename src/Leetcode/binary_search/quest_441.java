package Leetcode.binary_search;

public class quest_441 {
    public static void main(String[] args) {
        long n=234003345;
        long str=1;
        long end=234003345/2;
        while(str<=end){
       long sc=str+(end-str)/2;
          long sum=sc*(sc+1)/2;
            if(sum==n)
            {
                System.out.println((int)sc);
                break;

            }
            if(sum<n)
            {
                str=sc+1;
            }
            if(sum>n)
            {
                end=sc-1;
            }
        }
        System.out.println((int)end);

    }
}
