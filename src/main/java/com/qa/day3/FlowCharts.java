package com.qa.day3;

public class FlowCharts {
    public static int num1 = 6;
    public static int num2 = 9;
    public static boolean numberType = !true;

    public static void main(String[] args) {
        numbers();
    }
    public static int numbers(){
        int result1 = num1 +num2;
        int result2 = num1 * num2;

            if(numberType) {
                System.out.println(result1);
                return(result1);
        }   else {
                System.out.println(result2);
                return(result2);
        }
    }
}
