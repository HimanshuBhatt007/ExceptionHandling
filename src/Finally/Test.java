package Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String args[]) throws IOException  {

//        try{
//            int a = 100, b = 2, c;
//            c = a/b;
//            System.out.println(c);
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("In finally block");
//        }

//        try{
//            int a = 100, b = 0, c;
//            c = a/b;
//            System.out.println(c);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("In finally block");
//        }

//        try{
//            int a = 100, b = 2, c;
//            c = a/b;
//            System.out.println(c);
//        }
//        finally {
//            System.out.println("In finally block");
//        }

//        try{
//            int a = 100, b = 0, c;
//            c = a/b;
//            System.out.println(c);
//        }
//        finally {
//            System.out.println("In finally block");
//        }

        FileInputStream fis = null;

        try{
            fis = new FileInputStream("src/Finally/test.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found");
        }
        finally{ // Finally block is used for clean up codes, mean it is used to close resources that are not in use.
            if(fis!=null) {
                fis.close();
            }
            System.out.println("File Closed");
        }








    }
}
