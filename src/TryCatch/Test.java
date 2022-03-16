package TryCatch;

import java.io.FileInputStream;

public class Test {
    public static void main(String args[])   {

//        Compile Time Exception
//        try{
//            FileInputStream fis = new FileInputStream("src/test.txt");
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//        Run Time Exception
//        int a = 100, b = 0, c = 0;
//        c = a/b;
//        System.out.println(c);

//        String str = null;
//        System.out.println(str.length());

//        try{
//            FileInputStream fis = new FileInputStream("src/TryCatch/test.txt");
//        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("File does not exist");
//        }

        try{
            int a = 100, b = 0, c= 0;
            c = a/b;
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace(); // gives exception name, description, stack trace
            System.out.println(e); // gives exception name & description
            System.out.println(e.toString()); // gives exception name & description
            System.out.println(e.getMessage()); // gives only description
            System.out.println("Cannot divide by zero ");
        }

    }
}
