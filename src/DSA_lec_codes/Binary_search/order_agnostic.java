package DSA_lec_codes.Binary_search;

public class order_agnostic {
    public static void main(String[] args) {
        int[] arr1={-3435,-121,-2,0,1,3,34,56,77,99,123,456,789,897,9876};
        int[] arr2={1234,634,445,123,98,76,65,54,43,32,21,10,4,0,-12,-123,-1245};
        int target=-123;
        int k=order_agnosticBS(arr2,target);
        System.out.println(k);
    }

    static int order_agnosticBS(int[] arr1, int target) {
        int start=0;
        int end= arr1.length-1;

//      checking if array is ascnding or desecnding
        boolean check=arr1[0]<arr1[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr1[mid] == target) {
               return  mid;
            }
            if (check) {
                if (arr1[mid] < target) {
                    start = mid + 1;
                }
                if(arr1[mid]>target)
                {
                    end=mid-1;
                }
            }
            else{
                if (arr1[mid] > target) {
                    start = mid + 1;
                }
                if(arr1[mid]<target)
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
