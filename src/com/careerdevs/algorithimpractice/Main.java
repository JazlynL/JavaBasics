package com.careerdevs.algorithimpractice;

public class Main {
    public static void main( String [] args){
        System.out.println(reverse("Think different."));

    }
    public static String reverse(final String str) {
        String reverse = "";
        for(int i = str.length()-1; i >=0 ; i--){
            reverse = reverse +str.charAt(i);
        }
        return reverse;
    }
}
