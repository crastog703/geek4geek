package com.example.geek;

public class PRIME_NUMBER_1 {
    public static void main(String [] args){
       System.out.print( PRIME_NUMBER_1.checkPrimeNumber(0));


    }

    private static Boolean checkPrimeNumber(int i) {
        if(i==0 || i==1){
            return false;
        }
        for(int k=2;k<=Math.sqrt(i);k++){
            if(i%k==0){
                return false;

            }
        }
        return true;
    }
}
