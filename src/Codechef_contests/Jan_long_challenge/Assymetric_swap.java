package Codechef_contests.Jan_long_challenge;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner.*;
public class Assymetric_swap {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();

//            int l = sc.nextInt();
//        while (t-- > 0) {
//            int[] a = new int[2 * l];
        int[] a = {3, -5 ,3, 3,
                3 ,3,-3 ,3};
        int l=4;
            for (int i = 0; i < 2 * l; i++) {
//                a[i] = sc.nextInt();

            }
            Arrays.sort(a);
            int k = 0;
            int m =  a[2 * l - 1];
            for (int i = 0; i < 2*l - 1; i++) {

                k = a[i + l - 1] - a[i];
                System.out.println(a[i]+" " +a[i + l - 1]);
//                m = a[2 * l - 1];
                if (k < m) {
                   m=k;
                    System.out.println(m);
                }
                if((i+l-1)==2*l-1)
                {
                    break;
                }
            }
                System.out.println(Arrays.toString(a));
            System.out.println(m);
        }
//    }
}
