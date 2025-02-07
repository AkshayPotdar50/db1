package com.atos.deproj.sprint2145.design;

public class StringReversal {
    public static void main(String[] args) {

    }

    public static String reverseString(String str){
        StringBuilder reversed= new StringBuilder();
        for(int i= str.length()-1; i>= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseStringSimple(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
