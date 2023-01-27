package Leetcode.binary_search;

import java.util.Arrays;

class quest_852 {
    public static void main(String[] args) {

    int [] arr={23,69,100,79,78,67,25,22,14,10};
        int s=0;
        int e=arr.length;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]<arr[m+1])
            {
                s=m+1;
            }
            if(arr[m]>arr[m+1])
            {
                e=m-1;
            }
        }
        System.out.println(s);

    }
}
