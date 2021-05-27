package com.example.geek;

import java.util.ArrayList;
import java.util.List;

public class Sieve_of_Eratosthenes_2 {
    public static void main(String [] args){
        System.out.print( Sieve_of_Eratosthenes_2.printPrimeNumber(11));


    }

    private static List<Integer> printPrimeNumber(int i) {
        List<Integer>a=new ArrayList<>();
        boolean[] prime=new boolean[i+1];

        for(int k=0;k<prime.length;k++)
            prime[k]=true;


        for(int k=2;k<=Math.sqrt(i);k++){
            for(int j=k*k;j<i;j+=k){
                prime[j]=false;
            }
        }
        for(int k=2;k<=i;k++){
            if(prime[k]==true){
                System.out.println(k);
                a.add(k);
            }
        }

        return a;
    }

}

