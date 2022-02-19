package com.careerdevs.algorithimpractice;

public class Main {
    public static void main( String [] args){
        System.out.println(reverse("Think different."));
        System.out.println(equal(2, 3, 4));
        System.out.println(countTrue(new boolean[] { false, false, false, false }));

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
    public static int countTrue(boolean[] arr) {
        int countNum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == true ){
                countNum++;
            }

        }
        return countNum;
    }
}
