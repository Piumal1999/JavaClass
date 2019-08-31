package Day10;

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(frontBack(str));
    }

    public static String frontBack(String str) {
        if(str.length()>2){
            String s1 = str.substring(0,1);
            String s2 = str.substring(1,str.length()-1);
            String s3 = str.substring(str.length()-1,str.length());
            return s3+s2+s1;
        }else{
            String s1 = str.substring(0,1);
            String s2 = str.substring(1,2);
            return s2+s1;
        }
    }

}