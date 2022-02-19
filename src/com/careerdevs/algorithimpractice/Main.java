package com.careerdevs.algorithimpractice;

public class Main {
    public static void main( String [] args){
        System.out.println(reverse("Think different."));
        System.out.println(equal(2, 3, 4));

    }
    public static String reverse(final String str) {
        String reverse = "";
        for(int i = str.length()-1; i >=0 ; i--){
            reverse = reverse +str.charAt(i);
        }
        return reverse;
    }
    public static int equal(int a, int b, int c) {
        if(a == b && a == c){
            return 3;
        }else if ( a!=b && a!= c && b!=c){
            return 0;
        }
        return 2;
    }
}
