package Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {

    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("src/Throws/test.txt");
    }

    void saveFile() throws FileNotFoundException{
        String text = "This is ReadAndWrite data";
        FileOutputStream fos = new FileOutputStream("src/Throws/test.txt");
    }

}
