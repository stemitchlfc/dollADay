package com.stevenmitchell;

public class Main {

    public static void main(String[] args) {
	    int weekAmount = dollarADay(7);
        System.out.println(weekAmount);
        int monthAmount = dollarADay(28);
        System.out.println(monthAmount);
        int halfYearAmount = dollarADay(180);
        System.out.println(halfYearAmount);
        int yearAmount = dollarADay(365);
        System.out.println(yearAmount);
        int leapYear = dollarADay(366);
        System.out.println(leapYear);
    }
    public static int dollarADay(int days){
        int total = 0;
        for(int i = 1; i<=days; i++){
            total += i;
        }
        return total;
    }



}
