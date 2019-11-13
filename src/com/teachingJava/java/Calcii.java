package com.teachingJava.java;
import java.util.Scanner;
public class Calcii {
    public static void main(String[] args) {

        Scanner conconsole= new Scanner(System.in);
        System.out.println("Welcome to Calculator! Our calculator takes only two values and perform Addition, Subtraction, Multiplication and Division between them. ");
        System.out.println("Please enter the FIRST value: ");
        int value1= Integer.parseInt(conconsole.next());
        //System.out.println(5*value1);
        System.out.println("Please enter the SECOND value: ");
        int value2=Integer.parseInt(conconsole.next());
        //System.out.println(value1+value2);

        System.out.println("Please enter any of these operations you would like the calculator to Perform: +, -, *,/");
        String operation=conconsole.next();
        int result=0;
        double divisionResult;
        //Lets write the logic from here
        if(operation.equals("+")){ ;
         result=(value1+value2);
            System.out.println("Addition between two values is: "+result);
        }else if(operation.equals("-")){
         result=(value1-value2);
            System.out.println("Subtraction between two values is:"+result);
        }else if(operation.equals("*")){
            result=(value1*value2);
            System.out.println("Multiplication between two values is:"+result);
        }else if (operation.equals("/")){
           divisionResult=(value1/value2);
            System.out.println("Division between two values is:"+divisionResult);
        }else{
            System.out.println("You have chosen wrong operation. Sorry! better luck next time");
        }

    }
}
