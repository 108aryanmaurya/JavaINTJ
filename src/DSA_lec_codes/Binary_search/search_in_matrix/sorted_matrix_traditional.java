package DSA_lec_codes.Binary_search.search_in_matrix;

import java.util.Arrays;

public class sorted_matrix_traditional {

    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int target=10;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static  int[] simpleBinarySearch(int [][]arr,int row,int cstart,int cend,int target) {
        while (cstart <= cend)
        {
           int mid=cstart+(cend-cstart)/2;
           if(arr[row][mid]==target)
           {
               return new int[]{0,mid};

           }
           if (arr[row][mid]>target)
           {
               cend=mid-1;
           }
           else {
               cstart=mid+1;
           }
        }
        return new int[]{-1,-1};
    }
    private static int[] search(int[][] arr, int target)  {
             int row =arr.length;
             int cols=arr[0].length;
             if(row==1)
             {
                 return simpleBinarySearch(arr,0,0,cols-1,target);
             }

            int mcols=cols/2;
             int rstart=0;
             int rend=arr.length-1;
             while(rstart<rend-1)
             {
                 int mid=rstart+(rend-rstart)/2;
                 if(arr[mid][mcols]==target)
                 {
                     return new int []{mid,mcols};
                 }

             }

    return new int[]{2,2};}

}
