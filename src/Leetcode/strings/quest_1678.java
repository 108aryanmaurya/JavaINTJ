package Leetcode.strings;

public class quest_1678 {
    public static void main(String[] args) {
        String sc= "G()(al)";
        sc=sc.replace("()","o");
        sc=sc.replace("(al)","al");

        System.out.println(sc);
    }
}
