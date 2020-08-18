package com.qa.day7;

public class ExceptionsTask {
    public static void main(String[] args) {
        ExceptionsTask exceptionTask = new ExceptionsTask();
        exceptionTask.method1(3,8);
    }
    public int method1(int a, int b) {
        int c = 0;
        Integer d = b;
        d = 0;
        try {
            c = a / b;
            if (a > b) {
                System.out.println(c);
            } else {
                throw new NewerException("error, cannot divide by greater number");
            }
        }
        catch (NewerException error){
            System.out.println(error.getMessage());
        }
        //catch(ArithmeticException error){
         //   System.out.println("error, cannot " + error.getMessage());
        //}
       // catch(NullPointerException error2){
           // System.out.println("error2, cannot " + error2.getMessage());
        //}
        //catch(Exception error3){
          //  System.out.println("error3, cannot " + error3.getMessage());
        //}


        finally{
            System.out.println(c);
            return c;

        }

    }

}
