import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int l = input.length();
        String res = new String("");
        String tmp = new String("");
        for (int i = 0; i < l; i++) {
            tmp = input.substring(i, i + 1);
            if (tmp.equals("A")) {
                res += "T";
            }
            else if (tmp.equals("T")) {
                res += "A";
            }
            else if (tmp.equals("C")) {
                res += "G";
            }
            else {
                res += "C";
            }
        }
        System.out.println(res);
    }
}