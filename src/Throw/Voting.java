package Throw;

import java.util.Scanner;

public class Voting {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");

        int age = sc.nextInt();
        try{
            if(age<18){
                throw new YoungerAgeException("You are not eligible to vote");// there should be no statement after throw keyword
            }else{
                System.out.println("You are eligible to vote");
            }
        }catch(YoungerAgeException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("In finally block");
        }

    }
}

// throw keyword is used only to create an exception object and that exception object goes to JVM and JVM asks main method if he's handling the exception.
// if we write any statement after throw keyword our program won't be compiled. and will provide unreachable statement error.
// throw keyword doesn't handle exception, this is what we have to do manually by using try catch block.