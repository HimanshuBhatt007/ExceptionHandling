package Throws;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){

        ReadAndWrite rw =new ReadAndWrite();
        try{
            rw.readFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("----------");
        try{
            rw.saveFile();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }

        System.out.println("Reached at the end of program");
    }
}
