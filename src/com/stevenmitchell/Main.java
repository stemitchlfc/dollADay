package com.stevenmitchell;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int total = 0;
        for(int i = 1; i<=365; i++){
            total += i;
            System.out.println(i + " " +total);
        }
        System.out.println(total);
    }
}
