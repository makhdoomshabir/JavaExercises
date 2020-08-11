package com.qa.day2;

import java.sql.SQLOutput;

public class Exercise1 {

    public static void main(String[] args) {
        resultsThreeIntegers();
        
    }

        public static int resultsThreeIntegers (){
            int num1 = 3;
            int num2 = 4;
            int num3 = 20;
            int result1 = num1 + num2;
            int result2 = num1 * num2;
            int result3 = num3 / num2;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);

                if(num3 < num2) {
                    System.out.println(result3);
                    return result3;

                } else {
                    System.out.println("DIVISION CANNOT BE PERFORMED");
                    return 0;
                }

        }
}
